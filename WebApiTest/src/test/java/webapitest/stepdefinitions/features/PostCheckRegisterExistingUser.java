package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostCheckRegisterExistingUser {
	@Given("scenario Post Check Register Existing User ends")
	public void scenario_post_check_register_existing_user_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Check Register Existing User' FAILED");					
				
			}
		}
	}

}


