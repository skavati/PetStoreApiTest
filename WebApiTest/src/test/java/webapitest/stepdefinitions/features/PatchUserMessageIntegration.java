package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PatchUserMessageIntegration {
	@Given("scenario Patch User Message Integration ends")
	public void scenario_patch_user_message_integration_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Patch User Message Integration' FAILED");					
				
			}
		}
	}

}
