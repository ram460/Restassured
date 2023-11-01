import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoclassDemo.ProjectDetails;
import Restassured.Genericutility.ExcelFileutility;
import Restassured.Genericutility.javautility;
import io.restassured.http.ContentType;

public class Dataproviderexcel 
{
 
 @DataProvider

		public  Object[][] getData() throws EncryptedDocumentException, IOException
		{
			//Object[][] ob=new Object[2][4];
			//javautility jutil=new javautility();
			ExcelFileutility eutil=new ExcelFileutility();
			Object[][]ob= eutil.readmultipleDataFromexcelsheet("PRO1");
			
			return ob;

}
 @Test(dataProvider ="getData")
 public void tc01(String createdBy,String projectName,String status,String teamSize  )throws IOException
 {
	 javautility util=new javautility();
	 JSONObject jobj=new JSONObject();
	 jobj.put("createdBy", createdBy);
		jobj.put("projectName",projectName+util.getRandomnumber());
		jobj.put("status", status);
		jobj.put("teamsize",teamSize);
		given().body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.prettyPeek()
		.then()
		.assertThat().statusCode(201)
		.assertThat().time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
	    .log().all();	
		
 }
 @Test
 public void read() throws EncryptedDocumentException, IOException {
	 ExcelFileutility e=new ExcelFileutility();
	 Object a = e.readDataFromExcel("PRO1", 1, 1);
	 System.out.println(a);
 }
}


