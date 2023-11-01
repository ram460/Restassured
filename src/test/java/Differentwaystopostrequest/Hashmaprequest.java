package Differentwaystopostrequest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import  io.restassured.http.ContentType;

public class Hashmaprequest
{
@Test
public void Test01()
{
	Random r=new Random();
	int ran = r.nextInt(1000);
 HashMap h=new HashMap();
 h.put("createdBy", "s");
 h.put("projectName", "ferte"+ran);
 h.put("status", "ok");
 h.put("teamSize", 9);
 given().body(h).contentType(ContentType.JSON)
	.when().post("http://rmgtestingserver:8084/addProject")
	.then().statusCode(201).log().all();
 
 
} 
}
