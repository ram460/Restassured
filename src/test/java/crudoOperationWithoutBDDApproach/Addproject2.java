package crudoOperationWithoutBDDApproach;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Addproject2
{
@Test
public void addproject2()
{
	Random r=new Random();
	int ran = r.nextInt(1000);
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", " ");
	jobj.put("projectName", "gd"+ran);
	jobj.put("status", "created");
	jobj.put("teamSize", 10);
	//preconditions
	RequestSpecification  reqspec=RestAssured.given();
	reqspec.body(jobj);
	reqspec.contentType(ContentType.JSON);
	//actions
	Response response=reqspec.post("http://rmgtestingserver:8084/addProject");
	System.out.println(response.getContentType());
	System.out.println(response.getTime());
	System.out.println(response.getSessionId());
	System.out.println(response.getBody().prettyPrint());
	System.out.println(response.getBody().prettyPrint());
	System.out.println(response.getStatusLine());
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().contentType(ContentType.JSON);
}
}
