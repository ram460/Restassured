package Practicereqres.in;

import static io.restassured.response.Response.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;

import static io.restassured.response.Response.*;


public class DM3 
{
 @Test
	void tc01()
	{
	 
	//String expdata = "tobias.funke@reqres.in";
	Response resp = when().get("https://reqres.in/api/users?page=2");
	boolean flag= false;
	List<String> actdata = resp.jsonPath().getList("data.email");
   
	for(String email:actdata)
	{
		//System.out.println(email);
		for(int i=0;i<=actdata.size();i++)
		{
			
			if(email.equals("tobias.funke@reqres.in")){
				System.out.println(email+" data is present");
			flag=true;
			break;
			}				
		}			
	}

}
} 

