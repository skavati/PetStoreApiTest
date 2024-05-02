package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetNotificationsInvalidToken {
	@Given("scenario Get Notifications Invalid Token ends")
	public void scenario_get_notifications_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Notifications Invalid Token' FAILED");					
				
			}
		}
	}

}

