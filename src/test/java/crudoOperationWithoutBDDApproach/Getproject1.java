package crudoOperationWithoutBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Getproject1 
{
	@Test
	public void getProjectTest()
	{

		Response response=RestAssured.get("http://rmgtestingserver:8084/TY_PROJ_718");
		
		ValidatableResponse valResponse=response.then();
		valResponse.assertThat().statusCode(200);
		valResponse.log().all();
	
	}
}
