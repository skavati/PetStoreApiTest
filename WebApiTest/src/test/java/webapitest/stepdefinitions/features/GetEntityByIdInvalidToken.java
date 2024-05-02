package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetEntityByIdInvalidToken {
	@Given("scenario Get Entity by Id Invalid Token ends")
	public void scenario_get_entity_by_id_invalid_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Entity by Id Invalid Token' FAILED");					
				
			}
		}
	}

}
