package restcountries.getcountries;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ExtractionofTimezone
{
     @Test
     public void f() 
     {
    	 RestAssured.baseURI="http://restcountries.eu/";
    	 RequestSpecification request = RestAssured.given();
    	 request.pathParam("et", "es").accept("application/json");
    	 Response name = request.get("/rest/v2/lang/{et}");
    	 JsonPath j= new JsonPath(name.asString());
    	 System.out.println(j.getList("name"));		 
    	 
    	 
    	 
    	 System.out.println("Hello");	
    	 System.out.println("Hello");
    	 System.out.println("Hello");
    	 System.out.println("Hello");
    	 
    	 System.out.println("Hello");
    	 System.out.println("Hello");
    	 System.out.println("Hello");
     }
}
