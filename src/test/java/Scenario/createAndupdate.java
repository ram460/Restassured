package Scenario;

import static io.restassured.RestAssured.given;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Restassured.Genericutility.Baseclass;
import Restassured.Genericutility.EndpointsLibrary;
import Restassured.Genericutility.javautility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassforparsing.CreateprojectData;

public class createAndupdate extends Baseclass
{
@Test

	public void createupdate() throws SQLException {
		CreateprojectData cdb=new CreateprojectData("ramchande", "tyqwer"+jutil.getRandomnumber(), "ok", 5);
		//step2 send the request
		
		Response resp=given()
				.body(cdb)
				.contentType(ContentType.JSON)
				.when().put(EndpointsLibrary.updateProject);
		//step3:capture  the projectid
		String updateddata=ril.getjsonData(resp, "projectId");
		System.out.println(updateddata);
		//step4:validate the id in database
		String query ="select * from project";
		String actData=dlib.readDataAndvalidate(query, 1, updateddata);
		Assert.assertNotEquals(updateddata, actData);
		System.out.println("TC PASS");
		resp.then().log().all();
	}
}
