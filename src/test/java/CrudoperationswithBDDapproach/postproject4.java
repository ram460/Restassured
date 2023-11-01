package CrudoperationswithBDDapproach;

import static io.restassured.RestAssured.given;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postproject4 
{
@Test
public void tc04()
{
	Random r=new Random();
	int ran = r.nextInt(1000);
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "sa");
	jobj.put("projectName","xyz"+ran);
	jobj.put("status", "ok");
	jobj.put("teamsize",8);
	given().body(jobj).contentType(ContentType.HTML)
	.when().post("http://rmgtestingserver:8084/projects")
	.then().statusCode(200).assertThat().time(org.hamcrest.Matchers.lessThan(20L),TimeUnit.MILLISECONDS);

}	
}

