package serializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforparsing.EmployeeDetailsintarray;

public class SerializationofEmpDatawithArray
{
@Test
public void SerializationofEmpdatawitharrayTest()throws Throwable
{
	//step1:create an object for pojo class
	int[]phoneNo= {9006,898};
	EmployeeDetailsintarray emp=new EmployeeDetailsintarray(phoneNo, 12223, "tyc45", "xyz@gmail.com","plotno45");
	ObjectMapper onjm=new ObjectMapper();
	onjm.writeValue(new File("./EmployeeDetailsintarray.json"), emp);
	
}
} 
