package Practicereqres.in;

import java.util.List;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.response.Response.*;

public class DM2 
{
	@Test
	void tco2()
	{
	baseURI="https://reqres.in/";
	 
		Response resp = when().get("api/users?page=2");
		boolean flag= true;
		List<Object> actdata = resp.jsonPath().getList("data.email");
		System.out.println("size="+actdata.size());
		for(Object email:actdata)
		{
			System.out.println(email);
		}
		
	//ValidatableResponse vres = resp.then();
//		vres.log().all();
	 }
}
