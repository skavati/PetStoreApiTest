package webapitest.steps;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.hp.lft.sdk.GeneralLeanFtException;

import common.utilities.CSVUtils;
import webapitest.methods.CommonMethods;

public class CommonSteps {
	CommonMethods commonMethods = new CommonMethods();
	Boolean stepPass = true;
	String step = "";
	private static final Logger LOGGER = LogManager.getLogger(CommonSteps.class);

	public static void ScreenShot(String file) throws IOException {

	}

	// launchUrl_repeated_scenario

	public void launchURL() throws IOException, GeneralLeanFtException, InterruptedException, Exception {

		String step = "Given I launch document upload website";
		if (CommonMethods.isStepFail()) {
			CommonMethods.LOGGEROnSkip("Given", step);
		} else {
			try {
				commonMethods.launchURL();
			} catch (Exception e) {
				stepPass = false;
				CommonMethods.setStepFail(true);
				CommonMethods.LOGGEROnFail("Given", step, e);

			} finally {
				if (stepPass == true) {
					CommonMethods.LOGGEROnPass("Given", step);
				}
			}
		}
	}
	
	public void launchURLWeaveApp() throws IOException, GeneralLeanFtException, InterruptedException, Exception {

		String step = "Given I launch Weave App website";
		if (CommonMethods.isStepFail()) {
			CommonMethods.LOGGEROnSkip("Given", step);
		} else {
			try {
				commonMethods.launchURL();
			} catch (Exception e) {
				stepPass = false;
				CommonMethods.setStepFail(true);
				CommonMethods.LOGGEROnFail("Given", step, e);

			} finally {
				if (stepPass == true) {
					CommonMethods.LOGGEROnPass("Given", step);
				}
			}
		}
	}

	public void close_the_browser() throws Exception {
		String step = "customer close the browser 'ibank'";
		String keyword = "And";
		stepPass = true;
		if (CommonMethods.isStepFail()) {
			CommonMethods.LOGGEROnSkip(keyword, step);
		} else {
			try {
				if (!CommonMethods.close_the_browser()) {
					stepPass = false;
					throw new Exception(CommonMethods.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				CommonMethods.setException(e.toString());
			} finally {
				if (stepPass == true) {
					CommonMethods.LOGGEROnPass(keyword, step);
				} else {
					CommonMethods.setStepFail(true);
					CommonMethods.setScenarioResult(false);
					CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
				}
			}
		}
	}

	public void setupScenario(String csvFile, String feature, String scenario) throws Exception {
		// set report for feature
		if (!CommonMethods.feature.contentEquals(feature)) {
			ExtentTest extentFeature = CommonMethods.getExtentReport().createTest(feature);
			CommonMethods.setExtentFeature(extentFeature);			
		}
		// set report for scenario
		if (!CommonMethods.scenario.contentEquals(scenario)) {
			String code = "\n\t\n\t\tText\n\t\n";
			Markup m = MarkupHelper.createCodeBlock(code);
			ExtentTest extentScenario = CommonMethods.getExtentFeature().createNode(Scenario.class, scenario);// .info(m);
			CommonMethods.setExtentScenario(extentScenario);
		}
		// set feature and scenario variables
		commonMethods.setupScenario(csvFile, feature, scenario);
		String RunTest = CSVUtils.getCSVData(CommonMethods.getCsvFileName(), scenario, 1, "RunTest");
		if (RunTest.equalsIgnoreCase("n")) {
			CommonMethods.getExtentScenario().createNode(Scenario.class, scenario + ":     No:1",
					"Scenario ignored as per Excel sheet '" + CommonMethods.getSheet() + "' entry 'RunTest=N'");
			// .("Scenario ignored as per Excel sheet '" +
			// Common_Page.getSheet() + "' entry 'RunTest=N'");
			CommonMethods.setStepFail(true);
			// to stop pushing skip logs to reprot
			CommonMethods.setLoggerOnSkip(false);

		} else {
			ExtentTest extentScenarioNo = CommonMethods.getExtentScenario().createNode(Scenario.class,
					scenario + ":     No: " + CommonMethods.getScenarioNo());
			CommonMethods.setExtentScenarioNo(extentScenarioNo);
			LOGGER.info("\n" + scenario + ": No: " + CommonMethods.getScenarioNo() + " Running...");
		}
	}

	public void Startvideo() throws Exception {
		String step = "start video capture";
		String keyword = "And";
		stepPass = true;
		if (CommonMethods.isStepFail()) {
			CommonMethods.LOGGEROnSkip(keyword, step);
		} else {
			try {
				if (!CommonMethods.Startvideo()) {
					stepPass = false;
					throw new Exception(CommonMethods.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				CommonMethods.setException(e.toString());
			} finally {
				if (stepPass == true) {
					CommonMethods.LOGGEROnPass(keyword, step);
				} else {
					CommonMethods.setStepFail(true);
					CommonMethods.setScenarioResult(false);
					CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
				}
			}
		}
	}

	public void Stopvideo() throws Exception {
		String step = "stop video capture";
		String keyword = "And";
		stepPass = true;
		if (CommonMethods.isStepFail()) {
			CommonMethods.LOGGEROnSkip(keyword, step);
		} else {
			try {
				if (!CommonMethods.Stopvideo()) {
					stepPass = false;
					throw new Exception(CommonMethods.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				CommonMethods.setException(e.toString());
			} finally {
				if (stepPass == true) {
					CommonMethods.LOGGEROnPass(keyword, step);
				} else {
					CommonMethods.setStepFail(true);
					CommonMethods.setScenarioResult(false);
					CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
				}
			}
		}
	}

}
