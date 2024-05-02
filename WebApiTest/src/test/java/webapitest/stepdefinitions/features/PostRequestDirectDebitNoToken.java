package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostRequestDirectDebitNoToken {
	@Given("scenario Post Request Direct Debit No Token ends")
	public void scenario_post_request_direct_debit_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Request Direct Debit No Token' FAILED");					
				
			}
		}
	}

}

