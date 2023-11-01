package CrudoperationswithBDDapproach;

import static io.restassured.RestAssured.when;
import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getAllprojects 
{
	@Test
public void test01()
{
	when().get("http://rmgtestingserver:8084/projects")
	.then()
	.statusCode(200).assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS) 
	.log()
	.all().assertThat().contentType(ContentType.JSON);
}
}
