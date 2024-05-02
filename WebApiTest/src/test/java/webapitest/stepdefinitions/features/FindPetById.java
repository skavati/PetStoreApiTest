package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class FindPetById {
	@Given("scenario Find pet by Id ends")
	public void scenario_find_pet_by_id_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Find pet by Id' FAILED");
			}
		}
	}

}
