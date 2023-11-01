package Practicereqres.in;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.response.Response.*;

public class DM 
{
 @Test
 
	 void tc01()
		{
			Response resp=given()
			.contentType(ContentType.JSON)
			.when()
			.get("https://reqres.in/api/users?page=2");
			boolean flag=false;
		
			//List<Map<String,Object>>li=resp.jsonPath().getList("data");
			List<Map<String,Object>>i = resp.jsonPath().getList("data");
			for(Map<String,Object>element:i)
			{
				if(element.get("email").equals("byron.fields@reqres.in"));
				flag=true;
				break;
			}
			Assert.assertEquals(flag,true); 
		}
}
 


