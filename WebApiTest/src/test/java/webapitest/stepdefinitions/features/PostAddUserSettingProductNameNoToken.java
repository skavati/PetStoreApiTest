package webapitest.stepdefinitions.features;

import io.cucumber.java.en.Given;
import webapitest.methods.CommonMethods;

public class PostAddUserSettingProductNameNoToken {
	@Given("scenario Post Add User Setting Product Name No Token ends")
	public void scenario_post_add_user_setting_product_name_no_token_ends() throws Exception {
		try {

		} catch (Exception e) {
			CommonMethods.setScenarioResult(false);
		} finally {
			if (!CommonMethods.isScenarioResult()) {				
					throw new Exception("Scenario 'Post Add User Setting Product Name No Token' FAILED");					
				
			}
		}
	}

}


