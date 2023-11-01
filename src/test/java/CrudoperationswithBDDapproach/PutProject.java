package CrudoperationswithBDDapproach;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutProject 
{
@Test
public void put()
{
	Random r=new Random();
	int ran = r.nextInt(1000);
	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "sabucc");
	jobj.put("projectName", "sj"+ran);
	jobj.put("status", "ok");
	jobj.put("teamsize",8);
	given().body(jobj)
	.contentType(ContentType.JSON)
	.when()
	.put("http://rmgtestingserver:8084/projects/TY_PROJ_4209")
	.then().statusCode(200)
	.log().all();
	
}
}
