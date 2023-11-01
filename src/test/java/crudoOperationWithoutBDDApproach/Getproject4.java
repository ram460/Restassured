package crudoOperationWithoutBDDApproach;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertEquals;

import java.util.List;

import javax.annotation.meta.When;

import org.apache.http.impl.client.TargetAuthenticationStrategy;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Getproject4 
{
	@Test
public void tc01()
{
		String capital="Oslo";
		
		when().get("http://restcountries.eu/rest/v1/name/norway")
		
		.then().assertThat().equals(capital);
		
		System.out.println();
		
	
}

	
	
}
