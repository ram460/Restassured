package CrudoperationswithBDDapproach;

import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class DeleteProjects 
{
	@Test
	
public void   test01()
{
	when().delete("http://rmgtestingserver:8084/projects/TY_PROJ_780")
	.then()
	.statusCode(204).assertThat().time(org.hamcrest.Matchers.lessThan(100L),TimeUnit.MILLISECONDS)
	.log().all();
	
}
}
