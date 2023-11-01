package CrudoperationswithBDDapproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;



public class PostProject
{
@Test
public void post()
{

	Random r=new Random();
	int ran = r.nextInt(1000);
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "sa");
	jobj.put("projectName","xyz"+ran);
	jobj.put("status", "ok");
	jobj.put("teamsize",8);
	given().body(jobj).contentType(ContentType.JSON)
	.when().post("http://rmgtestingserver:8084/addProject")
	.then().statusCode(201).log().all();
	
}
}
