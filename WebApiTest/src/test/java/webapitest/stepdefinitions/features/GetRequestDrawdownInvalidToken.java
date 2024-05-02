package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetRequestDrawdownInvalidToken {
	@Given("scenario Get Request Drawdown Invalid Token ends")
	public void scenario_get_request_drawdown_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Request Drawdown Invalid Token' FAILED");					
				
			}
		}
	}

}
