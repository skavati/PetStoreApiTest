package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PatchRequestDirectDebit {
	@Given("scenario Patch Request Direct Debit ends")
	public void scenario_patch_request_direct_debit_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Patch Request Direct Debit' FAILED");					
				
			}
		}
	}

}

