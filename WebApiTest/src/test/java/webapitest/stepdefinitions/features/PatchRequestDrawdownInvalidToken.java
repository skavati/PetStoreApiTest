package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PatchRequestDrawdownInvalidToken {
	@Given("scenario Patch Request Drawdown Invalid Token ends")
	public void scenario_patch_request_drawdown_invalid_token_ends() throws Exception {
		
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Patch Request Drawdown Invalid Token' FAILED");					
				
			}
		}
	}

}
