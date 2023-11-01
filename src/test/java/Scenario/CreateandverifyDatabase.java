package Scenario;

import org.testng.Assert;
import org.testng.annotations.Test;

import Queryparameter.java.getgiven;
import Restassured.Genericutility.Baseclass;
import Restassured.Genericutility.DatabaseLibrary;
import Restassured.Genericutility.EndpointsLibrary;
import Restassured.Genericutility.Restassuredlibrary;
import Restassured.Genericutility.javautility;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassforparsing.CreateprojectData;



public class CreateandverifyDatabase  
{
	@Test
	public void createproject() throws SQLException
	{
		//step1 create pre requisites
		javautility jutil=new javautility();
		CreateprojectData cdb=new CreateprojectData("ramchande", "tyqwer"+jutil.getRandomnumber(), "ok", 5);
		//step2 send the request
		baseURI="http://rmgtestingserver";
		port=8084;
		basePath=EndpointsLibrary.createProject;
		Response resp=given()
				.body(cdb)
				.contentType(ContentType.JSON)
				.when().post();
		System.out.println("posted");
	
	//step3:capture  the projectid
	Restassuredlibrary ril=new Restassuredlibrary();
	DatabaseLibrary dlib=new DatabaseLibrary();
	String expdata=ril.getjsonData(resp, "projectId");
	System.out.println(expdata);
	//step4:validate the id in database
	String query ="select * from project";
	String actData=dlib.readDataAndvalidate(query, 1, expdata);
	Assert.assertEquals(expdata, actData);
	System.out.println("TC PASS");
	resp.then().log().all();

	
	}
}


