package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetDesignatedAccountsNoToken {
	@Given("scenario Get Designated Accounts No Token ends")
	public void scenario_get_designated_accounts_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Designated Accounts No Token' FAILED");					
				
			}
		}
	}

}
