package Scenario;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Restassured.Genericutility.Baseclass;
import Restassured.Genericutility.EndpointsLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassforparsing.CreateprojectData;

public class CreateAndDelete extends Baseclass
{
	@Test
	public void createDelete()
	{
	CreateprojectData cdb=new CreateprojectData("ramchander", "tyqwer"+jutil.getRandomnumber(), "ok", 5);
	Response resp=given()
			.body(cdb)
			.contentType(ContentType.JSON)
			.when().post(EndpointsLibrary.createProject);

//step3:capture  the projectid
String expdata=ril.getjsonData(resp, "projectId");
System.out.println(expdata);
when().delete(EndpointsLibrary.deleteProjects+expdata);

}
}