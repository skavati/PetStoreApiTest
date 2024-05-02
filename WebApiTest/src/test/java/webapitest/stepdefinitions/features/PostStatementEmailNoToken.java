package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostStatementEmailNoToken {
	@Given("scenario Post Statement Email No Token ends")
	public void scenario_post_statement_email_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Statement Email No Token' FAILED");					
				
			}
		}
	}

}