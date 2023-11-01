package CrudoperationswithBDDapproach;

import static io.restassured.RestAssured.given;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postproject7 {
	@Test
	public void tc07()
	{
		Random r=new Random();
		int ran = r.nextInt(1000);
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", 457);
		jobj.put("projectName",   +ran);
		jobj.put("status", 12345);
		jobj.put("teamsize",8);
		given().body(jobj).contentType(ContentType.JSON)
		.when().post("http://rmgtestingserver:8084/addprojects")
		.then().statusCode(201).time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS);

	}

}
