package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetUserSettingInvalidToken {
	@Given("scenario Get User Setting Invalid Token ends")
	public void scenario_get_user_setting_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get User Setting Invalid Token' FAILED");					
				
			}
		}
	}

}