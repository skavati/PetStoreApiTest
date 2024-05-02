package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostSendVerificationCodeNoToken {
	@Given("scenario Post Send Verification Code No Token ends")
	public void scenario_post_send_verification_code_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Send Verification Code No Token' FAILED");					
				
			}
		}
	}

}