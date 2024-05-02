package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostAddUserSettingTermsAndConditions {
	@Given("scenario Post Add User Setting TermsAndConditions ends")
	public void scenario_post_add_user_setting_terms_and_conditions_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Add User Setting TermsAndConditions' FAILED");					
				
			}
		}
	}

}

