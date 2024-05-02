package webapitest.methods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.Base64;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.baselib.BaseMethods;
import common.toolbox.selenium.Element;
import common.toolbox.selenium.Waits;

public class RestAssuredOAuth2 {

	public static String clientId = "947b6c03-6bc8-4b20-900a-ecfdb9324192";
	public static String redirectUri = "https://jwt.ms";
	public static String scope = "https://credablb2cuat.onmicrosoft.com/947b6c03-6bc8-4b20-900a-ecfdb9324192/user_impersonation";

	public static String encode(String str1, String str2) {
		return new String(Base64.getEncoder().encode((str1 + ":" + str2).getBytes()));
	}

	public static String getAuthCode() {
		try {
			WebDriver driver = BaseMethods.getChromeDriver(BaseMethods.getChromeDriverService());
			String url = "https://login-uat.credabl.com.au/credablb2cuat.onmicrosoft.com/B2C_1A_SIGNIN_V1/oauth2/v2.0/authorize?client_id=947b6c03-6bc8-4b20-900a-ecfdb9324192&response_type=code&redirect_uri=https://jwt.ms&scope=https://credablb2cuat.onmicrosoft.com/947b6c03-6bc8-4b20-900a-ecfdb9324192/user_impersonation";
			driver.get(url);
			driver.manage().window().maximize();
			Waits.waitInSeconds(2);
			WebElement txtEmailAddress = driver.findElement(By.xpath("//input[@name='Email Address']"));
			txtEmailAddress.sendKeys("sarath.kavati@gmail.com");
			WebElement txtPassword = driver.findElement(By.xpath("//input[@name='Password']"));
			txtPassword.sendKeys("Sk@250022");
			Waits.waitInSeconds(1);
			WebElement btnSignIn = driver.findElement(By.tagName("button"));
			btnSignIn.click();
			Element.isElementPresent(driver,
					By.xpath("//*[text()='Enter token below (it never leaves your browser):']"), 10);
			String currentUrl = driver.getCurrentUrl();
			String authCode = currentUrl.substring(currentUrl.lastIndexOf("=") + 1);
			driver.close();
			return authCode;
		} catch (Exception e) {
			return "";
		}
	}

	public static Response getAccessTokenResponse(String code) {

		return given().contentType(ContentType.URLENC).formParam("code", code).formParam("client_id", clientId)
				.formParam("grant_type", "authorization_code")
				.formParam("client_secret", "byr7Q~2J5o1uBbecpmKg_0s7MQEX.4T6vRmsC")
				.formParam("redirect_uri", redirectUri).post("/oauth2/v2.0/token").then().statusCode(200).extract()
				.response();
	}

	public static String parseForOAuth2Code(Response response) {
		return response.jsonPath().getString("access_token");
	}

	// @Test
	public void iShouldGetCode() {
		// use below url and hit on chrome browser to get auth code
		// https://login-uat.credabl.com.au/credablb2cuat.onmicrosoft.com/B2C_1A_SIGNIN_V1/oauth2/v2.0/authorize?client_id=947b6c03-6bc8-4b20-900a-ecfdb9324192&response_type=code&redirect_uri=https://jwt.ms&scope=https://credablb2cuat.onmicrosoft.com/947b6c03-6bc8-4b20-900a-ecfdb9324192/user_impersonation

		String code = getAuthCode();
		RestAssured.baseURI = "https://login-uat.credabl.com.au/credablb2cuat.onmicrosoft.com/B2C_1A_SIGNIN_V1";
		Response response = getAccessTokenResponse(code);
		String token = parseForOAuth2Code(response);
		// System.out.println("code:"+response.jsonPath());
		System.out.println("Access Token:" + token);

	}

	// @Test
	public void postMethod() {
		String code = getAuthCode();
		RestAssured.baseURI = "https://login-uat.credabl.com.au/credablb2cuat.onmicrosoft.com/B2C_1A_SIGNIN_V1";
		Response response = getAccessTokenResponse(code);
		String token = parseForOAuth2Code(response);
		System.out.println("Access Token:" + token);
		String jsonBody = "{\"object\":\"request_direct_debit\",\"to_contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"from_designated_account_id\":\"af00177b-0ac4-46f8-aafd-ad0b2aab15cf\",\"amount\":5000,\"comment\":\"Requestadirectdebit\",\"request_date_utc\":1624583526220}";
		Response resp = given().header("Authorization", "Bearer " + token).body(jsonBody).when()
				.contentType(ContentType.JSON).post("https://community-api-uat.credabl.com.au/v1/request_direct_debit");

		System.out.println(resp.asString());
	}

	@Test
	    public void getMethod() {
	    	String code=getAuthCode();
	    	RestAssured.baseURI = "https://login-uat.credabl.com.au/credablb2cuat.onmicrosoft.com/B2C_1A_SIGNIN_V1";
	        Response response = getAccessTokenResponse(code);
	        String token = parseForOAuth2Code(response);
	        System.out.println("Access Token:"+token);
	       // String jsonBody="{\"object\":\"request_direct_debit\",\"to_contract_id\":\"548589d5-5964-40ef-9d42-9e379123c091\",\"from_designated_account_id\":\"af00177b-0ac4-46f8-aafd-ad0b2aab15cf\",\"amount\":5000,\"comment\":\"Requestadirectdebit\",\"request_date_utc\":1624583526220}";
	        Response resp = given().auth().
	        		  oauth2(token).              
	                when().
	                contentType(ContentType.JSON).
	                get("https://community-api-uat.credabl.com.au/v1/entities?offset=0&limit=20");

	        System.out.println(resp.asString());
	    }

}