package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetRequestDirectDebit {
	@Given("scenario Get Request Direct Debit ends")
	public void scenario_get_request_direct_debit_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Request Direct Debit' FAILED");					
				
			}
		}
	}

}
