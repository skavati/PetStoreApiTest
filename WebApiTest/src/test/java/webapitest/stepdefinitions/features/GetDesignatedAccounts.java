package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetDesignatedAccounts {
	@Given("scenario Get Designated Accounts ends")
	public void scenario_get_designated_accounts_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Designated Accounts' FAILED");					
				
			}
		}
	}

}
