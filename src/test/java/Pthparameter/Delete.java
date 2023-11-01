package Pthparameter;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Delete 
{
	@Test
public void tc01()
{
	baseURI="http://rmgtestingserver";
	port=8084;
	given().pathParam("pid", "TY_PROJ_595")
	.when().delete("/projects/{pid}")
	.then()
	.statusCode(204).assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
	.log().all();
}
}
