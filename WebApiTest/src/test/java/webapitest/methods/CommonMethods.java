package webapitest.methods;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.logging.log4j.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.xml.sax.SAXException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.azure.data.tables.TableServiceClient;
import com.azure.data.tables.TableServiceClientBuilder;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.Session;

import atu.testrecorder.ATUTestRecorder;
import common.baselib.BaseMethods;
import common.constants.GlobalConstants;
import common.toolbox.report.ExtentReport;
import common.toolbox.selenium.Element;
import common.toolbox.selenium.Waits;
import common.toolbox.sikuli.Sikuli;
import common.toolbox.winium.Winium;
import common.utilities.CSVUtils;
import common.utilities.ExcelUtils;
import common.utilities.FileUtils;
import common.utilities.StringUtils;
import common.utilities.SystemUtils;
import common.utilities.VideoUtils;
import common.utilities.WordUtils;
import common.utilities.XMLUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class CommonMethods {

	static /*
			 * public Common_Page(WebDriver webDriver) { super(webDriver); }
			 */
	VideoUtils videoUtils = new VideoUtils();
	public static String feature = "";
	static WebDriver webDriver;
	static String sheet = "";
	// static String feature;
	static String firstScenario;
	// static String scenario;
	public static String scenario = "";
	static String repeat;
	static Integer scenarioNo;
	static Integer scenarioCount;
	public static ExtentReports extentReport;
	static ExtentTest extentFeature;
	static ExtentTest extentScenario;
	static ExtentTest extentScenarioNo;
	static boolean stepFail;
	static String testDataFile;
	static String stepInfo = "";
	static boolean isLoggerOnSkip;
	static ChromeDriverService chromeDriverService;
	static String exception;
	static boolean scenarioResult;
	static String testSummaryDoc;
	static Integer totalPass;
	static Integer totalScenarios;
	static Integer testSummaryRowNo;
	static String testSummaryException;
	static String imgPathOnFail;
	static String configPath;
	public static boolean finalResult;
	static String testReportDirPath;
	public static int elementWait;
	static boolean sameDataRepeat;
	static Integer repeatNo;
	static String csvFileName = "";
	static String testDataDir;
	static String clientId = "947b6c03-6bc8-4b20-900a-ecfdb9324192";
	static String redirectUri = "https://jwt.ms";
	static String scope = "https://credablb2cuat.onmicrosoft.com/947b6c03-6bc8-4b20-900a-ecfdb9324192/user_impersonation";
	static String token;
	static String invalidToken;
	
	public static String getToken() {
		return token;
	}

	public static void setToken(String token) {
		CommonMethods.token = token;
	}

	public static String getInvalidToken() {
		return invalidToken;
	}

	public static void setInvalidToken(String invalidToken) {
		CommonMethods.invalidToken = invalidToken;
	}

	public static ChromeDriverService getChromeDriverService() {
		return chromeDriverService;
	}

	public static void setChromeDriverService(ChromeDriverService chromeDriverService) {
		CommonMethods.chromeDriverService = chromeDriverService;
	}

	public static WebDriver getWebDriver() {
		return webDriver;
	}

	public static void setWebDriver(WebDriver webDriver) {
		CommonMethods.webDriver = webDriver;
	}

	public static String getSheet() {
		return sheet;
	}

	public static void setSheet(String sheet) {
		CommonMethods.sheet = sheet;
	}

	public static String getScenario() {
		return scenario;
	}

	public static void setScenario(String scenario) {
		CommonMethods.scenario = scenario;
	}

	public static String getRepeat() {
		return repeat;
	}

	public static void setRepeat(String repeat) {
		CommonMethods.repeat = repeat;
	}

	public static String getFeature() {
		return feature;
	}

	public static void setFeature(String feature) {
		CommonMethods.feature = feature;
	}

	public static String getFirstScenario() {
		return firstScenario;
	}

	public static void setFirstScenario(String firstScenario) {
		CommonMethods.firstScenario = firstScenario;
	}

	public static Integer getScenarioNo() {
		return scenarioNo;
	}

	public static void setScenarioNo(Integer scenarioNo) {
		CommonMethods.scenarioNo = scenarioNo;
	}

	public static Integer getScenarioCount() {
		return scenarioCount;
	}

	public static void setScenarioCount(Integer scenarioCount) {
		CommonMethods.scenarioCount = scenarioCount;
	}

	public static ExtentReports getExtentReport() {
		return extentReport;
	}

	public static void setExtentReport(ExtentReports extentReport) {
		CommonMethods.extentReport = extentReport;
	}

	public static ExtentTest getExtentFeature() {
		return extentFeature;
	}

	public static void setExtentFeature(ExtentTest extentFeature) {
		CommonMethods.extentFeature = extentFeature;
	}

	public static ExtentTest getExtentScenario() {
		return extentScenario;
	}

	public static void setExtentScenario(ExtentTest extentScenario) {
		CommonMethods.extentScenario = extentScenario;
	}

	public static ExtentTest getExtentScenarioNo() {
		return extentScenarioNo;
	}

	public static void setExtentScenarioNo(ExtentTest extentScenarioNo) {
		CommonMethods.extentScenarioNo = extentScenarioNo;
	}

	public static boolean isStepFail() {
		return stepFail;
	}

	public static void setStepFail(boolean stepFail) {
		CommonMethods.stepFail = stepFail;
	}

	public static String getTestDataFile() {
		return testDataFile;
	}

	public static void setTestDataFile(String testDataFile) {
		CommonMethods.testDataFile = testDataFile;
	}

	public static String getStepInfo() {
		return stepInfo;
	}

	public static void setStepInfo(String stepInfo) {
		CommonMethods.stepInfo = stepInfo;
	}

	public static boolean isLoggerOnSkip() {
		return isLoggerOnSkip;
	}

	public static void setLoggerOnSkip(boolean isLoggerOnSkip) {
		CommonMethods.isLoggerOnSkip = isLoggerOnSkip;
	}

	public static String getException() {
		return exception;
	}

	public static void setException(String exception) {
		CommonMethods.exception = exception;
	}

	public static boolean isScenarioResult() {
		return scenarioResult;
	}

	public static void setScenarioResult(boolean scenarioResult) {
		CommonMethods.scenarioResult = scenarioResult;
	}

	// Test Summary implementation
	public static String getTestSummaryDoc() {
		return testSummaryDoc;
	}

	public static void setTestSummaryDoc(String testSummaryDoc) {
		CommonMethods.testSummaryDoc = testSummaryDoc;
	}

	public static Integer getTotalPass() {
		return totalPass;
	}

	public static void setTotalPass(Integer totalPass) {
		CommonMethods.totalPass = totalPass;
	}

	public static Integer getTotalScenarios() {
		return totalScenarios;
	}

	public static void setTotalScenarios(Integer totalScenarios) {
		CommonMethods.totalScenarios = totalScenarios;
	}

	public static Integer getTestSummaryRowNo() {
		return testSummaryRowNo;
	}

	public static void setTestSummaryRowNo(Integer testSummaryRowNo) {
		CommonMethods.testSummaryRowNo = testSummaryRowNo;
	}

	public static String getTestSummaryException() {
		return testSummaryException;
	}

	public static void setTestSummaryException(String testSummaryException) {
		CommonMethods.testSummaryException = testSummaryException;
	}

	public static String getImgPathOnFail() {
		return imgPathOnFail;
	}

	public static void setImgPathOnFail(String imgPathOnFail) {
		CommonMethods.imgPathOnFail = imgPathOnFail;
	}

	public static String getConfigPath() {
		return configPath;
	}

	public static void setConfigPath(String configPath) {
		CommonMethods.configPath = configPath;
	}

	public static boolean isFinalResult() {
		return finalResult;
	}

	public static void setFinalResult(boolean finalResult) {
		CommonMethods.finalResult = finalResult;
	}

	public static String getTestReportDirPath() {
		return testReportDirPath;
	}

	public static void setTestReportDirPath(String testReportDirPath) {
		CommonMethods.testReportDirPath = testReportDirPath;
	}

	public static int getElementWait() {
		return elementWait;
	}

	public static void setElementWait(int elementWait) {
		CommonMethods.elementWait = elementWait;
	}

	// @Before imgPathOnFail
	public void setup() throws Throwable {
		// Video.startRecording();
	}

	public static boolean isSameDataRepeat() {
		return sameDataRepeat;
	}

	public static void setSameDataRepeat(boolean sameDataRepeat) {
		CommonMethods.sameDataRepeat = sameDataRepeat;
	}

	public static Integer getRepeatNo() {
		return repeatNo;
	}

	public static void setRepeatNo(Integer repeatNo) {
		CommonMethods.repeatNo = repeatNo;
	}

	public static String getCsvFileName() {
		return csvFileName;
	}

	public static void setCsvFileName(String csvFileName) {
		CommonMethods.csvFileName = csvFileName;
	}

	public static String getTestDataDir() {
		return testDataDir;
	}

	public static void setTestDataDir(String testDataDir) {
		CommonMethods.testDataDir = testDataDir;
	}

	private static final Logger LOGGER = LogManager.getLogger(CommonMethods.class);

	private static String get_Excel_cell_data(String columnName) throws Exception {
		// Get cell value
		scenario = CommonMethods.getScenario();
		Integer scenarioNo = CommonMethods.getScenarioNo();
		String sheet = CommonMethods.getSheet();
		String cell_value = ExcelUtils.getRepeatedCellData(CommonMethods.getTestDataFile(), sheet, scenario, scenarioNo,
				columnName);
		return cell_value;
	}

	public static boolean close_the_browser() {
		try {
			if (!(CommonMethods.getWebDriver() == null)) {
				// Common_Page.getWebDriver().close();
				CommonMethods.getWebDriver().quit();
			}
			return true;
		} catch (Exception e) {
			LOGGER.error("Step: Navigation|| Close the browser || Fail\n" + e);
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public void setupScenario(String csvFile, String feature, String scenario) throws Exception {
		LOGGER.info(
				"CSV file is :" + csvFile + "******Feature Name***" + feature + "******Scenario Name***" + scenario);
		// if (!(CommonPage.csvFileName == null) &&
		// !CommonPage.csvFileName.contentEquals(csvFileName)) {
		setCsvFileName(csvFile);
		setTestDataFile(testDataDir + "\\" + csvFileName + ".csv");
		// }
		if (!CommonMethods.feature.contentEquals(feature)) {
			setFeature(feature);
		}
		if (!CommonMethods.scenario.contentEquals(scenario)) {
			setScenario(scenario);
		}
	}

	// launch url for repeated_scenario
	public void launchURL() {
		try {
			String url = getCSVData("URL");
			String browser = getCSVData("Browser");

			switch (browser.toLowerCase()) {
			case "ie":
				WebDriver driver = BaseMethods.getDriver("ie");
				setWebDriver(driver);
				break;
			case "firefox":
				driver = BaseMethods.getDriver("firefox");
				setWebDriver(driver);
				break;
			case "chrome":
				driver = BaseMethods.getChromeDriver(chromeDriverService);
				setWebDriver(driver);
				break;
			default:
				// if browser not mentioned in excel then use firefox
				driver = BaseMethods.getDriver("chrome");
				setWebDriver(driver);
				break;
			}
			webDriver.get(url);
			webDriver.manage().window().maximize();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.warn("Error occured while getting the URL\n" + e);

		}
	}

	public static void ChangeProxySettings(WebElement element) throws FindFailed {
		try {
			String path = System.getProperty("user.dir") + "\\SikuliImages\\";
			// to simulate 'Alt+t' and 'o' to get "internet options"
			String press = Keys.chord(Keys.ALT, Keys.chord("t"));
			element.sendKeys(press);
			element.sendKeys(Keys.chord("o"));
			// To simulate button clicks using Sikuli image icons
			Sikuli.clickElement(path + "tab_Connections.PNG");
			Sikuli.clickElement(path + "btn_LANSettings.PNG");
			Sikuli.clickElement(path + "chk_UseAutomaticConfig.PNG");
			Sikuli.clickElement(path + "chk_UseAProxyServer.PNG");
			Sikuli.clickElement(path + "btn_Ok_LANSettings.PNG");
			Sikuli.clickElement(path + "btn_Ok_LANSettings.PNG");
			Waits.waitInSeconds(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.warn("Error occured while changing proxy\n" + e);

		}
	}

	public static String TakeScreenShot() throws GeneralLeanFtException, InterruptedException, Exception {
		String imgPath = null;
		// take screen shot of browser window
		// and save image file in imgPath
		imgPath = BaseMethods.getSnap(getWebDriver());

		return imgPath;

	}

	public static String TakeScreenShot(WebDriver driver)
			throws GeneralLeanFtException, InterruptedException, Exception {
		String imgPath = null;
		// take screen shot of browser window
		// and save image file in imgPath
		imgPath = BaseMethods.getSnap(driver);

		return imgPath;

	}

	public static String TakeScreenShotOnFail() throws GeneralLeanFtException, InterruptedException, Exception {
		String ScreenShotOnError = XMLUtils.getNodeText(configPath, "ScreenShotOnFail");
		if (ScreenShotOnError.toLowerCase().contentEquals("true")) {
			setImgPathOnFail(TakeScreenShot());
			return TakeScreenShot();
		}
		return "";
	}

	public static String TakeScreenShotOnFailWithDriver(WebDriver driver)
			throws GeneralLeanFtException, InterruptedException, Exception {
		String ScreenShotOnError = XMLUtils.getNodeText(configPath, "ScreenShotOnFail");
		if (ScreenShotOnError.toLowerCase().contentEquals("true")) {
			setImgPathOnFail(TakeScreenShot(driver));
			return TakeScreenShot(driver);
		}
		return "";
	}

	public static String TakeScreenShotOnPass() throws GeneralLeanFtException, InterruptedException, Exception {
		String ScreenShotOnError = XMLUtils.getNodeText(configPath, "ScreenShotOnPass");
		if (ScreenShotOnError.toLowerCase().contentEquals("true")) {
			return TakeScreenShot();
		}
		return "";
	}

	public static String TakeScreenShotOnPassWithDriver(WebDriver driver)
			throws GeneralLeanFtException, InterruptedException, Exception {
		String ScreenShotOnError = XMLUtils.getNodeText(configPath, "ScreenShotOnPass");
		if (ScreenShotOnError.toLowerCase().contentEquals("true")) {
			return TakeScreenShot(driver);
		}
		return "";
	}

	// to send cucumber scenario step to Extent report when step pass
	public static void LOGGEROnPass(String gherkinKeyword, String step)
			throws IOException, GeneralLeanFtException, InterruptedException, Exception {
		try {			
				if (stepInfo.contentEquals("")) {
					CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step)
							.pass("step passed");
				} else {
					CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step)
							.pass("step passed").pass(stepInfo);
				}
			
		} catch (Exception e2) {

		} finally {
			// to clear step additional Info
			CommonMethods.setStepInfo("");
		}
	}

	// to send cucumber scenario step to Extent report when step pass
	public static void LOGGEROnPassWithDriver(String gherkinKeyword, String step, WebDriver driver)
			throws IOException, GeneralLeanFtException, InterruptedException, Exception {
		try {
			String screenShot = CommonMethods.TakeScreenShotOnPassWithDriver(driver);
			if (screenShot.contentEquals("")) {
				if (stepInfo.contentEquals("")) {
					CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step)
							.pass("step passed");
				} else {
					CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step)
							.pass("step passed").pass(stepInfo);
				}
			} else {
				if (stepInfo.contentEquals("")) {
					CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step)
							.pass("step passed").addScreenCaptureFromPath(screenShot);
				} else {
					CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step)
							.pass("step passed").pass(stepInfo).addScreenCaptureFromPath(screenShot);
				}

			}
		} catch (Exception e2) {

		} finally {
			// to clear step additional Info
			CommonMethods.setStepInfo("");
		}
	}

	public static void LOGGEROnFailWithDriver(String gherkinKeyword, String step, String e, WebDriver driver)
			throws IOException, InterruptedException, Exception {
		try {
			setTestSummaryException(e);
			String screenShot = CommonMethods.TakeScreenShotOnFailWithDriver(driver);
			if (screenShot.contentEquals("")) {
				CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step, stepInfo)
						.fail(e);
			} else {
				CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step, stepInfo).fail(e)
						.addScreenCaptureFromPath(CommonMethods.TakeScreenShotOnFail());
			}
		} catch (Exception e2) {
		} finally {
			// to clear step additional Info
			CommonMethods.setStepInfo("");
		}
	}

	public static void LOGGEROnFail(String gherkinKeyword, String step, String e)
			throws IOException, InterruptedException, Exception {
		try {
			CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step, stepInfo).fail(e);

		} catch (Exception e2) {
		} finally {
			// to clear step additional Info
			CommonMethods.setStepInfo("");
		}
	}

	// to send cucumber scenario step to Extent report when step fail
	public static void LOGGEROnFail(String gherkinKeyword, String step, Exception e)
			throws IOException, GeneralLeanFtException, InterruptedException, Exception {
		try {
			if (stepInfo.contentEquals("")) {
				CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step).fail(e);
			} else {
				CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step).fail(e)
						.fail(stepInfo);
			}

		} catch (Exception e2) {

		} finally {
			// to clear step additional Info
			CommonMethods.setStepInfo("");
		}
	}

	// new GherkinKeyword("Scenario")
	// to send cucumber scenario step to Extent report when step skipped
	public static void LOGGEROnSkip(String gherkinKeyword, String step)
			throws IOException, GeneralLeanFtException, InterruptedException, Exception {
		if (isLoggerOnSkip) {
			CommonMethods.getExtentScenario().createNode(new GherkinKeyword(gherkinKeyword), step).skip("SKIPPED");
		}
	}

	// to setup testSummary
	public static void setupTestSummary(String feature) {
		try {
			int rowNo = WordUtils.getRowNo(testSummaryDoc, feature);
			setTestSummaryRowNo(rowNo);
			// to initialize total no.of tests passed
			// based on no.of scenarios specified for this feature
			setTotalPass(WordUtils.getParagraphLength(testSummaryDoc, rowNo, 2));
			// to get total no. of scenarios with in current feature
			setTotalScenarios(totalPass);
			// to set text example: "3 out of 3 passed"
			String text = totalScenarios + " out of " + totalScenarios + " passed";
			// Ignoring header row
			if (rowNo > 0) {
				WordUtils.updateTableWithText(testSummaryDoc, rowNo, 3, "Pass", "Arial", 10, "00CC00", true, false,
						null);
				WordUtils.updateTableWithText(testSummaryDoc, rowNo, 4, text, "Arial", 10, "000000", true, false, null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// to update test summary (word document) when test fail
	public static void updateTestSummaryOnFail() {
		try {
			CommonMethods.setTotalPass(CommonMethods.getTotalPass() - 1);
			// to set red text "Fail" under the column Result
			WordUtils.updateTableWithText(CommonMethods.getTestSummaryDoc(), CommonMethods.getTestSummaryRowNo(), 3,
					"Fail", "Arial", 10, "FF0000", true, false, null);
			String txt = WordUtils.getCellText(CommonMethods.getTestSummaryDoc(), CommonMethods.getTestSummaryRowNo(),
					4);
			String firstParagraph = WordUtils
					.getCell(CommonMethods.getTestSummaryDoc(), CommonMethods.getTestSummaryRowNo(), 4).getParagraphs()
					.get(0).getText();
			String newParagraph = CommonMethods.getTotalPass() + " out of " + CommonMethods.getTotalScenarios()
					+ " passed";
			String newtxt = txt.replace(firstParagraph, newParagraph);
			if (txt.contains("Reason:")) {
				WordUtils.updateTableWithText(CommonMethods.getTestSummaryDoc(), CommonMethods.getTestSummaryRowNo(), 4,
						newtxt, "Arial", 10, "000000", true, false, null);
			} else {
				WordUtils.updateTableWithText(CommonMethods.getTestSummaryDoc(), CommonMethods.getTestSummaryRowNo(), 4,
						newtxt, "Arial", 10, "000000", true, false, null);
				WordUtils.updateTableWithText(CommonMethods.getTestSummaryDoc(), CommonMethods.getTestSummaryRowNo(), 4,
						"Reason:", "Arial", 10, "000000", false, true, null);
				// Truncating exception message to allow only 250 characters
				String exception = CommonMethods.getTestSummaryException();
				String excep = common.utilities.StringUtils.addLinebreaks(exception, 50);
				WordUtils.updateTableWithText(CommonMethods.getTestSummaryDoc(), CommonMethods.getTestSummaryRowNo(), 4,
						excep, "Arial", 10, "800000", false, false, 250);
			}

			WordUtils.updateTableWithImage(CommonMethods.getTestSummaryDoc(), CommonMethods.getTestSummaryRowNo(), 4,
					imgPathOnFail.replace("file:///", ""), "PNG", 250, 150, false);

		} catch (Exception e) {
			LOGGER.warn("error in code update summary");
		}
	}

	// Start video
	public static boolean Startvideo() throws InterruptedException {
		try {
			videoUtils.startRecording();
			LOGGER.info("Step: start video capture PASS");
			return true;

		} catch (Exception e) {

			LOGGER.error("Step: start video capture Fail\n" + e);
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	// Stop video
	public static boolean Stopvideo() throws InterruptedException {
		try {
			videoUtils.stopRecording();
			LOGGER.info("Step: stop video capture PASS");
			return true;

		} catch (Exception e) {

			LOGGER.error("Step: stop video capture Fail\n" + e);
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	// get csv cell data
	public static String getCSVData(String column) throws Exception {
		String csvFileName = CommonMethods.getCsvFileName();
		String scenario = CommonMethods.getScenario();
		Integer scenarioNo = CommonMethods.getScenarioNo();
		String cellValue = CSVUtils.getCSVData(CommonMethods.getTestDataDir() + "\\" + csvFileName + ".csv", scenario,
				scenarioNo, column);
		return cellValue;
	}

	public static String getAuthCode() {
		try {
			WebDriver driver = BaseMethods.getChromeDriver(BaseMethods.getChromeDriverService());
			String url = "https://login-uat.credabl.com.au/credablb2cuat.onmicrosoft.com/B2C_1A_SIGNIN_V1/oauth2/v2.0/authorize?client_id=947b6c03-6bc8-4b20-900a-ecfdb9324192&response_type=code&redirect_uri=https://jwt.ms&scope=https://credablb2cuat.onmicrosoft.com/947b6c03-6bc8-4b20-900a-ecfdb9324192/user_impersonation";
			driver.get(url);
			driver.manage().window().maximize();
			Waits.waitInSeconds(2);
			WebElement txtEmailAddress = driver.findElement(By.xpath("//input[@name='Email Address']"));
			txtEmailAddress.sendKeys("sarath.kavati@gmail.com");
			WebElement txtPassword = driver.findElement(By.xpath("//input[@name='Password']"));
			txtPassword.sendKeys("Credabl1");
			Waits.waitInSeconds(1);
			WebElement btnSignIn = driver.findElement(By.tagName("button"));
			btnSignIn.click();
			Element.isElementPresent(driver,
					By.xpath("//*[text()='Enter token below (it never leaves your browser):']"), 10);
			String currentUrl = driver.getCurrentUrl();
			String authCode = currentUrl.substring(currentUrl.lastIndexOf("=") + 1);
			driver.close();
			return authCode;
		} catch (Exception e) {
			return "";
		}
	}
	
	public static String getInvalidAuthCode() {
		try {
			WebDriver driver = BaseMethods.getChromeDriver(BaseMethods.getChromeDriverService());
			String url = "https://credablb2cuat.b2clogin.com/credablb2cuat.onmicrosoft.com/B2C_1A_SIGNIN_V1/oauth2/v2.0/authorize?client_id=947b6c03-6bc8-4b20-900a-ecfdb9324192&response_type=code&redirect_uri=https://jwt.ms&scope=https://credablb2cuat.onmicrosoft.com/947b6c03-6bc8-4b20-900a-ecfdb9324192/user_impersonation";
			driver.get(url);
			driver.manage().window().maximize();
			Waits.waitInSeconds(2);
			WebElement txtEmailAddress = driver.findElement(By.xpath("//input[@name='Email Address']"));
			txtEmailAddress.sendKeys("sarath.kavati@gmail.com");
			WebElement txtPassword = driver.findElement(By.xpath("//input[@name='Password']"));
			txtPassword.sendKeys("Credabl1");
			Waits.waitInSeconds(1);
			WebElement btnSignIn = driver.findElement(By.tagName("button"));
			btnSignIn.click();
			Element.isElementPresent(driver,
					By.xpath("//*[text()='Enter token below (it never leaves your browser):']"), 10);
			String currentUrl = driver.getCurrentUrl();
			String authCode = currentUrl.substring(currentUrl.lastIndexOf("=") + 1);
			driver.close();
			return authCode;
		} catch (Exception e) {
			return "";
		}
	}

	public static Response getAccessTokenResponse(String code) {
		RestAssured.baseURI = "https://login-uat.credabl.com.au/credablb2cuat.onmicrosoft.com/B2C_1A_SIGNIN_V1";
		return given().contentType(ContentType.URLENC).formParam("code", code).formParam("client_id", clientId)
				.formParam("grant_type", "authorization_code")
				.formParam("client_secret", "byr7Q~2J5o1uBbecpmKg_0s7MQEX.4T6vRmsC")
				.formParam("redirect_uri", redirectUri).post("/oauth2/v2.0/token").then().statusCode(200).extract()
				.response();
	}
	
	public static Response getInvalidAccessTokenResponse(String code) {
		RestAssured.baseURI = "https://credablb2cuat.b2clogin.com/credablb2cuat.onmicrosoft.com/B2C_1A_SIGNIN_V1";
		return given().contentType(ContentType.URLENC).formParam("code", code).formParam("client_id", clientId)
				.formParam("grant_type", "authorization_code")
				.formParam("client_secret", "byr7Q~2J5o1uBbecpmKg_0s7MQEX.4T6vRmsC")
				.formParam("redirect_uri", redirectUri).post("/oauth2/v2.0/token").then().statusCode(200).extract()
				.response();
	}

	public static String parseForOAuth2Code(Response response) {
		return response.jsonPath().getString("access_token");
	}

	// .................. below are testing purpose only ..............

	// @Test
	public void test_killDriver() throws Exception {
		String pid = SystemUtils.getCurrentProcessId("chromedriver.exe");
		LOGGER.info("current crhome pid: " + pid);
		SystemUtils.killProcessById(pid);
	}

	// ****************** testing purpose only *****************
	// @Test
	public void getnodevalue() {
		String winAppDriverPath = FileUtils.findFullPath(GlobalConstants.USER_DIR, "WinAppDriver.exe");
		String docPath = FileUtils.findFullPath(GlobalConstants.USER_DIR, "Certified - Drivers Licence.pdf");
		System.out.println("Win app driver: " + winAppDriverPath);
		System.out.println("Doc path: " + docPath);
		System.out.println("Parent path: " + FileUtils.getParentDirectoryPath(docPath));
		// assertTrue(true);
	}

	// @Test
	public void test_AzureTables() {
		try {

			String connectionString = "DefaultEndpointsProtocol=https;AccountName=creuatdocspipelineblob;AccountKey=3znXIgkm6qWolaZSfRqm5ytNdj4NMiNl/NGEXGdAEJfhR6qYs26vgrqRzkkZNerDtm3PjZv61o+rhY+vNLEx4Q==;EndpointSuffix=core.windows.net";
			// Create a TableServiceClient with a connection string.
			TableServiceClient tableServiceClient = new TableServiceClientBuilder().connectionString(connectionString)
					.buildClient();

			// Loop through a collection of table names.
			tableServiceClient.listTables().forEach(tableItem -> System.out.printf(tableItem.getName()));
		} catch (Exception e) {
			// Output the stack trace.
			e.printStackTrace();
		}
	}

	@Test
	public void testOAuthWithAuthorizationCode() throws JSONException {

		Response response = given().header("Authorization", "sarath.kavati@gmail.com:Sk@250022")
				.contentType("application/x-www-form-urlencoded").formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "https://jwt.ms").formParam("response_type", "code")
				.formParam("code",
						"eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6InBjMnotald4bW9QSkc3NWdyMUhhTlVqSkd4dHdyQ2RWYUJaRGVyY2lua2cifQ.eyJpc3MiOiJodHRwczovL2xvZ2luLXVhdC5jcmVkYWJsLmNvbS5hdS8yOWQ5ODgwMS03ZDliLTQwNGYtOGFjYy0yNzI0MzcyZjQ3YjcvdjIuMC8iLCJleHAiOjE2ODA2MDQ5ODgsIm5iZiI6MTY4MDYwMTM4OCwiYXVkIjoiOTQ3YjZjMDMtNmJjOC00YjIwLTkwMGEtZWNmZGI5MzI0MTkyIiwic3ViIjoiZmVhOTg2MzUtMmU5ZS00NWFlLWJkMjctZWQxMTM3NDU5ZTY4IiwiZW1haWwiOiJzYXJhdGgua2F2YXRpQGdtYWlsLmNvbSIsIm5hbWUiOiJTYXJhdGggS2F2YXRpIiwiZ2l2ZW5fbmFtZSI6IlNhcmF0aCIsImZhbWlseV9uYW1lIjoiS2F2YXRpIiwiaWRwIjoiQXp1cmVBRCIsInRpZCI6IjI5ZDk4ODAxLTdkOWItNDA0Zi04YWNjLTI3MjQzNzJmNDdiNyIsInBhc3N3b3JkRXhwaXJlZCI6ZmFsc2UsInNjcCI6InVzZXJfaW1wZXJzb25hdGlvbiIsImF6cCI6Ijk0N2I2YzAzLTZiYzgtNGIyMC05MDBhLWVjZmRiOTMyNDE5MiIsInZlciI6IjEuMCIsImlhdCI6MTY4MDYwMTM4OH0.qVaDaFS6iop-1KOpGzeMSFWyiB_h4BOy9SsAl2Q6wsPrD_RTfM30QIGDmPkWMuprdRUM9T0pjKiaHCHOxjOxS6JXU1Q_XhkQFA6jFh_7wvQU5qzkeXSuL4Lk4Z5A2IKCU9sWdzzcXhsY0-75cldPMpyDskZucvEcFVAlzuK0LNhikE1t91UscITTgHkDI8nMF22ZqCgC2QsC4PpVuXWFHE-50f_fYQcKfYIyWTyI_viItZwVazDju5Ao16vJTGVLqf24XVMbDs7g9Imn9dVnTI_SE82b40yZaY5DmTYCSy9RqnZSynMEZRthwhTQMmgIaVBOzb4L7X0Ao7QIbgOI-w")
				.formParam("client_id", "947b6c03-6bc8-4b20-900a-ecfdb9324192")
				.formParam("client_secret", "byr7Q~2J5o1uBbecpmKg_0s7MQEX.4T6vRmsC")
				.formParam("scope",
						"https://credablb2cuat.onmicrosoft.com/947b6c03-6bc8-4b20-900a-ecfdb9324192/user_impersonation/.default")
				.when()
				.post("https://login-uat.credabl.com.au/credablb2cuat.onmicrosoft.com/B2C_1A_SIGNIN_V1/oauth2/v2.0/token");

		JSONObject jsonObject = new JSONObject(response.getBody().asString());
		String accessToken = jsonObject.get("access_token").toString();
		String tokenType = jsonObject.get("token_type").toString();
		System.out.println("Oauth Token with type " + tokenType + "   " + accessToken);

	}

}
