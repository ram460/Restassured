package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import groovy.json.JsonException;
import pojoClassforparsing.EmployeeDetails;
import pojoClassforparsing.EmployeeDetailsintarray;
import pojoClassforparsing.EmployeeDetailswithObject;

public class DeserializationofEmpdetails 
{
@Test
public void deserializationempdetails() throws JsonException, JsonParseException, JsonMappingException, IOException 
{
 ObjectMapper olm=new ObjectMapper();
 EmployeeDetails em1=olm.readValue(new File("./EmployeeDetails.json"),EmployeeDetails.class);
 System.out.print(em1.geteName()+" "+em1.getPhoneNo()+" " +em1.getEmail()+" "+em1.getaddress()+" "+em1.geteId());
}

@Test
public void deserializationarray()throws JsonException,JsonMappingException,JsonParseException,IOException
{
	 ObjectMapper olm1=new ObjectMapper();
	 EmployeeDetailsintarray em2=olm1.readValue(new File(".EmployeeDetailsintarray.json"),EmployeeDetailsintarray.class);
	 System.out.println(em2.getPhoneNo());
}
}

