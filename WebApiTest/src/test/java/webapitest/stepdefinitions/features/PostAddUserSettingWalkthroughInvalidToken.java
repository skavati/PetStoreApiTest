package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostAddUserSettingWalkthroughInvalidToken {
	@Given("scenario Post Add User Setting Walkthrough Invalid Token ends")
	public void scenario_post_add_user_setting_walkthrough_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Add User Setting Walkthrough Invalid Token' FAILED");					
				
			}
		}
	}

}


