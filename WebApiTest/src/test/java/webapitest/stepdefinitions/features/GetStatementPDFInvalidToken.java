package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetStatementPDFInvalidToken {
	@Given("scenario Get Statement PDF Invalid Token ends")
	public void scenario_get_statement_pdf_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Statement PDF Invalid Token' FAILED");					
				
			}
		}
	}

}