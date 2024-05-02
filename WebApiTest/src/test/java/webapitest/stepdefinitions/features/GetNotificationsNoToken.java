package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetNotificationsNoToken {
	@Given("scenario Get Notifications No Token end")
	public void scenario_get_notifications_no_token_end() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Notifications No Token' FAILED");					
				
			}
		}
	}

}

