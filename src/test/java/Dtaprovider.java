import org.hamcrest.Matchers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoclassDemo.ProjectDetails;
import Restassured.Genericutility.javautility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;
public class Dtaprovider
{
	@DataProvider
	public  Object[][] getData(){
		Object[][] ob=new Object[2][4];
		javautility jutil=new javautility();
		ob[0][0]="Rajesh";
		ob[0][1]="project"+jutil.getRandomnumber();
		ob[0][2]="ongoing";
		ob[0][3]=10;
		
		ob[1][0]="ramhj";
		ob[1][1]="project"+jutil.getRandomnumber();
		ob[1][2]="ongoing";
		ob[1][3]=10;
		return ob;
		
	}
	@Test(dataProvider ="getData")
public void tc01(String createdBy,String projectName,String status,int teamSize  )
{
	
	javautility util=new javautility();
	ProjectDetails dt=new ProjectDetails(createdBy, projectName+util.getRandomnumber(), status, teamSize);
	given().body(dt)
	.contentType(ContentType.JSON)
	.when()
	.post("http://rmgtestingserver:8084/addProject")
	.prettyPeek()
	.then()
	.assertThat().statusCode(201)
	.assertThat().time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
    .log().all();	
	
		
	
	
	
}
}
