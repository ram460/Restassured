package Restassured.Genericutility;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Restassuredlibrary {
	
 /* *This method will return json data from corresponding response body
 * author ramchander
 */
		public String getjsonData(Response response,String path)
		{
			String jsonData=response.jsonPath().get(path);
			return jsonData;
		}
}

	

