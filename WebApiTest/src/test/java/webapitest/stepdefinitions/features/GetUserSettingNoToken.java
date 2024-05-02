package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetUserSettingNoToken {
	@Given("scenario Get User Setting No Token ends")
	public void scenario_get_user_setting_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get User Setting No Token' FAILED");					
				
			}
		}
	}

}