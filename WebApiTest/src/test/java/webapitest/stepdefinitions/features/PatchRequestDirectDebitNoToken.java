package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PatchRequestDirectDebitNoToken {
	@Given("scenario Patch Request Direct Debit No Token ends")
	public void scenario_patch_request_direct_debit_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Patch Request Direct Debit No Token' FAILED");					
				
			}
		}
	}

}
