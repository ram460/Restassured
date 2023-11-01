package crudoOperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutProject
{
	@Test
	public void putprojecttest()
	{
		
	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "dcdere");
	jobj.put("projectName", "gd");
	jobj.put("status", "created");
	jobj.put("teamSize", 512);
	//preconditions
	RequestSpecification  reqspec=RestAssured.given();
	reqspec.body(jobj);
	reqspec.contentType(ContentType.JSON);
	//actions
	Response response=reqspec.put("http://rmgtestingserver:8084/projects/TY_PROJ_718");
	//Response response=reqspec.get("http://rmgtestingserver:8084/projects");
	response.getContentType();
	//response.prettyPeek();
	response.prettyPrint();
	//validate
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().contentType(ContentType.JSON);
	valResponse.log().all();
}
}
