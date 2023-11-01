package Differentwaystopostrequest;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.junit.Test;

import PojoclassDemo.ProjectDetails;
import io.restassured.http.ContentType;

public class postusingpojoclass 
{
@Test
public void tc01()
{
	ProjectDetails pj=new ProjectDetails("ram356", "fre020120", "ok", 20);
	given().body(pj).contentType(ContentType.JSON)
	.when().post("http://rmgtestingserver:8084/addProject")
	.then().statusCode(201).log().all();
	
}
}
