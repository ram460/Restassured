package practiceapi;

import PojoclassDemo.Userlibrary;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;



import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Responsevalidation 
{
	@Test
public void responsevalidation()
{
	String expdata="360";

	//create a prerequisite
	Userlibrary ulib= new Userlibrary("morpheus", "leader","360");
	baseURI="https://reqres.in/";
	
	//send the request and capture the response
Response resp=given()
.body(ulib)
.contentType(ContentType.JSON)
.when()
.post("/api/users");
//writejsonpath using jsonpath() validate
String actdata=resp.jsonPath().get("id");
System.out.println(actdata);
resp.then().log().all();
Assert.assertEquals(expdata,actdata);


 

}
}
