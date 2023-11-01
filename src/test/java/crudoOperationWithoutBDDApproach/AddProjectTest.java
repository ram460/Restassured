package crudoOperationWithoutBDDApproach;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest 
{
@Test
public void addProjectTest()
{
	Random r=new Random();
	int ran = r.nextInt(1000);
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "dcd");
	jobj.put("projectName", "gd"+ran);
	jobj.put("status", "created");
	jobj.put("teamSize", 512);
	//preconditions
	RequestSpecification  reqspec=RestAssured.given();
	reqspec.body(jobj);
	reqspec.contentType(ContentType.JSON);
	//actions
	Response response=reqspec.post("http://rmgtestingserver:8084/addProject");
	//Response response=reqspec.get("http://rmgtestingserver:8084/projects");
	response.getContentType();
	response.prettyPeek();
	response.prettyPrint();
	//validate
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().contentType(ContentType.JSON);
	valResponse.log().all();

}
}
