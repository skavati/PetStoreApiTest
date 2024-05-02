package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class UpdatePetName {
	@Given("scenario Update Pet Name ends")
	public void scenario_update_pet_name_ends() throws Exception {	    
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Update Pet Name' FAILED");
			}
		}
	}

}