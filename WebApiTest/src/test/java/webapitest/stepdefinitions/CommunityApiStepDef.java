package webapitest.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webapitest.steps.CommunityApiSteps;

public class CommunityApiStepDef {
	CommunityApiSteps communitySteps = new CommunityApiSteps();

	@When("I run Get Consultants api test")
	public void i_run_get_consultants_api_test() throws Exception {
		communitySteps.getConsultants();
	}

	@Then("I should verify sucessful Get Consultants api test")
	public void i_should_verify_sucessful_get_consultants_api_test() throws Exception {
		communitySteps.verifyGetConsultants();
	}

	@When("I run Get Consultant api test")
	public void i_run_get_consultant_api_test() throws Exception {
		communitySteps.getConsultant();
	}

	@Then("I should verify sucessful Get Consultant api test")
	public void i_should_verify_sucessful_get_consultant_api_test() throws Exception {
		communitySteps.verifyGetConsultant();
	}

	@When("I run Get Entities api test")
	public void i_run_get_entities_api_test() throws Exception {
		communitySteps.getEntities();
	}

	@Then("I should verify sucessful Get Entities api test")
	public void i_should_verify_sucessful_get_entities_api_test() throws Exception {
		communitySteps.verifyGetEntities();
	}

	@When("I run Get Entity by Id api test")
	public void i_run_get_entity_by_id_api_test() throws Exception {
		communitySteps.getEntityById();
	}

	@Then("I should verify sucessful Get Entity by Id api test")
	public void i_should_verify_sucessful_get_entity_by_id_api_test() throws Exception {
		communitySteps.verifyGetEntityById();
	}

	@When("I run Get Entities Invalid Token api test")
	public void i_run_get_entities_invalid_token_api_test() throws Exception {
		communitySteps.getEntities_InvalidToken();
	}

	@Then("I should verify sucessful Get Entities Invalid Token api test")
	public void i_should_verify_sucessful_get_entities_invalid_token_api_test() throws Exception {
		communitySteps.verifyGetEntities_InvalidToken();
	}

	@When("I run Get Entities No Token api test")
	public void i_run_get_entities_no_token_api_test() throws Exception {
		communitySteps.getEntities_NoToken();
	}

	@Then("I should verify sucessful Get Entities No Token api test")
	public void i_should_verify_sucessful_get_entities_no_token_api_test() throws Exception {
		communitySteps.verifyGetEntities_NoToken();
	}

	@When("I run Get Entity by Id Invalid Token api test")
	public void i_run_get_entity_by_id_invalid_token_api_test() throws Exception {
		communitySteps.getEntityById_InavlidToken();
	}

	@Then("I should verify sucessful Get Entity by Id Invalid Token api test")
	public void i_should_verify_sucessful_get_entity_by_id_invalid_token_api_test() throws Exception {
		communitySteps.verifyGetEntityById_InavlidToken();
	}

	@When("I run Get Entity by Id No Token api test")
	public void i_run_get_entity_by_id_no_token_api_test() throws Exception {
		communitySteps.getEntityById_NoToken();
	}

	@Then("I should verify sucessful Get Entity by Id No Token api test")
	public void i_should_verify_sucessful_get_entity_by_id_no_token_api_test() throws Exception {
		communitySteps.verifyGetEntityById_NoToken();
	}

	@When("I run Post Request Direct Debit api test")
	public void i_run_post_request_direct_debit_api_test() throws Exception {
		communitySteps.postRequestDirectDebit();
	}

	@Then("I should verify sucessful Post Request Direct Debit api test")
	public void i_should_verify_sucessful_post_request_direct_debit_api_test() throws Exception {
		communitySteps.verify_PostRequestDirectDebit();
	}

	@When("I run Post Request Direct Debit Invalid Token api test")
	public void i_run_post_request_direct_debit_invalid_token_api_test() throws Exception {
		communitySteps.postRequestDirectDebit_InvalidToken();
	}

	@Then("I should verify sucessful Post Request Direct Debit Invalid Token api test")
	public void i_should_verify_sucessful_post_request_direct_debit_invalid_token_api_test() throws Exception {
		communitySteps.verify_PostRequestDirectDebit_InvalidToken();
	}

	@When("I run Post Request Direct Debit No Token api test")
	public void i_run_post_request_direct_debit_no_token_api_test() throws Exception {
		communitySteps.postRequestDirectDebit_NoToken();
	}

	@Then("I should verify sucessful Post Request Direct Debit No Token api test")
	public void i_should_verify_sucessful_post_request_direct_debit_no_token_api_test() throws Exception {
		communitySteps.verify_PostRequestDirectDebit_NoToken();
	}

	@When("I run Get Request Direct Debit api test")
	public void i_run_get_request_direct_debit_api_test() throws Exception {
		communitySteps.getRequestDirectDebit();
	}

	@Then("I should verify sucessful Get Request Direct Debit api test")
	public void i_should_verify_sucessful_get_request_direct_debit_api_test() throws Exception {
		communitySteps.verify_getRequestDirectDebit();
	}

	@When("I run Get Request Direct Debit Invalid Token api test")
	public void i_run_get_request_direct_debit_invalid_token_api_test() throws Exception {
		communitySteps.getRequestDirectDebit_InvalidToken();
	}

	@Then("I should verify sucessful Get Request Direct Debit Invalid Token api test")
	public void i_should_verify_sucessful_get_request_direct_debit_invalid_token_api_test() throws Exception {
		communitySteps.verify_getRequestDirectDebit_InvalidToken();
	}

	@When("I run Get Request Direct Debit No Token api test")
	public void i_run_get_request_direct_debit_no_token_api_test() throws Exception {
		communitySteps.getRequestDirectDebit_NoToken();
	}

	@Then("I should verify sucessful Get Request Direct Debit No Token api test")
	public void i_should_verify_sucessful_get_request_direct_debit_no_token_api_test() throws Exception {
		communitySteps.verify_getRequestDirectDebit_NoToken();
	}

	@When("I run Patch Request Direct Debit api test")
	public void i_run_patch_request_direct_debit_api_test() throws Exception {
		communitySteps.patchRequestDirectDebit();
	}

	@Then("I should verify sucessful Patch Request Direct Debit api test")
	public void i_should_verify_sucessful_patch_request_direct_debit_api_test() throws Exception {
		communitySteps.verify_patchRequestDirectDebit();
	}

	@When("I run Patch Request Direct Debit Invalid Token api test")
	public void i_run_patch_request_direct_debit_invalid_token_api_test() throws Exception {
		communitySteps.patchRequestDirectDebit_InvalidToken();
	}

	@Then("I should verify sucessful Patch Request Direct Debit Invalid Token api test")
	public void i_should_verify_sucessful_patch_request_direct_debit_invalid_token_api_test() throws Exception {
		communitySteps.verify_patchRequestDirectDebit_InvalidToken();
	}

	@When("I run Patch Request Direct Debit No Token api test")
	public void i_run_patch_request_direct_debit_no_token_api_test() throws Exception {
		communitySteps.patchRequestDirectDebit_NoToken();
	}

	@Then("I should verify sucessful Patch Request Direct Debit No Token api test")
	public void i_should_verify_sucessful_patch_request_direct_debit_no_token_api_test() throws Exception {
		communitySteps.verify_patchRequestDirectDebit_NoToken();
	}

	@When("I run Get User Setting api test")
	public void i_run_get_user_setting_api_test() throws Exception {
		communitySteps.getUserSetting();
	}

	@Then("I should verify sucessful Get User Setting api test")
	public void i_should_verify_sucessful_get_user_setting_api_test() throws Exception {
		communitySteps.verify_GetUserSetting();
	}

	@When("I run Get User Setting Invalid Token api test")
	public void i_run_get_user_setting_invalid_token_api_test() throws Exception {
		communitySteps.getUserSetting_InvalidToken();
	}

	@Then("I should verify sucessful Get User Setting Invalid Token api test")
	public void i_should_verify_sucessful_get_user_setting_invalid_token_api_test() throws Exception {
		communitySteps.verify_getUserSetting_InvalidToken();
	}

	@When("I run Get User Setting No Token api test")
	public void i_run_get_user_setting_no_token_api_test() throws Exception {
		communitySteps.getUserSetting_NoToken();
	}

	@Then("I should verify sucessful Get User Setting No Token api test")
	public void i_should_verify_sucessful_get_user_setting_no_token_api_test() throws Exception {
		communitySteps.verify_getUserSetting_NoToken();
	}

	@When("I run Post Add User Setting api test")
	public void i_run_post_add_user_setting_api_test() throws Exception {
		communitySteps.postAddUserSetting();
	}

	@Then("I should verify sucessful Post Add User Setting api test")
	public void i_should_verify_sucessful_post_add_user_setting_api_test() throws Exception {
		communitySteps.verify_postAddUserSetting();
	}

	@When("I run Post Add User Setting Invalid Token api test")
	public void i_run_post_add_user_setting_invalid_token_api_test() throws Exception {
		communitySteps.postAddUserSetting_InvalidToken();
	}

	@Then("I should verify sucessful Post Add User Setting Invalid Token api test")
	public void i_should_verify_sucessful_post_add_user_setting_invalid_token_api_test() throws Exception {
		communitySteps.verify_postAddUserSetting_InvalidToken();
	}

	@When("I run Post Add User Setting No Token api test")
	public void i_run_post_add_user_setting_no_token_api_test() throws Exception {
		communitySteps.postAddUserSetting_NoToken();
	}

	@Then("I should verify sucessful Post Add User Setting No Token api test")
	public void i_should_verify_sucessful_post_add_user_setting_no_token_api_test() throws Exception {
		communitySteps.verify_postAddUserSetting_NoToken();
	}

	@When("I run Post Add User Setting Product Name api test")
	public void i_run_post_add_user_setting_product_name_api_test() throws Exception {
		communitySteps.postAddUserSettingProductName();
	}

	@Then("I should verify sucessful Post Add User Setting Product Name api test")
	public void i_should_verify_sucessful_post_add_user_setting_product_name_api_test() throws Exception {
		communitySteps.verify_postAddUserSettingProductName();
	}

	@When("I run Post Add User Setting Product Name Invalid Token api test")
	public void i_run_post_add_user_setting_product_name_invalid_token_api_test() throws Exception {
		communitySteps.postAddUserSettingProductName_InvalidToken();
	}

	@Then("I should verify sucessful Post Add User Setting Product Name Invalid Token api test")
	public void i_should_verify_sucessful_post_add_user_setting_product_name_invalid_token_api_test() throws Exception {
		communitySteps.verify_postAddUserSettingProductName_InvalidToken();
	}

	@When("I run Post Add User Setting Product Name No Token api test")
	public void i_run_post_add_user_setting_product_name_no_token_api_test() throws Exception {
		communitySteps.postAddUserSettingProductName_NoToken();
	}

	@Then("I should verify sucessful Post Add User Setting Product Name No Token api test")
	public void i_should_verify_sucessful_post_add_user_setting_product_name_no_token_api_test() throws Exception {
		communitySteps.verify_postAddUserSettingProductName_NoToken();
	}

	@When("I run Post Add User Setting TermsAndConditions api test")
	public void i_run_post_add_user_setting_terms_and_conditions_api_test() throws Exception {
		communitySteps.postAddUserSettingTermsAndConditions();
	}

	@Then("I should verify sucessful Post Add User Setting TermsAndConditions api test")
	public void i_should_verify_sucessful_post_add_user_setting_terms_and_conditions_api_test() throws Exception {
		communitySteps.verify_postAddUserSettingTermsAndConditions();
	}

	@When("I run Post Add User Setting TermsAndConditions Invalid Token api test")
	public void i_run_post_add_user_setting_terms_and_conditions_invalid_token_api_test() throws Exception {
		communitySteps.postAddUserSettingTermsAndConditions_InvalidToken();
	}

	@Then("I should verify sucessful Post Add User Setting TermsAndConditions Invalid Token api test")
	public void i_should_verify_sucessful_post_add_user_setting_terms_and_conditions_invalid_token_api_test()
			throws Exception {
		communitySteps.verify_postAddUserSettingTermsAndConditions_InvalidToken();
	}

	@When("I run Post Add User Setting TermsAndConditions No Token api test")
	public void i_run_post_add_user_setting_terms_and_conditions_no_token_api_test() throws Exception {
		communitySteps.postAddUserSettingTermsAndConditions_NoToken();
	}

	@Then("I should verify sucessful Post Add User Setting TermsAndConditions No Token api test")
	public void i_should_verify_sucessful_post_add_user_setting_terms_and_conditions_no_token_api_test()
			throws Exception {
		communitySteps.verify_postAddUserSettingTermsAndConditions_NoToken();
	}

	@When("I run Post Add User Setting Walkthrough api test")
	public void i_run_post_add_user_setting_walkthrough_api_test() throws Exception {
		communitySteps.postAddUserSettingWalkthrough();
	}

	@Then("I should verify sucessful Post Add User Setting Walkthrough api test")
	public void i_should_verify_sucessful_post_add_user_setting_walkthrough_api_test() throws Exception {
		communitySteps.verify_postAddUserSettingWalkthrough();
	}

	@When("I run Post Add User Setting Walkthrough Invalid Token api test")
	public void i_run_post_add_user_setting_walkthrough_invalid_token_api_test() throws Exception {
		communitySteps.postAddUserSettingWalkthrough_InvalidToken();
	}

	@Then("I should verify sucessful Post Add User Setting Walkthrough Invalid Token api test")
	public void i_should_verify_sucessful_post_add_user_setting_walkthrough_invalid_token_api_test() throws Exception {
		communitySteps.verify_postAddUserSettingWalkthrough_InvalidToken();
	}

	@When("I run Post Add User Setting Walkthrough No Token api test")
	public void i_run_post_add_user_setting_walkthrough_no_token_api_test() throws Exception {
		communitySteps.postAddUserSettingWalkthrough_NoToken();
	}

	@Then("I should verify sucessful Post Add User Setting Walkthrough No Token api test")
	public void i_should_verify_sucessful_post_add_user_setting_walkthrough_no_token_api_test() throws Exception {
		communitySteps.verify_postAddUserSettingWalkthrough_NoToken();
	}

	@When("I run Post Add Reuest Drawdown api test")
	public void i_run_post_add_reuest_drawdown_api_test() throws Exception {
		communitySteps.postAddRequestDrawdown();
	}

	@Then("I should verify sucessful Post Add Reuest Drawdown api test")
	public void i_should_verify_sucessful_post_add_reuest_drawdown_api_test() throws Exception {
		communitySteps.verify_postAddRequestDrawdown();
	}

	@When("I run Post Add Reuest Drawdown Invalid Token api test")
	public void i_run_post_add_reuest_drawdown_invalid_token_api_test() throws Exception {
		communitySteps.postAddRequestDrawdown_InvalidToken();
	}

	@Then("I should verify sucessful Post Add Reuest Drawdown Invalid Token api test")
	public void i_should_verify_sucessful_post_add_reuest_drawdown_invalid_token_api_test() throws Exception {
		communitySteps.verify_postAddRequestDrawdown_InvalidToken();
	}

	@When("I run Post Add Reuest Drawdown NO Token api test")
	public void i_run_post_add_reuest_drawdown_no_token_api_test() throws Exception {
		communitySteps.postAddRequestDrawdown_NoToken();
	}

	@Then("I should verify sucessful Post Add Reuest Drawdown No Token api test")
	public void i_should_verify_sucessful_post_add_reuest_drawdown_no_token_api_test() throws Exception {
		communitySteps.verify_postAddRequestDrawdown_NoToken();
	}

	@When("I run Get Request Drawdown api test")
	public void i_run_get_request_drawdown_api_test() throws Exception {
		communitySteps.getRequestDrawdown();
	}

	@Then("I should verify sucessful Get Request Drawdown api test")
	public void i_should_verify_sucessful_get_request_drawdown_api_test() throws Exception {
		communitySteps.verify_getRequestDrawdown();
	}

	@When("I run Get Request Drawdown Invalid Token api test")
	public void i_run_get_request_drawdown_invalid_token_api_test() throws Exception {
		communitySteps.getRequestDrawdown_InvalidToken();
	}

	@Then("I should verify sucessful Get Request Drawdown Invalid Token api test")
	public void i_should_verify_sucessful_get_request_drawdown_invalid_token_api_test() throws Exception {
		communitySteps.verify_getRequestDrawdown_InvalidToken();
	}

	@When("I run Get Request Drawdown No Token api test")
	public void i_run_get_request_drawdown_no_token_api_test() throws Exception {
		communitySteps.getRequestDrawdown_NoToken();
	}

	@Then("I should verify sucessful Get Request Drawdown No Token api test")
	public void i_should_verify_sucessful_get_request_drawdown_no_token_api_test() throws Exception {
		communitySteps.verify_getRequestDrawdown_NoToken();
	}

	@When("I run Patch Request Drawdown api test")
	public void i_run_patch_request_drawdown_api_test() throws Exception {
		communitySteps.patchRequestDrawdown();
	}

	@Then("I should verify sucessful Patch Request Drawdown api test")
	public void i_should_verify_sucessful_patch_request_drawdown_api_test() throws Exception {
		communitySteps.verify_patchRequestDrawdown();
	}

	@When("I run Patch Request Drawdown Invalid Token api test")
	public void i_run_patch_request_drawdown_invalid_token_api_test() throws Exception {
		communitySteps.patchRequestDrawdown_InvalidToken();
	}

	@Then("I should verify sucessful Patch Request Drawdown Invalid Token api test")
	public void i_should_verify_sucessful_patch_request_drawdown_invalid_token_api_test() throws Exception {
		communitySteps.verify_patchRequestDrawdown_InvalidToken();
	}

	@When("I run Patch Request Drawdown No Token api test")
	public void i_run_patch_request_drawdown_no_token_api_test() throws Exception {
		communitySteps.patchRequestDrawdown_NoToken();
	}

	@Then("I should verify sucessful Patch Request Drawdown No Token api test")
	public void i_should_verify_sucessful_patch_request_drawdown_no_token_api_test() throws Exception {
		communitySteps.verify_patchRequestDrawdown_NoToken();
	}

	@When("I run Get Statements api test")
	public void i_run_get_statements_api_test() throws Exception {
		communitySteps.getStatements();
	}

	@Then("I should verify sucessful Get Statements api test")
	public void i_should_verify_sucessful_get_statements_api_test() throws Exception {
		communitySteps.verify_getStatements();
	}

	@When("I run Get Statements Invalid Token api test")
	public void i_run_get_statements_invalid_token_api_test() throws Exception {
		communitySteps.getStatements_InvalidToken();
	}

	@Then("I should verify sucessful Get Statements Invalid Token api test")
	public void i_should_verify_sucessful_get_statements_invalid_token_api_test() throws Exception {
		communitySteps.verify_getStatements_InvalidToken();
	}

	@When("I run Get Statements No Token api test")
	public void i_run_get_statements_no_token_api_test() throws Exception {
		communitySteps.getStatements_NoToken();
	}

	@Then("I should verify sucessful Get Statements No Token api test")
	public void i_should_verify_sucessful_get_statements_no_token_api_test() throws Exception {
		communitySteps.verify_getStatements_NoToken();
	}

	@When("I run Get Statement PDF api test")
	public void i_run_get_statement_pdf_api_test() throws Exception {
		communitySteps.getStatementPDF();
	}

	@Then("I should verify sucessful Get Statement PDF api test")
	public void i_should_verify_sucessful_get_statement_pdf_api_test() throws Exception {
		communitySteps.verify_getStatementPDF();
	}

	@When("I run Get Statement PDF Invalid Token api test")
	public void i_run_get_statement_pdf_invalid_token_api_test() throws Exception {
		communitySteps.getStatementPDF_InvalidToken();
	}

	@Then("I should verify sucessful Get Statement PDF Invalid Token api test")
	public void i_should_verify_sucessful_get_statement_pdf_invalid_token_api_test() throws Exception {
		communitySteps.verify_getStatementPDF_InvalidToken();
	}

	@When("I run Get Statement PDF No Token api test")
	public void i_run_get_statement_pdf_no_token_api_test() throws Exception {
		communitySteps.getStatementPDF_NoToken();
	}

	@Then("I should verify sucessful Get Statement PDF No Token api test")
	public void i_should_verify_sucessful_get_statement_pdf_no_token_api_test() throws Exception {
		communitySteps.verify_getStatementPDF_NoToken();
	}

	@When("I run Post Statement Email api test")
	public void i_run_post_statement_email_api_test() throws Exception {
		communitySteps.postStatementEmail();
	}

	@Then("I should verify sucessful Post Statement Email api test")
	public void i_should_verify_sucessful_post_statement_email_api_test() throws Exception {
		communitySteps.verify_postStatementEmail();
	}

	@When("I run Post Statement Email Invalid Token api test")
	public void i_run_post_statement_email_invalid_token_api_test() throws Exception {
		communitySteps.postStatementEmail_InvalidToken();
	}

	@Then("I should verify sucessful Post Statement Email Invalid Token api test")
	public void i_should_verify_sucessful_post_statement_email_invalid_token_api_test() throws Exception {
		communitySteps.verify_postStatementEmail_InvalidToken();
	}

	@When("I run Post Statement Email No Token api test")
	public void i_run_post_statement_email_no_token_api_test() throws Exception {
		communitySteps.postStatementEmail_NoToken();
	}

	@Then("I should verify sucessful Post Statement Email No Token api test")
	public void i_should_verify_sucessful_post_statement_email_no_token_api_test() throws Exception {
		communitySteps.verify_postStatementEmail_NoToken();
	}

	@When("I run Get User api test")
	public void i_run_get_user_api_test() throws Exception {
		communitySteps.getUser();
	}

	@Then("I should verify sucessful Get User api test")
	public void i_should_verify_sucessful_get_user_api_test() throws Exception {
		communitySteps.verify_getUser();
	}

	@When("I run Get User Invalid Token api test")
	public void i_run_get_user_invalid_token_api_test() throws Exception {
		communitySteps.getUser_InvalidToken();
	}

	@Then("I should verify sucessful Get User Invalid Token api test")
	public void i_should_verify_sucessful_get_user_invalid_token_api_test() throws Exception {
		communitySteps.verify_getUser_InvalidToken();
	}

	@When("I run Get User No Token api test")
	public void i_run_get_user_no_token_api_test() throws Exception {
		communitySteps.getUser_NoToken();
	}

	@Then("I should verify sucessful Get User No Token api test")
	public void i_should_verify_sucessful_get_user_no_token_api_test() throws Exception {
		communitySteps.verify_getUser_NoToken();
	}

	@When("I run Post Send Verification Code api test")
	public void i_run_post_send_verification_code_api_test() throws Exception {
		communitySteps.postSendVerificationCode();
	}

	@Then("I should verify sucessful Post Send Verification Code api test")
	public void i_should_verify_sucessful_post_send_verification_code_api_test() throws Exception {
		communitySteps.verify_postSendVerificationCode();
	}

	@When("I run Post Send Verification Code Invalid Token api test")
	public void i_run_post_send_verification_code_invalid_token_api_test() throws Exception {
		communitySteps.postSendVerificationCode_InvalidToken();
	}

	@Then("I should verify sucessful Post Send Verification Code Invalid Token api test")
	public void i_should_verify_sucessful_post_send_verification_code_invalid_token_api_test() throws Exception {
		communitySteps.verify_postSendVerificationCode_InvalidToken();
	}

	@When("I run Post Send Verification Code No Token api test")
	public void i_run_post_send_verification_code_no_token_api_test() throws Exception {
		communitySteps.postSendVerificationCode_NoToken();
	}

	@Then("I should verify sucessful Post Send Verification Code No Token api test")
	public void i_should_verify_sucessful_post_send_verification_code_no_token_api_test() throws Exception {
		communitySteps.verify_postSendVerificationCode_NoToken();
	}

	@When("I run Post User Message api test")
	public void i_run_post_user_message_api_test() throws Exception {
		communitySteps.postUserMessage();
	}

	@Then("I should verify sucessful Post User Message api test")
	public void i_should_verify_sucessful_post_user_message_api_test() throws Exception {
		communitySteps.verify_postUserMessage();
	}

	@When("I run Post User Message Invalid Token api test")
	public void i_run_post_user_message_invalid_token_api_test() throws Exception {
		communitySteps.postUserMessage_InvalidToken();
	}

	@Then("I should verify sucessful Post User Message Invalid Token api test")
	public void i_should_verify_sucessful_post_user_message_invalid_token_api_test() throws Exception {
		communitySteps.verify_postUserMessage_InvalidToken();
	}

	@When("I run Post User Message No Token api test")
	public void i_run_post_user_message_no_token_api_test() throws Exception {
		communitySteps.postUserMessage_NoToken();
	}

	@Then("I should verify sucessful Post User Message No Token api test")
	public void i_should_verify_sucessful_post_user_message_no_token_api_test() throws Exception {
		communitySteps.verify_postUserMessage_NoToken();
	}

	@When("I run Get User Message api test")
	public void i_run_get_user_message_api_test() throws Exception {
		communitySteps.getUserMessage();
	}

	@Then("I should verify sucessful Get User Message api test")
	public void i_should_verify_sucessful_get_user_message_api_test() throws Exception {
		communitySteps.verify_getUserMessage();
	}

	@When("I run Get User Message Invalid Token api test")
	public void i_run_get_user_message_invalid_token_api_test() throws Exception {
		communitySteps.getUserMessage_InvalidToken();
	}

	@Then("I should verify sucessful Get User Message Invalid Token api test")
	public void i_should_verify_sucessful_get_user_message_invalid_token_api_test() throws Exception {
		communitySteps.verify_getUserMessage_InvalidToken();
	}

	@When("I run Get User Message No Token api test")
	public void i_run_get_user_message_no_token_api_test() throws Exception {
		communitySteps.getUserMessage_NoToken();
	}

	@Then("I should verify sucessful Get User Message No Token api test")
	public void i_should_verify_sucessful_get_user_message_no_token_api_test() throws Exception {
		communitySteps.verify_getUserMessage_NoToken();
	}

	@When("I run Patch User Message api test")
	public void i_run_patch_user_message_api_test() throws Exception {
		communitySteps.patchUserMessage();
	}

	@Then("I should verify sucessful Patch User Message api test")
	public void i_should_verify_sucessful_patch_user_message_api_test() throws Exception {
		communitySteps.verify_patchUserMessage();
	}

	@When("I run Patch User Message Invalid Token api test")
	public void i_run_patch_user_message_invalid_token_api_test() throws Exception {
		communitySteps.patchUserMessage_InvalidToken();
	}

	@Then("I should verify sucessful Patch User Message Invalid Token api test")
	public void i_should_verify_sucessful_patch_user_message_invalid_token_api_test() throws Exception {
		communitySteps.verify_patchUserMessage_InvalidToken();
	}

	@When("I run Patch User Message No Token api test")
	public void i_run_patch_user_message_no_token_api_test() throws Exception {
		communitySteps.patchUserMessage_NoToken();
	}

	@Then("I should verify sucessful Patch User Message No Token api test")
	public void i_should_verify_sucessful_patch_user_message_no_token_api_test() throws Exception {
		communitySteps.verify_getUserMessage_NoToken();
	}

	@When("I run Get App Settings api test")
	public void i_run_get_app_settings_api_test() throws Exception {
		communitySteps.getAppSettings();
	}

	@Then("I should verify sucessful Get App Settings api test")
	public void i_should_verify_sucessful_get_app_settings_api_test() throws Exception {
		communitySteps.verify_getAppSettings();
	}

	@When("I run Get App Settings Invalid Token api test")
	public void i_run_get_app_settings_invalid_token_api_test() throws Exception {
		communitySteps.getAppSettings_InvalidToken();
	}

	@Then("I should verify sucessful Get App Settings Invalid Token api test")
	public void i_should_verify_sucessful_get_app_settings_invalid_token_api_test() throws Exception {
		communitySteps.verify_getAppSettings_InvalidToken();
	}

	@When("I run Get App Settings No Token api test")
	public void i_run_get_app_settings_no_token_api_test() throws Exception {
		communitySteps.getAppSettings_NoToken();
	}

	@Then("I should verify sucessful Get App Settings No Token api test")
	public void i_should_verify_sucessful_get_app_settings_no_token_api_test() throws Exception {
		communitySteps.verify_getAppSettings_NoToken();
	}

	@When("I run Get Designated Accounts api test")
	public void i_run_get_designated_accounts_api_test() throws Exception {
		communitySteps.getDesignatedAccounts();
	}

	@Then("I should verify sucessful Get Designated Accounts api test")
	public void i_should_verify_sucessful_get_designated_accounts_api_test() throws Exception {
		communitySteps.verify_getDesignatedAccounts();
	}

	@When("I run Get Designated Accounts Invalid Token api test")
	public void i_run_get_designated_accounts_invalid_token_api_test() throws Exception {
		communitySteps.getDesignatedAccounts_InvalidToken();
	}

	@Then("I should verify sucessful Get Designated Accounts Invalid Token api test")
	public void i_should_verify_sucessful_get_designated_accounts_invalid_token_api_test() throws Exception {
		communitySteps.verify_getDesignatedAccounts_InvalidToken();
		;
	}

	@When("I run Get Designated Accounts No Token api test")
	public void i_run_get_designated_accounts_no_token_api_test() throws Exception {
		communitySteps.getDesignatedAccounts_NoToken();
	}

	@Then("I should verify sucessful Get Designated Accounts No Token api test")
	public void i_should_verify_sucessful_get_designated_accounts_no_token_api_test() throws Exception {
		communitySteps.verify_getDesignatedAccounts_NoToken();
	}

	@When("I run Get Content Name api test")
	public void i_run_get_content_name_api_test() throws Exception {
		communitySteps.getContentName();
	}

	@Then("I should verify sucessful Get Content Name api test")
	public void i_should_verify_sucessful_get_content_name_api_test() throws Exception {
		communitySteps.verify_getContentName();
	}

	@When("I run Get Content Name Invalid Token api test")
	public void i_run_get_content_name_invalid_token_api_test() throws Exception {
		communitySteps.getContentName_InvalidToken();
	}

	@Then("I should verify sucessful Get Content Name Invalid Token api test")
	public void i_should_verify_sucessful_get_content_name_invalid_token_api_test() throws Exception {
		communitySteps.verify_getContentName_InvalidToken();
	}

	@When("I run Get Content Name No Token api test")
	public void i_run_get_content_name_no_token_api_test() throws Exception {
		communitySteps.getContentName_NoToken();
	}

	@Then("I should verify sucessful Get Content Name No Token api test")
	public void i_should_verify_sucessful_get_content_name_no_token_api_test() throws Exception {
		communitySteps.verify_getContentName_NoToken();
	}

	@When("I run Get Notifications api test")
	public void i_run_get_notifications_api_test() throws Exception {
		communitySteps.getNotifications();
	}

	@Then("I should verify sucessful Get Notifications api test")
	public void i_should_verify_sucessful_get_notifications_api_test() throws Exception {
		communitySteps.verify_getNotifications();
	}

	@When("I run Get Notifications Invalid Token api test")
	public void i_run_get_notifications_invalid_token_api_test() throws Exception {
		communitySteps.getNotifications_InvalidToken();
	}

	@Then("I should verify sucessful Get Notifications Invalid Token api test")
	public void i_should_verify_sucessful_get_notifications_invalid_token_api_test() throws Exception {
		communitySteps.verify_getNotifications_InvalidToken();
	}

	@When("I run Get Notifications No Token api test")
	public void i_run_get_notifications_no_token_api_test() throws Exception {
		communitySteps.getNotifications_NoToken();
	}

	@Then("I should verify sucessful Get Notifications No Token api test")
	public void i_should_verify_sucessful_get_notifications_no_token_api_test() throws Exception {
		communitySteps.verify_getNotifications_NoToken();
	}

	@When("I run Get Occupations api test")
	public void i_run_get_occupations_api_test() throws Exception {
		communitySteps.getOccupations();
	}

	@Then("I should verify sucessful Get Occupations api test")
	public void i_should_verify_sucessful_get_occupations_api_test() throws Exception {
		communitySteps.verify_getOccupations();
	}

	@When("I run Post Check Register Existing User api test")
	public void i_run_post_check_register_existing_user_api_test() throws Exception {
		communitySteps.postCheckRegisterExistingUser();
	}

	@Then("I should verify sucessful Post Check Register Existing User api test")
	public void i_should_verify_sucessful_post_check_register_existing_user_api_test() throws Exception {
		communitySteps.verify_postCheckRegisterExistingUser();
	}

	@When("I run Patch Request Direct Debit Integration api test")
	public void i_run_patch_request_direct_debit_integration_api_test() throws Exception {
		communitySteps.patchRequestDirectDebitIntegration();
	}

	@Then("I should verify sucessful Patch Request Direct Debit Integration api test")
	public void i_should_verify_sucessful_patch_request_direct_debit_integration_api_test() throws Exception {
		communitySteps.verify_patchRequestDirectDebitIntegration();
	}

	@When("I run Patch Request Drawdown Integration api test")
	public void i_run_patch_request_drawdown_integration_api_test() throws Exception {
		communitySteps.patchRequestDrawdownIntegration();
	}

	@Then("I should verify sucessful Patch Request Drawdown Integration api test")
	public void i_should_verify_sucessful_patch_request_drawdown_integration_api_test() throws Exception {
		communitySteps.verify_patchRequestDrawdownIntegration();
	}

	@When("I run Get Transactions api test")
	public void i_run_get_transactions_api_test() throws Exception {
		communitySteps.getTransactions();
	}

	@Then("I should verify sucessful Get Transactions api test")
	public void i_should_verify_sucessful_get_transactions_api_test() throws Exception {
		communitySteps.verify_getTransactions();
	}

	@When("I run Get Transactions Invalid Token api test")
	public void i_run_get_transactions_invalid_token_api_test() throws Exception {
		communitySteps.getTransactions_InvalidToken();
	}

	@Then("I should verify sucessful Get Transactions Invalid Token api test")
	public void i_should_verify_sucessful_get_transactions_invalid_token_api_test() throws Exception {
		communitySteps.verify_getTransactions_InvalidToken();
	}

	@When("I run Get Transactions No Token api test")
	public void i_run_get_transactions_no_token_api_test() throws Exception {
		communitySteps.getTransactions_NoToken();
	}

	@Then("I should verify sucessful Get Transactions No Token api test")
	public void i_should_verify_sucessful_get_transactions_no_token_api_test() throws Exception {
		communitySteps.verify_getTransactions_NoToken();
	}

	@When("I run Patch User Message Integration api test")
	public void i_run_patch_user_message_integration_api_test() throws Exception {
		communitySteps.patchUserMessageIntegration();
	}

	@Then("I should verify sucessful Patch User Message Integration api test")
	public void i_should_verify_sucessful_patch_user_message_integration_api_test() throws Exception {
		communitySteps.verify_patchUserMessageIntegration();
	}

	@When("I run Get Values api test")
	public void i_run_get_values_api_test() throws Exception {
		communitySteps.getValues();
	}

	@Then("I should verify sucessful Get Values api test")
	public void i_should_verify_sucessful_get_values_api_test() throws Exception {
		communitySteps.verify_getValues();
	}
	
	@When("I run Find pet by Id api test")
	public void i_run_find_pet_by_id_api_test() throws Exception {
		communitySteps.findPetById();
	}

	@Then("I should verify sucessful Find pet by Id api test")
	public void i_should_verify_sucessful_find_pet_by_id_api_test() throws Exception {
		communitySteps.verifyPetById();
	}
	
	@When("I run Update Pet Name api test")
	public void i_run_update_pet_name_api_test() throws Exception {
		communitySteps.updatePetName();
	}

	@Then("I should verify sucessful Update Pet Name api test")
	public void i_should_verify_sucessful_update_pet_name_api_test() throws Exception {
		communitySteps.verifyPetName();
	}

	@When("I run Get Delete Pet api test")
	public void i_run_get_delete_pet_api_test() throws Exception {
		communitySteps.deletePet();
	}

	@Then("I should verify sucessful Delete Pet api test")
	public void i_should_verify_sucessful_delete_pet_api_test() throws Exception {
		communitySteps.verifyDeletePet();
	}


}
