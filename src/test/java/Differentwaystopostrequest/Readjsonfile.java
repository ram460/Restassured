package Differentwaystopostrequest;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Readjsonfile
{
@Test
public void tc01() throws FileNotFoundException
{

	
	//FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\pro1.json");
	given().body(new File(".\\src\\test\\resources\\pro1.json")).contentType(ContentType.JSON)
	.when().post("http://rmgtestingserver:8084/addProject")
	.then().statusCode(201).log().all();
	
}
}
