package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostStatementEmailInvalidToken {
	@Given("scenario Post Statement Email Invalid Token ends")
	public void scenario_post_statement_email_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Statement Email Invalid Token' FAILED");					
				
			}
		}
	}

}