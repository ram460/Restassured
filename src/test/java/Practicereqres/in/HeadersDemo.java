 package Practicereqres.in;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.response.Response.*;

import static io.restassured.RestAssured.*;

public class HeadersDemo 
{
	@Test
  void tc01()
  {
	given()
	
	.when()
	.get("https://reqres.in/api/users?page=2")
	.then()
	//.header("Content-Type", "text/html; charset=ISO-8859-1")
	//.and()
    //.header("Content-Encoding	","gzip");
	.log().body()
	.log().cookies()
	.log().headers();
	
	
	   
	   
  }
	@Test
	void tc02()
	{
		Response res=given()
				.when()
				.get("https://www.google.com/");
				Headers myhead=res.headers();
				for(Header hd:myhead)
				{
					System.out.println(hd.getName()+"========"+hd.getValue());
				}
				
				
	}
}
