package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetAppSettingsInvalidToken {
	@Given("scenario Get App Settings Invalid Token ends")
	public void scenario_get_app_settings_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get App Settings Invalid Token' FAILED");					
				
			}
		}
	}

}

