package Restassured.Genericutility;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class Baseclass
{
public DatabaseLibrary dlib=new DatabaseLibrary();
public javautility jutil=new javautility();
public Restassuredlibrary ril=new Restassuredlibrary();

@BeforeSuite
public void bsconfig()throws SQLException
{
	dlib.connectToDB();
	 baseURI="http://rmgtestingserver";
	port=8084;
	
}
@AfterSuite
public void asconfig() throws SQLException
{
	dlib.closeDB();
}
}
