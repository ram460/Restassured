package crudoOperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Getproject 
{
@Test
public void getProjectTest()
{

	Response response=RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_718");
	
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().statusCode(200);
	valResponse.log().all();
}
}
