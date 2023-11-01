package Differentwayspostrequest2;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoclassDemo.Bookinglibrary;
import PojoclassDemo.ProjectDetails;
import io.restassured.http.ContentType;

public class postpojo
{
	@Test
public void tc01()
{
	JSONObject jobj2=new JSONObject();
	jobj2.put("checkin","2018-01-06");
	jobj2.put("checkout","2019-01-01");
	Bookinglibrary pj=new Bookinglibrary("ram356", "kashyap",500, true,jobj2,"Dinner");
	given().body(pj).contentType(ContentType.JSON)
	.when().post("https://restful-booker.herokuapp.com/booking")
	.then().statusCode(200).log().all();
}
}
