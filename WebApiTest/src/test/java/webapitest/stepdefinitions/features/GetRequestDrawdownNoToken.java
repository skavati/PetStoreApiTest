package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetRequestDrawdownNoToken {
	@Given("scenario Get Request Drawdown No Token ends")
	public void scenario_get_request_drawdown_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Request Drawdown No Token' FAILED");					
				
			}
		}
	}

}
