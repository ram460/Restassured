package Queryparameter.java;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class getgiven 
{
@Test
public void tc01()
{
	baseURI="https://reqres.in";
	given().queryParam("page","3")
	.when().get("/api/users?page")
	.then()
	.statusCode(200)
	.assertThat()
	.log().all();
}
}
