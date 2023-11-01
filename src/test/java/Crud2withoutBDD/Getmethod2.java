package Crud2withoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Getmethod2 
{
	@Test
public void tc02()
{
		{
			Response response=RestAssured.get("https://restful-booker.herokuapp.com/booking/6797");
				
				ValidatableResponse valResponse=response.then();
				valResponse.assertThat().statusCode(200);
				valResponse.log().all();
			}
}
}
