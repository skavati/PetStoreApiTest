package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetRequestDrawdown {
	@Given("scenario Get Request Drawdown ends")
	public void scenario_get_request_drawdown_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Request Drawdown' FAILED");					
				
			}
		}
	}

}
