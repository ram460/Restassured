package Queryparameter.java;

import static  io.restassured.RestAssured.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Formparameter
{
	@Test
public void Tc01()
{
	baseURI="http://rmgtestingserver";
	port=8084;
	given().formParam("createdBy","sabucc")
	.formParam("projectName","tynhj")
	.formParam("status", "completed")
	.formParam("teamSize",12)
	.contentType(ContentType.JSON)
	.when().put("/projects/TY_PROJ_837")
	.then().statusCode(200)
	.log().all();
	
}
}
