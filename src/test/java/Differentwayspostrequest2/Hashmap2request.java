package Differentwayspostrequest2;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Hashmap2request
{
	@Test
	public void tc03()
	{
		Random r=new Random();
		int ran = r.nextInt(1000);
		JSONObject jobj2=new JSONObject();
		jobj2.put("checkin","2018-01-09");
		jobj2.put("checkout","2019-01-10");	
	
	HashMap h=new HashMap();
	 h.put("firstname", "Ramchander"+ran);
	 h.put("lastname", "kashyap");
	 h.put("totalprice",600 );
	 h.put("depositpaid", true);
	 h.put("bookingdates",jobj2);
	 h.put("additionalneeds", "Breakfast");
	 given().body(h).contentType(ContentType.JSON)
		.when().post("https://restful-booker.herokuapp.com/booking ")
		.then().statusCode(200).log().all();
}
}
