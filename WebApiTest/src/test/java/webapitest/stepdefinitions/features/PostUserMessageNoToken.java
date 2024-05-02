package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostUserMessageNoToken {
	@Given("scenario Post User Message No Token ends")
	public void scenario_post_user_message_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post User Message No Token' FAILED");					
				
			}
		}
	}

}
