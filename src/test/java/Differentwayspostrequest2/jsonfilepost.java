package Differentwayspostrequest2;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class jsonfilepost
{
	@Test
public void tc04() throws FileNotFoundException
{
	Random r=new Random();
	int ran = r.nextInt(1000);
	JSONObject jobj2=new JSONObject();
	jobj2.put("checkin","2018-01-11");
	jobj2.put("checkout","2019-01-18");	
	given().body(new File(".\\src\\test\\resources\\BookingDetails.json")).contentType(ContentType.JSON)
	.when().post("https://restful-booker.herokuapp.com/booking")
	.then().statusCode(200).log().all();

}
}
