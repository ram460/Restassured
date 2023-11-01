package Crud2withoutBDD;

import java.util.Random;

import org.codehaus.jackson.node.ObjectNode;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class postRequest1
{
	@Test
	public void Addproject()
	{
	Random r=new Random();
	int ran = r.nextInt(1000);
		JSONObject jobj1=new JSONObject();
		jobj1.put("checkin", "2018-01-01");
		jobj1.put("checkout", "2019-01-01");
	JSONObject jobj=new JSONObject();
	jobj.put("firstname", "Ramchander"+ran);
	jobj.put("lastname", "kashyap");
	jobj.put("totalprice", 111);
	jobj.put("depositpaid", true);
	jobj.put("bookingdates",jobj1);
	jobj.put("additionalneeds" ,"Breakfast");
	//ObjectNode bookingdates=ObjectMapper.createObjectNode();
	RequestSpecification  reqspec=RestAssured.given();
	reqspec.body(jobj);
	reqspec.contentType(ContentType.JSON);
	//actions
	Response response=reqspec.post("https://restful-booker.herokuapp.com/booking ");
	System.out.println(response.getContentType());
	System.out.println(response.getTime());
	System.out.println(response.getSessionId());
	System.out.println(response.getBody().prettyPrint());
	System.out.println(response.getBody().prettyPrint());
	System.out.println(response.getStatusLine());
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().contentType(ContentType.JSON);
	valResponse.assertThat().statusLine("HTTPS/1.1 200 ");
	valResponse.log().all();
	}
	}

