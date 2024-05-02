package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetStatementPDF {
	@Given("scenario Get Statement PDF ends")
	public void scenario_get_statement_pdf_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Statement PDF' FAILED");			
				}
		}
	}

}