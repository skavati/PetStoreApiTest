package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class GetEntities {
	
	@Given("scenario Get Entities ends")
	public void scenario_get_entities_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Entities' FAILED");					
				
			}
		}
	}

}
