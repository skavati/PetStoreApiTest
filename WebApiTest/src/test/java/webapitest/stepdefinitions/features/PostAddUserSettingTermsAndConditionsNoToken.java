package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostAddUserSettingTermsAndConditionsNoToken {
	@Given("scenario Post Add User Setting TermsAndConditions No Token ends")
	public void scenario_post_add_user_setting_terms_and_conditions_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Add User Setting TermsAndConditions No Token' FAILED");					
				
			}
		}
	}

}

