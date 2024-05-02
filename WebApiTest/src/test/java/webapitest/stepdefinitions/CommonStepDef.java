package webapitest.stepdefinitions;

import java.io.IOException;

import org.apache.logging.log4j.*;
import com.hp.lft.sdk.GeneralLeanFtException;

import common.utilities.ExcelUtils;
import common.utilities.SystemUtils;
import common.utilities.XMLUtils;
import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;
import webapitest.steps.CommonSteps;

public class CommonStepDef {

	CommonSteps commonSteps = new CommonSteps();

	private static final Logger LOGGER = LogManager.getLogger(CommonStepDef.class);

	
	
	@Given("scenario starts {string} {string} {string} webapitest")
	public void scenario_starts_webapitest(String string, String string2, String string3) throws Exception {
	 commonSteps.setupScenario(string, string2, string3);
	}

	
	@Given("^customer close the browser 'ibank'$")
	public void customer_close_the_browser_ibank() throws Throwable {
		commonSteps.close_the_browser();
	}

		
	@Given("I launch Weave App website")
	public void i_launch_weave_app_website() throws IOException, GeneralLeanFtException, InterruptedException, Exception {
		commonSteps.launchURLWeaveApp();
	}
	
	


}
