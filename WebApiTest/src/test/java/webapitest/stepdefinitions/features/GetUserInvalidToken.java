package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetUserInvalidToken {
	@Given("scenario Get User Invalid Token ends")
	public void scenario_get_user_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get User Invalid Token' FAILED");
			}
		}
	}

}

