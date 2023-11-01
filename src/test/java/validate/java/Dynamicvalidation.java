 package validate.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Dynamicvalidation 
{
	@Test
	public void getProject()
	{
		Response res=when().get("http://rmgtestingserver:8084/projects");
		String str=res.prettyPrint();
		int size=0;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)=='{')
			{
				size++;
			}
		}
			System.out.println("total projects: "+size);
			int i=0;
			while(true)
			{
				String pid=res.jsonPath().get("["+i+"].projectId");
				System.out.println(pid);
			
			try
			{
				
				Assert.assertEquals(pid,"TY_PROJ_841" );
				System.out.println("position of project:"+i);
				break;
			}
			catch (AssertionError e) {
				if(i<=size)
				{
					i++;
				}
				else {
					Assert.fail();
				}
			}
	
	}

	

	
	}
}




