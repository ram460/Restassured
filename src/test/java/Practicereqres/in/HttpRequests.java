package Practicereqres.in;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.response.Response.*;
import static org.hamcrest.Matchers.*;



public class HttpRequests 
{
	int id;
 @Test(priority = 1)
 public void getusers()
 {
	
	
	 
	 given()
	 
	 .when()
	 .get("https://reqres.in/api/users?page=2")
	 .then()
	 
	 .statusCode(200)
	 .body("page",equalTo(2))
	 .log().all();
	 
	 
 }
 @Test(priority=2)
  void createuser()
  {
	 
	  JSONObject jobj=new JSONObject();
	  jobj.put("name","john");
	  jobj.put("job", "trainer");
	  
	 id= given()
	  .body(jobj)
	  .contentType(ContentType.JSON)
	   .when()
	   .post("https://reqres.in/api/users")
	   .jsonPath().getInt("id");
	  /*.then()
	  .statusCode(201)
	  .log().all();*/
  } 

@Test(priority=3,dependsOnMethods= {"createuser"})
void updateuser()
{
	JSONObject jobj=new JSONObject();
	  jobj.put("name","john");
	  jobj.put("job", "dancer");
	  
	 given()
	  .body(jobj)
	  .contentType(ContentType.JSON)
	   .when()
	   .put("https://reqres.in/api/users/+id")
	   .then()
	  .statusCode(200)
	  .log().all();
}

@Test(priority=4,dependsOnMethods= {"updateuser"})
void Deleteuser()
{
	given()
	.when()
	.delete("https://reqres.in/api/users/+id")
	.then()
	.statusCode(204)
	.log().all();
}

}


