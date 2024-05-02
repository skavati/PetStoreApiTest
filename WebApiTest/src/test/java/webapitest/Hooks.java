package webapitest;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.aventstack.extentreports.ExtentReports;
import common.baselib.BaseMethods;
import common.toolbox.report.ExtentReport;
import common.utilities.FileUtils;
import common.utilities.StringUtils;
import common.utilities.XMLUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.response.Response;
import webapitest.methods.CommonMethods;

public class Hooks {
	private static boolean isBeforeRun = false;
	private static final Logger LOGGER = LogManager.getLogger(CommonMethods.class);

	@Before("@webapitest") // cucumber "before annotation"
	public void beforeAll() throws Exception {
		// LOGGER.debug("LOGGER msg: Before all");
		// to initialize scenario no to "1" before every cucumber scenario
		CommonMethods.setScenarioNo(1);
		// to initialize step fail to false before every cucumber scenario
		CommonMethods.setStepFail(false);
		// to intialize LoggerOnSkip
		CommonMethods.setLoggerOnSkip(true);
		CommonMethods.setException(null);
		CommonMethods.setScenarioResult(true);

		if (!isBeforeRun) {
			Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
				public void run() {
					// to close extent report
					// this will run only once for whole jvm process
					CommonMethods.getExtentReport().flush();
					LOGGER.info("Extent report generated");
					//CommonPage.getChromeDriverService().stop();
					//LOGGER.info("ChromeDriverSerivice stopped");

					// To replace absolute path with relative in test report html file String
					String extentReportPath = XMLUtils.getNodeText(CommonMethods.getConfigPath(), "ExtentReportFile");
					if (extentReportPath.contains("{")) {
						// to replace {user_home} or {user_dir} with absolute path
						try {
							extentReportPath= StringUtils.replaceWithReflection(extentReportPath,
									"common.utilities.SystemUtils", "{", "}");							
						} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
							
						}						
						
					}
					
				}
			}));

			isBeforeRun = true;
			// setting test data file from project variables
			String configPath = FileUtils.findFullPath(System.getProperty("user.dir"), "config.xml");
			CommonMethods.setConfigPath(configPath);
			String extentReportPath = XMLUtils.getNodeText(configPath, "ExtentReportFile");
			if (extentReportPath.contains("{")) {
				// to replace {user_home} with C:\Users\C70032
				String newPath = StringUtils.replaceWithReflection(extentReportPath, "common.utilities.SystemUtils",
						"{", "}");
				extentReportPath = newPath;
			}
			// to set elementWait (implicit wait for all page objects)
			CommonMethods.setElementWait(Integer.valueOf(XMLUtils.getNodeText(configPath, "ElementWait")));
			// To get "TestReport" directory path
			String testReportPath = FileUtils.getParentDirectoryFullPath(extentReportPath, "TestReport");
			CommonMethods.setTestReportDirPath(testReportPath);
			ExtentReport.setConfigPath(configPath);
			LOGGER.info("Config file path:" + configPath);

			String testDataDir = XMLUtils.getNodeText(configPath, "TestDataDir");
			if (testDataDir.contains("{")) {
				testDataDir = StringUtils.replaceWithReflection(testDataDir, "common.utilities.SystemUtils", "{", "}");
			}
			CommonMethods.setTestDataDir(testDataDir);
			// starting extent report
			ExtentReports report = ExtentReport.getExtentReport();
			CommonMethods.setExtentReport(report);
			LOGGER.info("Extent report started");
			
		}
	}

	@After("@tearDown and @webapitest")
	public void tearDown() throws Exception {
		if (!(CommonMethods.getWebDriver() == null)) { 
			// to close chrome\ie browser window
			//CommonPage.getWebDriver().close();
			LOGGER.info("********* || Closing WebDriver || *********");
		}
	}
}
