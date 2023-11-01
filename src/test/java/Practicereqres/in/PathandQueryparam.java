package Practicereqres.in;

import  org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class PathandQueryparam 
{
 @Test
 void Tc01()
 {
	 
	 given()
	 .pathParam("mypath","users")
	 .queryParam("page",2)
	 .queryParam("id",7)
	 .when()
	 .get("https://reqres.in/api/{mypath}")
	 .then()
	 .statusCode(200)
	 .log().all();
 }
 
}
