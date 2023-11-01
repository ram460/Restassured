package Pthparameter;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

public class Addprojectpath
{
@Test
public void tco1()
{
	
	baseURI="http://rmgtestingserver";
	port=8084;
	given().pathParam("pid", "TY_PROJ_595")
	.when().get("/projects/{pid}")
	.then()
	.statusCode(200)
	.log().all();
}
}  
