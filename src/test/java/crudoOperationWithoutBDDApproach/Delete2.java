package crudoOperationWithoutBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Delete2 
{
	@Test
	public void deleteProject()
	{
Response response=RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_718");
	
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().statusCode(204);
	valResponse.log().all();
}
}
