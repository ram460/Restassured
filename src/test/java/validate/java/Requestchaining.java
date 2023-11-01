package validate.java;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Queryparameter.java.getgiven;
import Restassured.Genericutility.javautility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Requestchaining
{
@Test
public void requestChaining()
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
	given().pathParam("pid", projid)
	.when().get("/projects/{pid}")
	.then().assertThat().statusCode(200).log().all();
}

	
	
}

