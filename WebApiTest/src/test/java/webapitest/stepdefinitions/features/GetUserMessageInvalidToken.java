package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetUserMessageInvalidToken {
	@Given("scenario Get User Message Invalid Token ends")
	public void scenario_get_user_message_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get User Message Invalid Token' FAILED");
			}
		}
	}

}
