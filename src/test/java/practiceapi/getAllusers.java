package practiceapi;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getAllusers 
{
	@Test
public void tc01()
{
	baseURI="https://reqres.in/";
	String expData="12";
	//capture the response
	//RequestSpecification respec=given().queryParam("page", "2");
	Response resp=when().get("/api/users?page=2");
	List<Object>actData=resp.jsonPath().get("data");
	for(Object obj:actData)
	{
		String dataString=obj.toString();
		if(dataString.contains(expData))
		{
			System.out.println(dataString+" "+"data got matched");
			break;
		}
		else
		{
			System.out.println("data notmatched");
		}
	}
}
}
