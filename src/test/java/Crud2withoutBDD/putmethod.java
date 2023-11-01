package Crud2withoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class putmethod 
{
	@Test
	public void modify()
{
	JSONObject jobj1=new JSONObject();
	jobj1.put("checkin", "2017-01-01");
	jobj1.put("checkout", "2019-01-01");
	JSONObject jobj=new JSONObject();
	jobj.put("firstname", "Ramchander");
	jobj.put("lastname", "kashyap");
	jobj.put("totalprice", "789");
	jobj.put("depositpaid",true);
	jobj.put("bookingdates", jobj1);
	jobj.put("additionalneeds" ,"Breakfast");
	//preconditions
	RequestSpecification  reqspec=RestAssured.given();
	reqspec.body(jobj);
	reqspec.contentType(ContentType.JSON);
	//actions
	Response response=reqspec.put("https://restful-booker.herokuapp.com/booking/14514");
	//Response response=reqspec.get("http://rmgtestingserver:8084/projects");
	response.getContentType();
	//response.prettyPeek();
	response.prettyPrint();
	//validate
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().contentType(ContentType.JSON);
	valResponse.log().all();
}
}
