package Crud2withoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Getmethod 
{
	@Test
 public void tc01()

{
Response response=RestAssured.get("https://restful-booker.herokuapp.com/booking");
	
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().statusCode(200);
	valResponse.log().all();
}
}
