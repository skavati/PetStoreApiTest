package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetDesignatedAccountsInvalidToken {
	@Given("scenario Get Designated Accounts Invalid Token ends")
	public void scenario_get_designated_accounts_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Designated Accounts Invalid Token' FAILED");					
				
			}
		}
	}

}
