package Scenario;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.testng.annotations.Test;

import Restassured.Genericutility.EndpointsLibrary;
import Restassured.Genericutility.javautility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassforparsing.CreateprojectData;

public class JavaTest {

	@Test
	public void tc1() {
		javautility jutil=new javautility();
		HashMap map=new HashMap();
		map.put("createdBy","ram");
		map.put("projectName", "poikl4201210");
		map.put("status", "ok");
		map.put("teamSize", 6);
		//step2 send the request
		baseURI="http://rmgtestingserver";
		port=8084;
		basePath="/addProject";
		Response resp=given()
				.body(map)
				.contentType(ContentType.JSON)
				.when().post();
		System.out.println("posted");
	}
}
