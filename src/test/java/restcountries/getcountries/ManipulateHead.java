package restcountries.getcountries;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ManipulateHead 
{
     @Test
      public void manipulateHeaders() 
       {
    	   RestAssured.baseURI = "http://restcountries.eu/";
 		   RequestSpecification request = RestAssured.given();
 		   request.queryParam("fulltext", "true").accept("application/xml");
 		   Response name = request.get("/rest/v2/name/afghanistan");
 		   System.out.println(name.getStatusLine());
 		   System.out.println(name.getHeaders());
       }
}
