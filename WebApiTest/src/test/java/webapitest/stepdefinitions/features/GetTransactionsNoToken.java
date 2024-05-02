package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetTransactionsNoToken {
	@Given("scenario Get Transactions No Token ends")
	public void scenario_get_transactions_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Transactions No Token' FAILED");
			}
		}
	}

}

