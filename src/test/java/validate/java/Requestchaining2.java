package validate.java;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Restassured.Genericutility.javautility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
@Test
public class Requestchaining2
{
	public void tc04()
	{
	javautility jutil=new javautility();
	baseURI="http://rmgtestingserver";
	port=8084;
			JSONObject jobj=new JSONObject();
			jobj.put("createdBy", "xyz");
			jobj.put("projectName","blend"+jutil.getRandomnumber());
			jobj.put("status","ok");
			jobj.put("teamsize",10);
		Response res=	given()
			.body(jobj).contentType(ContentType.JSON)
			.when().post("/addProject");
		String projid=res.jsonPath().get("projectId");	
			res.then().assertThat().statusCode(201)
			.time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
			.log().all();
	//given().pathParam("pid", projid)
	when().get("/projects/"+projid)
	.then().assertThat().statusCode(200).log().all();
	}
	
	
	@Test
	public void tc05()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		given().auth().preemptive().basic("rmgyantra", "rmgy@9999")
		.when().get("/login")
		.then().assertThat().statusCode(202).log().all();
	}
@Test
 public void tc06()
{
	baseURI="http://rmgtestingserver";
	port=8084;
	given().auth().digest("rmgyantra", "rmgy@9999")
	.when().get("/login")
	.then().assertThat().statusCode(202).log().all();
}
}

