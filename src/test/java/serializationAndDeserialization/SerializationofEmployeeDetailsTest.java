package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforparsing.EmployeeDetailswithObject;

public class SerializationofEmployeeDetailsTest 
{
@Test

/*
public void employeeDetails()throws Throwable
{
	//step1:create object for POJO class
	EmployeeDetails emp=new EmployeeDetails("fn", "tyc24", 1234, "9010672256", "plotno80");
	//step2:Create the object for object mapper
	ObjectMapper objm=new ObjectMapper();  
	//step3:write the values to json file
	objm.writeValue(new File("./EmployeeDetails.json"), emp);
}

*/

public void SerializationEmpdatawithObjectTest() throws JsonGenerationException, JsonMappingException, IOException{
	int[]phNo= {12345,45678};
	String[]email= {"xyzr@gmail.com","ram@gmail.com"};
	EmployeeDetailswithObject ojcm=new EmployeeDetailswithObject("fgh", "tyc456", phNo, email,"fdrd" );
	ObjectMapper okjm=new ObjectMapper();
	okjm.writeValue(new File("./EmployeeDetailswithObject.json"), ojcm);
}
}
