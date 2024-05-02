package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostAddRequestDrawdownNoToken {
	@Given("scenario Post Add Request Drawdown No Token ends")
	public void scenario_post_add_reuest_drawdown_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Add Request Drawdown' FAILED");					
				
			}
		}
	}

}
