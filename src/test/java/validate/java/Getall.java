package validate.java;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import junit.framework.Assert;

public class Getall 
{
	@Test
	public void Test01()
	{
String expData="Testyantra_RMG4";
baseURI="http://rmgtestingserver";
port=8084;
Response resp=when().get("/projects"); 

String actData=resp.jsonPath().get("[0].projectName");
Assert.assertEquals(actData, expData);
System.out.println("data verified");
resp.then().log().all();
} 
}
 