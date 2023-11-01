package authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Bearertoken
{
	@Test
public void bearertoken()
{
 baseURI="https://api.github.com";
 JSONObject jobj=new JSONObject();
 jobj.put("name","ram456");
 given().auth().oauth2("82ad4878212817dba123749b9ff0286f52a3a99a")
 .body(jobj).when().post("/user/repos").then().assertThat().statusCode(201)
 .contentType(ContentType.JSON)
 .log().all();
}
	
	
	//0auth2.0
	 public class Oauth2_0 {

		@Test
		public void oauthAuthentication()
		{
			//Create a request to generate accesss token 
			Response resp = given()
			 .formParam("client_id", "ramchander")
			 .formParam("client_secret", "14c5d8b78b30c5e405c4975455ac885c")
			 .formParam("grant_type", "client_credentials")
			 .formParam("redirect_uri", "http://example.com")
			 .formParam("code", "authorization_code")
			 
		    .when()
		     .post("http://coop.apps.symfonycasts.com/token");
		     
		    //Capture the access token from the response of the above request
			String token = resp.jsonPath().get("access_token");
			System.out.println(token);
			 
			
			//Create another request and use the token to access the APIs
			given()
			 .auth().oauth2(token)
			 .pathParam("USER_ID", 4020)
			 
			.when()
			 .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
			 
			.then().log().all();
			 
			 
}
	 }
}
