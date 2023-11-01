package CrudoperationswithBDDapproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getProject 
{
	@Test
	
public void test01()
{
	when().get("http://rmgtestingserver:8084/projects/TY_PROJ_4209")
	.then()
	.statusCode(200)
	.log().all();
	
}
	
}
