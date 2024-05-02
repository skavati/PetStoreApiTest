package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetEnityByIdNoToken {
	@Given("scenario Get Entity by Id No Token ends")
	public void scenario_get_entity_by_id_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Entity by Id No Token' FAILED");					
				
			}
		}
	}

}