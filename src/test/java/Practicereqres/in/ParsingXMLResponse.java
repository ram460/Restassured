package Practicereqres.in;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;

import static io.restassured.RestAssured.*;

import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response.*;
import static org.hamcrest.Matchers.*;

public class ParsingXMLResponse 
{
  

@Test
 public void testXMLResponse()
  {
	  given()
	  
	  .when()
	  
	  .get("http://restapi.adequateshop.com/api/Traveler?page=1")
	  .then()
	  .statusCode(200)
	  .body("TravelerinformationResponse.page", equalTo("1"))
	  .body("TravelerinformationResponse.travelers.Travelinformation[0].adderes",equalTo("USA"));
	  
  }
@Test

public void test1XMLResponse()
{
	Response resp=given()
	.when()
	.get("http://restapi.adequateshop.com/api/Traveler?page=1");
	Assert.assertEquals(resp.getStatusCode(),200);
	Assert.assertEquals(resp.header("Content-Type"),"application/xml; charset=utf-8");
	String pagno=resp.xmlPath().get("TravelerinformationResponse.page").toString();
	Assert.assertEquals(pagno,"1");
	String travelsename=resp.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[0].name").toString();
	Assert.assertEquals(travelsename,"Developer");
	
	
}
@Test
public void  testxmlResponseBody()
{
Response rs= given()
	
	.when()
	.get("http://restapi.adequateshop.com/api/Traveler?page=1");
	XmlPath xmlobj=new XmlPath(rs.asString());
List<String>travellers=xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation");
Assert.assertEquals(travellers.size(),10);
List<String>traveller_names=xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
boolean Status=false;
for(String traveler_name:traveller_names)
		{
			System.out.println(traveler_name);
			 if(traveler_name.equals("Developer"))
			   {
				Status=true;
				break;
			  }
			Assert.assertEquals(Status, true);
		}
		

    
}
}