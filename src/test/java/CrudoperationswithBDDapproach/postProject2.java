package CrudoperationswithBDDapproach;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postProject2
{
@Test
public void tc01()
{
	Random r=new Random();
	int ran = r.nextInt(1000);
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "sa");
	jobj.put("projectName","xyz"+ran);
	jobj.put("status", "ok");
	jobj.put("teamsize",8);
	given().body(jobj).contentType(ContentType.JSON)
	.when().post("http://rmgtestingserver:8084/addProjects")
	.then().statusCode(201).log().all();
}
}
