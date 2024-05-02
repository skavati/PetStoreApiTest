package webapitest.methods;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CommunityApiMethods {
	static Response response;
	static String id;
	static String userMessageId;

	public static String getUserMessageId() {
		return userMessageId;
	}

	public static void setUserMessageId(String userMessageId) {
		CommunityApiMethods.userMessageId = userMessageId;
	}

	public static Response getResponse() {
		return response;
	}

	public static void setResponse(Response response) {
		CommunityApiMethods.response = response;
	}

	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		CommunityApiMethods.id = id;
	}

	public boolean getConsultants() throws Exception {
		/*
		 * String code=CommonMethods.getAuthCode(); Response response =
		 * CommonMethods.getAccessTokenResponse(code); String token =
		 * CommonMethods.parseForOAuth2Code(response);
		 */

		try {
			// RestAssured.baseURI = CommonMethods.getCSVData("URL");
			Response resp = given().when().contentType(ContentType.JSON)
					.get("https://community-api-uat.credabl.com.au/v1/consultants/credabl");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verifyGetConsultants() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String firstName = jsonPath.getString("data[0].first_name");
			if (!firstName.contentEquals("Liam")) {
				throw new Exception("First name is not verified");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getConsultant() throws Exception {
		try {
			String id = CommonMethods.getCSVData("ID");
			Response resp = given().pathParam("id", id).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/consultants/credabl/{id}");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verifyGetConsultant() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String obj = jsonPath.getString("object");
			if (!obj.contentEquals("consultant")) {
				throw new Exception("object is not verified");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getEntities() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getToken()).when().contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/entities?offset=0&limit=20");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verifyGetEntities() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String productName = jsonPath.getString("data[0].contracts[0].product_name");
			CommonMethods.setStepInfo(
					"Expected 'Product Name':Busines Overdraft" + "<br />" + "Actual 'Product Name':" + productName);
			if (!productName.contentEquals("Business Overdraft")) {
				throw new Exception("Product name is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getEntities_InvalidToken() throws Exception {
		try {
			String token = CommonMethods.getInvalidToken();
			Response resp = given().auth().oauth2(token)
					.get(CommonMethods.getCSVData("URL") + "/v1/entities?offset=0&limit=20");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verifyGetEntities_InvalidToken() throws Exception {
		try {
			Integer code = response.getStatusCode();
			CommonMethods.setStepInfo("Expected Status code:401" + "<br />" + "Actual Status code:" + code);
			if (code != 401) {
				throw new Exception("Status code mismatched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getEntities_NoToken() throws Exception {
		try {
			Response resp = given().get(CommonMethods.getCSVData("URL") + "/v1/entities?offset=0&limit=20");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verifyGetEntities_NoToken() throws Exception {
		try {
			Integer code = response.getStatusCode();
			CommonMethods.setStepInfo("Expected Status code:401" + "<br />" + "Actual Status code:" + code);
			if (code != 401) {
				throw new Exception("Status code mismatched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getEntityById() throws Exception {
		try {
			String entityId = CommonMethods.getCSVData("EntityId");
			Response resp = given().auth().oauth2(CommonMethods.getToken()).pathParam("entity_id", entityId)
					.contentType(ContentType.JSON).get(CommonMethods.getCSVData("URL") + "/v1/entities//{entity_id}");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verifyGetEntityById() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String productName = jsonPath.getString("contracts[0].product_name");
			CommonMethods.setStepInfo(
					"Expected 'Product Name':Busines Overdraft" + "<br />" + "Actual 'Product Name':" + productName);
			if (!productName.contentEquals("Business Overdraft")) {
				throw new Exception("Product name is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getEntityById_InavlidToken() throws Exception {
		try {
			String entityId = CommonMethods.getCSVData("EntityId");
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).pathParam("entity_id", entityId)
					.contentType(ContentType.JSON).get(CommonMethods.getCSVData("URL") + "/v1/entities//{entity_id}");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verifyGetEntityById_InavlidToken() throws Exception {
		try {
			Integer code = response.getStatusCode();
			CommonMethods.setStepInfo("Expected Status code:401" + "<br />" + "Actual Status code:" + code);
			if (code != 401) {
				throw new Exception("Status code mismatched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getEntityById_NoToken() throws Exception {
		try {
			String entityId = CommonMethods.getCSVData("EntityId");
			Response resp = given().pathParam("entity_id", entityId).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/entities//{entity_id}");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_Invalid_or_NoToken() throws Exception {
		try {
			Integer code = response.getStatusCode();
			CommonMethods.setStepInfo("Expected Status code:401" + "<br />" + "Actual Status code:" + code);
			if (code != 401) {
				throw new Exception("Status code mismatched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postRequestDirectDebit() throws Exception {
		try {
			String jsonBody = "{\"object\":\"request_direct_debit\",\"to_contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"from_designated_account_id\":\"af00177b-0ac4-46f8-aafd-ad0b2aab15cf\",\"amount\":5000,\"comment\":\"Requestadirectdebit\",\"request_date_utc\":1624583526220}";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/request_direct_debit");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_PostRequestDirectDebit() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String bankName = jsonPath.getString("bank_name");
			String id = jsonPath.getString("id");
			setId(id);
			CommonMethods.setStepInfo("Expected 'Bank Name':NAB" + "<br />" + "Actual 'Bank Name':" + bankName);
			if (!bankName.contentEquals("NAB")) {
				throw new Exception("Bank Name is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postRequestDirectDebit_InvalidToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"request_direct_debit\",\"to_contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"from_designated_account_id\":\"af00177b-0ac4-46f8-aafd-ad0b2aab15cf\",\"amount\":5000,\"comment\":\"Requestadirectdebit\",\"request_date_utc\":1624583526220}";
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).body(jsonBody)
					.contentType(ContentType.JSON).post(CommonMethods.getCSVData("URL") + "/v1/request_direct_debit");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_PostRequestDirectDebit_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postRequestDirectDebit_NoToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"request_direct_debit\",\"to_contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"from_designated_account_id\":\"af00177b-0ac4-46f8-aafd-ad0b2aab15cf\",\"amount\":5000,\"comment\":\"Requestadirectdebit\",\"request_date_utc\":1624583526220}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/request_direct_debit");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_PostRequestDirectDebit_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getRequestDirectDebit() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getToken()).when().contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/request_direct_debit?offset=0&limit=20");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getRequestDirectDebit() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String bankName = jsonPath.getString("data[0].bank_name");
			CommonMethods.setStepInfo("Expected 'Bank Name':NAB" + "<br />" + "Actual 'Bank Name':" + bankName);
			if (!bankName.contentEquals("NAB")) {
				throw new Exception("Bank Name is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getRequestDirectDebit_InvalidToken() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).when().contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/request_direct_debit?offset=0&limit=20");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getRequestDirectDebit_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getRequestDirectDebit_NoToken() throws Exception {
		try {
			Response resp = given().when().contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/request_direct_debit?offset=0&limit=20");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getRequestDirectDebit_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean patchRequestDirectDebit() throws Exception {
		try {
			String jsonBody = "{\"id\":\"" + id
					+ "\",\"object\":\"request_direct_debit\",\"request_status\":\"Cancelled\"}";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).body(jsonBody).contentType(ContentType.JSON)
					.patch(CommonMethods.getCSVData("URL") + "/v1/request_direct_debit/" + id);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchRequestDirectDebit() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			// String bankName = jsonPath.getString("bank_name");
			String bankName = jsonPath.getString("bank_name");
			CommonMethods.setStepInfo("Expected 'Bank Name':NAB" + "<br />" + "Actual 'Bank Name':" + bankName);
			if (!bankName.contentEquals("NAB")) {
				throw new Exception("Bank Name is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean patchRequestDirectDebit_InvalidToken() throws Exception {
		try {
			String jsonBody = "{\"id\":\"" + id
					+ "\",\"object\":\"request_direct_debit\",\"request_status\":\"Cancelled\"}";
			Response resp = given().auth().oauth2(CommonMethods.invalidToken).body(jsonBody)
					.contentType(ContentType.JSON)
					.patch(CommonMethods.getCSVData("URL") + "/v1/request_direct_debit/" + id);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchRequestDirectDebit_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean patchRequestDirectDebit_NoToken() throws Exception {
		try {
			String jsonBody = "{\"id\":\"" + id
					+ "\",\"object\":\"request_direct_debit\",\"request_status\":\"Cancelled\"}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON)
					.patch(CommonMethods.getCSVData("URL") + "/v1/request_direct_debit/" + id);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchRequestDirectDebit_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getUserSetting() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getToken()).when().contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/user_settings");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_GetUserSetting() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String name = jsonPath.getString("data[0].name");
			CommonMethods.setStepInfo("Expected 'name':productname" + "<br />" + "Actual 'name':" + name);
			if (!name.contentEquals("productname")) {
				throw new Exception("Name is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getUserSetting_InvalidToken() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).when().contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/user_settings");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getUserSetting_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getUserSetting_NoToken() throws Exception {
		try {
			Response resp = given().when().contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/user_settings");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getUserSetting_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postAddUserSetting() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"id\":\"dd325016-3cfe-4c15-8dbd-08d9fbffb905\",\"contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"name\":\"productname\",\"value\":\"VehicleLoan\"}";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSetting() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String value = jsonPath.getString("value");
			CommonMethods.setStepInfo("Expected 'value':Vehicle Loan" + "<br />" + "Actual 'value':" + value);
			if (!value.contentEquals("VehicleLoan")) {
				throw new Exception("Value is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postAddUserSetting_InvalidToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"id\":\"dd325016-3cfe-4c15-8dbd-08d9fbffb905\",\"contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"name\":\"productname\",\"value\":\"VehicleLoan\"}";
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).body(jsonBody)
					.contentType(ContentType.JSON).post(CommonMethods.getCSVData("URL") + "/v1/user_settings");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSetting_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postAddUserSetting_NoToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"id\":\"dd325016-3cfe-4c15-8dbd-08d9fbffb905\",\"contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"name\":\"productname\",\"value\":\"VehicleLoan\"}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSetting_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postAddUserSettingProductName() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"id\":\"dd325016-3cfe-4c15-8dbd-08d9fbffb905\",\"contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"name\":\"productname\",\"value\":\"VehicleLoan\"}";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings/product_name");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSettingProductName() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String value = jsonPath.getString("value");
			CommonMethods.setStepInfo("Expected 'value':Vehicle Loan" + "<br />" + "Actual 'value':" + value);
			if (!value.contentEquals("VehicleLoan")) {
				throw new Exception("Value is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postAddUserSettingProductName_InvalidToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"id\":\"dd325016-3cfe-4c15-8dbd-08d9fbffb905\",\"contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"name\":\"productname\",\"value\":\"VehicleLoan\"}";
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).body(jsonBody)
					.contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings/product_name");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSettingProductName_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postAddUserSettingProductName_NoToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"id\":\"dd325016-3cfe-4c15-8dbd-08d9fbffb905\",\"contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"name\":\"productname\",\"value\":\"VehicleLoan\"}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings/product_name");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSettingProductName_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postAddUserSettingTermsAndConditions() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"name\":\"termsandconditions\",\"value\":true}";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings/terms_and_conditions");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSettingTermsAndConditions() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String name = jsonPath.getString("name");
			CommonMethods.setStepInfo("Expected 'name':termsandconditions" + "<br />" + "Actual 'value':" + name);
			if (!name.contentEquals("termsandconditions")) {
				throw new Exception("Name is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postAddUserSettingTermsAndConditions_InvalidToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"name\":\"termsandconditions\",\"value\":true}";
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).body(jsonBody)
					.contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings/terms_and_conditions");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSettingTermsAndConditions_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postAddUserSettingTermsAndConditions_NoToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"name\":\"termsandconditions\",\"value\":true}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings/terms_and_conditions");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSettingTermsAndConditions_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postAddUserSettingWalkthrough() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"name\":\"walkthrough\",\"value\":true}";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings/walkthrough");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSettingWalkthrough() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String name = jsonPath.getString("name");
			CommonMethods.setStepInfo("Expected 'name':walkthrough" + "<br />" + "Actual 'value':" + name);
			if (!name.contentEquals("walkthrough")) {
				throw new Exception("Name is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postAddUserSettingWalkthrough_InvalidToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"request_drawdown\",\"from_contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"to_designated_account_id\":\"af00177b-0ac4-46f8-aafd-ad0b2aab15cf\",\"amount\":3000,\"request_date_utc\":1647923660000,\"comment\":\"RequestaDrawdown\"}";
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).body(jsonBody)
					.contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings/walkthrough");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSettingWalkthrough_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postAddUserSettingWalkthrough_NoToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"user_settings\",\"name\":\"walkthrough\",\"value\":true}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user_settings/walkthrough");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddUserSettingWalkthrough_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postAddRequestDrawdown() throws Exception {
		try {
			String jsonBody = "{\"object\":\"request_drawdown\",\"from_contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"to_designated_account_id\":\"af00177b-0ac4-46f8-aafd-ad0b2aab15cf\",\"amount\":3000,\"request_date_utc\":1647923660000,\"comment\":\"RequestaDrawdown\"}";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/request_drawdown");
			setResponse(resp);
			String id = resp.toString();

			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddRequestDrawdown() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String name = jsonPath.getString("bank_name");
			String id = jsonPath.getString("id");
			setId(id);
			CommonMethods.setStepInfo("Expected 'ban_name':NAB" + "<br />" + "Actual 'value':" + name);
			if (!name.contentEquals("NAB")) {
				throw new Exception("bank_name is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postAddRequestDrawdown_InvalidToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"request_drawdown\",\"from_contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"to_designated_account_id\":\"af00177b-0ac4-46f8-aafd-ad0b2aab15cf\",\"amount\":3000,\"request_date_utc\":1647923660000,\"comment\":\"RequestaDrawdown\"}";
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).body(jsonBody)
					.contentType(ContentType.JSON).post(CommonMethods.getCSVData("URL") + "/v1/request_drawdown");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddRequestDrawdown_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postAddRequestDrawdown_NoToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"request_drawdown\",\"from_contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"to_designated_account_id\":\"af00177b-0ac4-46f8-aafd-ad0b2aab15cf\",\"amount\":3000,\"request_date_utc\":1647923660000,\"comment\":\"RequestaDrawdown\"}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/request_drawdown");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postAddRequestDrawdown_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getRequestDrawdown() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/request_drawdown");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getRequestDrawdown() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String name = jsonPath.getString("data[0].bank_name");
			CommonMethods.setStepInfo("Expected 'ban_name':NAB" + "<br />" + "Actual 'value':" + name);
			if (!name.contentEquals("NAB")) {
				throw new Exception("bank_name is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getRequestDrawdown_InvalidToken() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/request_drawdown");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getRequestDrawdown_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getRequestDrawdown_NoToken() throws Exception {
		try {
			Response resp = given().contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/request_drawdown");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getRequestDrawdown_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean patchRequestDrawdown() throws Exception {
		try {
			String jsonBody = "{\"id\":\"" + id + "\",\"object\":\"request_drawdown\"}";
			Response resp = given().pathParam("id", id).auth().oauth2(CommonMethods.getToken()).body(jsonBody)
					.contentType(ContentType.JSON).patch(CommonMethods.getCSVData("URL") + "/v1/request_drawdown/{id}");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchRequestDrawdown() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String name = jsonPath.getString("object");
			CommonMethods.setStepInfo("Expected 'object':request_drawdown" + "<br />" + "Actual 'value':" + name);
			if (!name.contentEquals("request_drawdown")) {
				throw new Exception("object is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean patchRequestDrawdown_InvalidToken() throws Exception {
		try {
			String jsonBody = "{\"id\":\"" + id + "\",\"object\":\"request_drawdown\"}";
			Response resp = given().pathParam("id", id).auth().oauth2(CommonMethods.getInvalidToken()).body(jsonBody)
					.contentType(ContentType.JSON).patch(CommonMethods.getCSVData("URL") + "/v1/request_drawdown/{id}");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchRequestDrawdown_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean patchRequestDrawdown_NoToken() throws Exception {
		try {
			String jsonBody = "{\"id\":\"" + id + "\",\"object\":\"request_drawdown\"}";
			Response resp = given().pathParam("id", id).body(jsonBody).contentType(ContentType.JSON)
					.patch(CommonMethods.getCSVData("URL") + "/v1/request_drawdown/{id}");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchRequestDrawdown_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getStatements() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL")
							+ "/v1/statements?contract_id=548589d5-5964-40ef-9d42-9e379123c091&offset=0&limit=20");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getStatements() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String name = jsonPath.getString("data[0].object");
			CommonMethods.setStepInfo("Expected 'object':statement" + "<br />" + "Actual 'value':" + name);
			if (!name.contentEquals("statement")) {
				throw new Exception("object is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getStatements_InvalidToken() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL")
							+ "/v1/statements?contract_id=548589d5-5964-40ef-9d42-9e379123c091&offset=0&limit=20");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getStatements_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getStatements_NoToken() throws Exception {
		try {
			Response resp = given().contentType(ContentType.JSON).get(CommonMethods.getCSVData("URL")
					+ "/v1/statements?contract_id=548589d5-5964-40ef-9d42-9e379123c091&offset=0&limit=20");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getStatements_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getStatementPDF() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getToken())
					.pathParam("id", "1f6483c2-9e98-402c-a9c6-0b2ca6484f63").contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/statements/{id}/pdf");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getStatementPDF() throws Exception {
		try {
			String status = response.getStatusLine();
			CommonMethods.setStepInfo("Expected 'status line':HTTP/1.1 200 OK" + "<br />" + "Actual 'value':" + status);
			if (!status.contentEquals("HTTP/1.1 200 OK")) {
				throw new Exception("status line is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getStatementPDF_InvalidToken() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken())
					.pathParam("id", "1f6483c2-9e98-402c-a9c6-0b2ca6484f63").contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/statements/{id}/pdf");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getStatementPDF_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getStatementPDF_NoToken() throws Exception {
		try {
			Response resp = given().pathParam("id", "1f6483c2-9e98-402c-a9c6-0b2ca6484f63")
					.contentType(ContentType.JSON).get(CommonMethods.getCSVData("URL") + "/v1/statements/{id}/pdf");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getStatementPDF_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postStatementEmail() throws Exception {
		try {
			String jsonBody = "{\"object\":\"statement\",\"ids\":[\"1f6483c2-9e98-402c-a9c6-0b2ca6484f63\"],\"to\":\"testTo@credabl.com.au\"}";
			Response resp = given().body(jsonBody).auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/statements/email");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postStatementEmail() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String requestStatus = jsonPath.getString("request_status");
			CommonMethods.setStepInfo("Expected 'request-status':Sent" + "<br />" + "Actual 'value':" + requestStatus);
			if (!requestStatus.contentEquals("Sent")) {
				throw new Exception("Request status is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postStatementEmail_InvalidToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"statement\",\"ids\":[\"1f6483c2-9e98-402c-a9c6-0b2ca6484f63\"],\"to\":\"testTo@credabl.com.au\"}";
			Response resp = given().body(jsonBody).auth().oauth2(CommonMethods.getInvalidToken())
					.contentType(ContentType.JSON).post(CommonMethods.getCSVData("URL") + "/v1/statements/email");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postStatementEmail_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postStatementEmail_NoToken() throws Exception {
		try {
			String jsonBody = "{\"object\":\"statement\",\"ids\":[\"1f6483c2-9e98-402c-a9c6-0b2ca6484f63\"],\"to\":\"testTo@credabl.com.au\"}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/statements/email");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postStatementEmail_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getUser() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/user");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getUser() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String phone = jsonPath.getString("phone");
			CommonMethods.setStepInfo("Expected 'Phone':+61411226279" + "<br />" + "Actual 'value':" + phone);
			if (!phone.contentEquals("+61411226279")) {
				throw new Exception("phone no. is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getUser_InvalidToken() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/user");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getUser_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getUser_NoToken() throws Exception {
		try {
			Response resp = given().contentType(ContentType.JSON).get(CommonMethods.getCSVData("URL") + "/v1/user");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getUser_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postSendVerificationCode() throws Exception {
		try {
			String jsonBody = "{\"phone\":\"+61411226279\"}";
			Response resp = given().body(jsonBody).auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user/sendverificationcode");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postSendVerificationCode() throws Exception {
		try {
			String status = response.getStatusLine();
			CommonMethods.setStepInfo("Expected 'status line':HTTP/1.1 200 OK" + "<br />" + "Actual 'value':" + status);
			if (!status.contentEquals("HTTP/1.1 200 OK")) {
				throw new Exception("status line is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postSendVerificationCode_InvalidToken() throws Exception {
		try {
			String jsonBody = "{\"phone\":\"+61411226279\"}";
			Response resp = given().body(jsonBody).auth().oauth2(CommonMethods.getInvalidToken())
					.contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user/sendverificationcode");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postSendVerificationCode_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postSendVerificationCode_NoToken() throws Exception {
		try {
			String jsonBody = "{\"phone\":\"+61411226279\"}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON)
					.post(CommonMethods.getCSVData("URL") + "/v1/user/sendverificationcode");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postSendVerificationCode_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postUserMessage() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/user_message";
			String jsonBody = "{\"object\":\"user_message\",\"subject\":\"MessageSubject\",\"message_type\":\"Change Address\",\"contract_ids\":[\"548589d5-5964-40ef-9d42-9e379123c091\"],\"details\":\"UserMessage\",\"payout_date_utc\":1624583526220}";
			Response resp = given().body(jsonBody).auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON)
					.post(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postUserMessage() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String messageType = jsonPath.getString("message_type");
			CommonMethods
					.setStepInfo("Expected 'message_type':Change Address" + "<br />" + "Actual 'value':" + messageType);
			if (!messageType.contentEquals("Change Address")) {
				throw new Exception("message type is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postUserMessage_InvalidToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/user_message";
			String jsonBody = "{\"object\":\"user_message\",\"subject\":\"MessageSubject\",\"message_type\":\"Change Address\",\"contract_ids\":[\"548589d5-5964-40ef-9d42-9e379123c091\"],\"details\":\"UserMessage\",\"payout_date_utc\":1624583526220}";
			Response resp = given().body(jsonBody).auth().oauth2(CommonMethods.getInvalidToken())
					.contentType(ContentType.JSON).post(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postUserMessage_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean postUserMessage_NoToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/user_message";
			String jsonBody = "{\"object\":\"user_message\",\"subject\":\"MessageSubject\",\"message_type\":\"Change Address\",\"contract_ids\":[\"548589d5-5964-40ef-9d42-9e379123c091\"],\"details\":\"UserMessage\",\"payout_date_utc\":1624583526220}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON).post(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postUserMessage_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getUserMessage() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/user_message";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON).get(url);
			setResponse(resp);
			JsonPath jsonPath = response.jsonPath();
			String messageId = jsonPath.getString("data[0].id");
			setUserMessageId(messageId);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getUserMessage() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String messageType = jsonPath.getString("data[0].message_type");
			CommonMethods
					.setStepInfo("Expected 'message_type':Change Address" + "<br />" + "Actual 'value':" + messageType);
			if (!messageType.contentEquals("Change Address")) {
				throw new Exception("message type is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getUserMessage_InvalidToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/user_message";
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).contentType(ContentType.JSON)
					.get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getUserMessage_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getUserMessage_NoToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/user_message";
			Response resp = given().contentType(ContentType.JSON).get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getUserMessage_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean patchUserMessage() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/user_message/{user_message_id}";
			String body = "{\"id\":\"" + getUserMessageId()
					+ "\",\"object\":\"user_message\",\"request_status\":\"Cancelled\"}";
			Response resp = given().body(body).pathParam("user_message_id", getUserMessageId()).auth()
					.oauth2(CommonMethods.getToken()).contentType(ContentType.JSON).patch(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchUserMessage() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String resStr = response.asString();
			String details = jsonPath.getString("details");
			CommonMethods.setStepInfo("Expected 'details':UserMessage" + "<br />" + "Actual 'value':" + details);
			if (!details.contentEquals("UserMessage")) {
				throw new Exception("'details' object not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean patchUserMessage_InvalidToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/user_message/{user_message_id}";
			String body = "{\"id\":\"" + getUserMessageId()
					+ "\",\"object\":\"user_message\",\"request_status\":\"Cancelled\"}";
			Response resp = given().body(body).pathParam("user_message_id", getUserMessageId()).auth()
					.oauth2(CommonMethods.getInvalidToken()).contentType(ContentType.JSON).patch(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchUserMessage_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean patchUserMessage_NoToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/user_message/{user_message_id}";
			String body = "{\"id\":\"" + getUserMessageId()
					+ "\",\"object\":\"user_message\",\"request_status\":\"Cancelled\"}";
			Response resp = given().body(body).pathParam("user_message_id", getUserMessageId())
					.contentType(ContentType.JSON).patch(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchUserMessage_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getAppSettings() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/app_settings/version";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON).get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getAppSettings() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String appVersion = jsonPath.getString("app_version");
			CommonMethods.setStepInfo("Expected 'app_version':1.9" + "<br />" + "Actual 'value':" + appVersion);
			if (!appVersion.contentEquals("1.9")) {
				throw new Exception("'app versin' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getAppSettings_InvalidToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/app_settings/version";
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).contentType(ContentType.JSON)
					.get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getAppSettings_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getAppSettings_NoToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/app_settings/version";
			Response resp = given().contentType(ContentType.JSON).get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getAppSettings_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getDesignatedAccounts() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL")
					+ "/v1/designated_accounts?contract_id=548589d5-5964-40ef-9d42-9e379123c091&offset=0&limit=80";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON).get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getDesignatedAccounts() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String bank = jsonPath.getString("data[0].bank_name");
			CommonMethods.setStepInfo("Expected 'bank name':NAB" + "<br />" + "Actual 'value':" + bank);
			if (!bank.contentEquals("NAB")) {
				throw new Exception("'Bank name' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getDesignatedAccounts_InvalidToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL")
					+ "/v1/designated_accounts?contract_id=548589d5-5964-40ef-9d42-9e379123c091&offset=0&limit=80";
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).contentType(ContentType.JSON)
					.get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getDesignatedAccounts_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getDesignatedAccounts_NoToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL")
					+ "/v1/designated_accounts?contract_id=548589d5-5964-40ef-9d42-9e379123c091&offset=0&limit=80";
			Response resp = given().contentType(ContentType.JSON).get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getDesignatedAccounts_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getContentName() throws Exception {
		try {
			String contentName = CommonMethods.getCSVData("ContentName");
			Response resp = given().auth().oauth2(CommonMethods.getToken()).pathParam("contentName", contentName)
					.contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/dynamiccontent/{contentName}");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getContentName() throws Exception {
		try {
			String status = response.getStatusLine();
			CommonMethods.setStepInfo("Expected 'status line':HTTP/1.1 200 OK" + "<br />" + "Actual 'value':" + status);
			if (!status.contentEquals("HTTP/1.1 200 OK")) {
				throw new Exception("status line is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getContentName_InvalidToken() throws Exception {
		try {
			String contentName = CommonMethods.getCSVData("ContentName");
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).pathParam("contentName", contentName)
					.contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/dynamiccontent/{contentName}");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getContentName_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getContentName_NoToken() throws Exception {
		try {
			String contentName = CommonMethods.getCSVData("ContentName");
			Response resp = given().pathParam("contentName", contentName).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/dynamiccontent/{contentName}");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getContentName_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getNotifications() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/notifications";
			Response resp = given().auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON).get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getNotifications() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			// System.out.println(response.asString());
			String name = jsonPath.getString("data[0].name");
			CommonMethods.setStepInfo("Expected 'name':genericmessage" + "<br />" + "Actual 'value':" + name);
			if (!name.contentEquals("genericmessage")) {
				throw new Exception("'name' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getNotifications_InvalidToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/notifications";
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).contentType(ContentType.JSON)
					.get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getNotifications_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getNotifications_NoToken() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/notifications";
			Response resp = given().contentType(ContentType.JSON).get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getNotifications_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getOccupations() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL") + "/v1/occupations";
			Response resp = given().contentType(ContentType.JSON).get(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getOccupations() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			System.out.println(response.asString());
			String object = jsonPath.getString("object");
			CommonMethods.setStepInfo("Expected 'Object':list" + "<br />" + "Actual 'value':" + object);
			if (!object.contentEquals("list")) {
				throw new Exception("'Object' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean postCheckRegisterExistingUser() throws Exception {
		try {
			String url1 = CommonMethods.getCSVData("URL");
			String url = url1 + "/v1/check_register_existing_user";
			String jsonBody = "{\"date_of_birth\":1577836800000,\"contract_number\":\"CONTRACT2\",\"email\":\"keat2ng@gmail.com\",\"mobile\":\"+61416468648\"}";
			Response resp = given().body(jsonBody).contentType(ContentType.JSON).post(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_postCheckRegisterExistingUser() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			System.out.println(response.asString());
			String object = jsonPath.getString("object");
			CommonMethods.setStepInfo("Expected 'Object':registering_user" + "<br />" + "Actual 'value':" + object);
			if (!object.contentEquals("registering_user")) {
				throw new Exception("'Object' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean patchRequestDirectDebitIntegration() throws Exception {
		try {
			String url1 = CommonMethods.getCSVData("URL");
			String url = url1 + "/v1/request_direct_debit_integration/{request_direct_debit_id}";
			String jsonBody = "{\"object\":\"request_direct_debit_integration\",\"request_status\":\"Completed\",\"crm_case_number\":\"CAS-01028-Y5P0B1\",\"crm_case_id\":\"646a7135-e031-4067-840e-f0377bf0a314\"}";
			String id = CommonMethods.getCSVData("RequestDirectDebitId");
			Response resp = given().pathParam("request_direct_debit_id", id).body(jsonBody).auth().preemptive()
					.basic("CredablCommunity", "NX#2bbfa%mGwpVeyPu*&QX7m").contentType(ContentType.JSON).patch(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchRequestDirectDebitIntegration() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			System.out.println("Response:" + response.asString());
			String bank = jsonPath.getString("bank_name");
			CommonMethods.setStepInfo("Expected 'Bank_name':NAB" + "<br />" + "Actual 'value':" + bank);
			if (!bank.contentEquals("NAB")) {
				throw new Exception("'Bank_name' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean patchRequestDrawdownIntegration() throws Exception {
		try {
			String url1 = CommonMethods.getCSVData("URL");
			String url = url1 + "/v1/request_drawdown_integration/{request_drawdown_id}";
			String jsonBody = "{\"object\":\"request_drawdown_integration\",\"request_status\":\"Completed\",\"crm_case_number\":\"CAS-01028-Y5P0B1\",\"crm_case_id\":\"646a7135-e031-4067-840e-f0377bf0a314\"}";
			String id = CommonMethods.getCSVData("RequestDirectDebitId");
			Response resp = given().pathParam("request_drawdown_id", id).body(jsonBody).auth().preemptive()
					.basic("CredablCommunity", "NX#2bbfa%mGwpVeyPu*&QX7m").contentType(ContentType.JSON).patch(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchRequestDrawdownIntegration() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			System.out.println("Response:" + response.asString());
			String bank = jsonPath.getString("bank_name");
			CommonMethods.setStepInfo("Expected 'Bank_name':NAB" + "<br />" + "Actual 'value':" + bank);
			if (!bank.contentEquals("NAB")) {
				throw new Exception("'Bank_name' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getTransactions() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getToken()).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL")
							+ "/v1/transactions?contract_id=548589d5-5964-40ef-9d42-9e379123c091");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getTransactions() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String object = jsonPath.getString("data[0].object");
			CommonMethods.setStepInfo("Expected 'Object':transaction" + "<br />" + "Actual 'value':" + object);
			if (!object.contentEquals("transaction")) {
				throw new Exception("'Object' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getTransactions_InvalidToken() throws Exception {
		try {
			Response resp = given().auth().oauth2(CommonMethods.getInvalidToken()).contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL")
							+ "/v1/transactions?contract_id=548589d5-5964-40ef-9d42-9e379123c091");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getTransactions_InvalidToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean getTransactions_NoToken() throws Exception {
		try {
			Response resp = given().contentType(ContentType.JSON).get(CommonMethods.getCSVData("URL")
					+ "/v1/transactions?contract_id=548589d5-5964-40ef-9d42-9e379123c091");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getTransactions_NoToken() throws Exception {
		return verify_Invalid_or_NoToken();
	}

	public boolean patchUserMessageIntegration() throws Exception {
		try {
			String url1 = CommonMethods.getCSVData("URL");
			String url = url1 + "/v1/user_message_integration/{user_message_id}";
			String jsonBody = "{\"object\":\"request_user_message_integration\",\"request_status\":\"Completed\",\"crm_case_number\":\"CAS-01028-Y5P0B1\",\"crm_case_id\":\"646a7135-e031-4067-840e-f0377bf0a314\"}";
			String id = CommonMethods.getCSVData("UserMessageId");
			Response resp = given().pathParam("user_message_id", id).body(jsonBody).auth().preemptive()
					.basic("CredablCommunity", "NX#2bbfa%mGwpVeyPu*&QX7m").contentType(ContentType.JSON).patch(url);
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_patchUserMessageIntegration() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String status = jsonPath.getString("request_status");
			CommonMethods.setStepInfo("Expected 'request_status':Completed" + "<br />" + "Actual 'value':" + status);
			if (!status.contentEquals("Completed")) {
				throw new Exception("'Request_status' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean getValues() throws Exception {
		try {
			Response resp = given().contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL") + "/v1/health-probe");
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

	public boolean verify_getValues() throws Exception {
		try {
			String status = response.getStatusLine();
			CommonMethods.setStepInfo("Expected 'status line':HTTP/1.1 200 OK" + "<br />" + "Actual 'value':" + status);
			if (!status.contentEquals("HTTP/1.1 200 OK")) {
				throw new Exception("status line is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}
	
	public boolean findPetById() throws Exception {
		try {
			Response resp = given().contentType(ContentType.JSON)
					.get(CommonMethods.getCSVData("URL"));
			System.out.println("Url:"+CommonMethods.getCSVData("URL"));
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}
	
	public boolean verifyPetById() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String object = jsonPath.getString("status");
			CommonMethods.setStepInfo("Expected 'Object':available" + "<br />" + "Actual 'value':" + object);
			if (!object.contentEquals("available")) {
				throw new Exception("'Object' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}
	
	public boolean updatePetName() throws Exception {
		try {
			String url = CommonMethods.getCSVData("URL");
			String jsonBody = "{\"id\":0,\"category\":{\"id\":0,\"name\":\"string\"},\"name\":\"doggie\",\"photoUrls\":[\"string\"],\"tags\":[{\"id\":0,\"name\":\"string\"}],\"status\":\"available\"}";
			Response resp = given().header("Content-Type", "application/json")
		              .body(jsonBody).put(url);
			String res = resp.asString();
			
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}
	
	public boolean verifyPetName() throws Exception {
		try {
			JsonPath jsonPath = response.jsonPath();
			String object = jsonPath.getString("name");
			CommonMethods.setStepInfo("Expected 'Object':doggie" + "<br />" + "Actual 'value':" + object);
			if (!object.contentEquals("doggie")) {
				throw new Exception("'Object' is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}
	
	public boolean deletePet() throws Exception {
		try {
			Response resp = given().contentType(ContentType.JSON)
					.delete(CommonMethods.getCSVData("URL"));
			System.out.println("Url:"+CommonMethods.getCSVData("URL"));
			setResponse(resp);
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}
	
	public boolean verifyDeletePet() throws Exception {
		try {
			String status = response.getStatusLine();
			CommonMethods.setStepInfo("Expected 'status line':HTTP/1.1 200 OK" + "<br />" + "Actual 'value':" + status);
			if (!status.contentEquals("HTTP/1.1 200 OK")) {
				throw new Exception("status line is not matched");
			}
			return true;
		} catch (Exception e) {
			CommonMethods.setException(e.toString());
			return false;
		}
	}

}
