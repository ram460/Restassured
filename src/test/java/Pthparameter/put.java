package Pthparameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import java.util.Random;

import javax.sound.sampled.Port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class put {
	
@Test
	public void tc02() {
	Random r=new Random();
	int ran = r.nextInt(1000);
	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "sabucc");
	jobj.put("projectName", "sjfgjj"+ran);
	jobj.put("status", "ok");
	jobj.put("teamsize",8);
	baseURI ="http://rmgtestingserver";
	port=8084;
	
   
	given().body(jobj).contentType(ContentType.JSON).
	pathParam("pId", "TY_PROJ_5517")
	.when().put("/projects/{pId}")
	.then().assertThat()
	.statusCode(200)
	.log().all();
}
}
