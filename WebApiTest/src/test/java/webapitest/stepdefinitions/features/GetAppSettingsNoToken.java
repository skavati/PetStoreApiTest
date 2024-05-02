package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetAppSettingsNoToken {
	@Given("scenario Get App Settings No Token ends")
	public void scenario_get_app_settings_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get App Settings No Token' FAILED");					
				
			}
		}
	}

}
