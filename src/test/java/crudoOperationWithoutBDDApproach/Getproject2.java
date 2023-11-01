package crudoOperationWithoutBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Getproject2 
{
@Test
public void getProjectTest02()
{

	Response response=RestAssured.get("http://rmgtestingserver:8084/projects");
	System.out.println(response.prettyPrint());	
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().statusCode(200);
	System.out.println(valResponse.toString());
	valResponse.log().all();

}
}
