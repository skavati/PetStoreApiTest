package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class DeletePet {
	@Given("scenario Delete Pet ends")
	public void scenario_delete_pet_ends() throws Exception {	    
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Delete Pet' FAILED");
			}
		}
	}

}