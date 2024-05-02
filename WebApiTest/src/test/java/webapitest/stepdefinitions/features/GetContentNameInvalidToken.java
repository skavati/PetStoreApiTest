package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetContentNameInvalidToken {
	@Given("scenario Get Content Name Invalid Token ends")
	public void scenario_get_content_name_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Content Name Invalid Token' FAILED");					
				
			}
		}
	}

}
