package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostSendVerificationCode {
	@Given("scenario Post Send Verification Code ends")
	public void scenario_post_send_verification_code_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Send Verification Code' FAILED");					
				
			}
		}
	}

}
