package Practicereqres.in;

import static  io.restassured.RestAssured.*;

import org.json.simple.JSONObject.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
 
public class DynamicvalidationDemo 
{
 @Test
   void tc01()
   {
	  
	  Response resp= given()
			  .contentType(ContentType.JSON)
	   .when()
	   .get("https://reqres.in/api/users?page=2");
	  JSONObject jobj=new JSONObject(resp.asString());
	  boolean Status = false;
	  for(int i=0;i<jobj.getJSONArray("data").length();i++)
	  {
		String Data= jobj.getJSONArray("data").getJSONObject(i).get("last_name").toString();
		if(Data.equals("Lawson"))
		{
			Status=true;
			break;
		}
		//System.out.println(Data);
		  
	  }
	   Assert.assertEquals(Status,true); 
   }
 
}

