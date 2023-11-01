package Practicereqres.in;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.Map;

public class cookies
{
  @Test
  void tc01()
  {

	  given()
	  
	  .when()
	  .get("https://www.google.com/")
	  .then()
	  .cookie("AEC","ARSKqsLocHPgvegtbKVIHfiNbeUzRZYt3CW8LgxgRa58npxn8DoHFcMK8w")
	  .log().all();
	  
	  
  }
  @Test
  void tc02()
  {
	Response resp=given()
	.when()
	.get("https://www.google.com/");
	/*String cookie_value=resp.getCookie("AEC");
	System.out.println("cookie value=====>"+cookie_value);*/
	Map<String, String>cookie_value=resp.getCookies();
	for(String k:cookie_value.keySet())
	{
		String cookie_values=resp.getCookie(k);
		System.out.println(k+"       "+cookie_values);
	}
	
	
  }
}
