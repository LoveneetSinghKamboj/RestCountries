package restcountries.getcountries;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HttpResponsecode 
{
    	 @Test
         public void responsecode1() 
          {
       	   RestAssured.baseURI = "http://restcountries.eu/";
    		   RequestSpecification request = RestAssured.given();
    		   request.queryParam("fulltext", "true").accept("application/xml");
    		   Response name = request.get("/rest/v2/name/afghanistan");
    		   System.out.println(name.getStatusLine());
          }
    	 @Test
         public void responsecode2() 
          {
       	       RestAssured.baseURI = "http://restcountries.eu/";
    		   RequestSpecification request = RestAssured.given();
    		   request.queryParam("fulltext", "true").accept("application/json");
    		   Response name = request.get("/rest/v2/name/loveneet");
    		   System.out.println(name.getStatusLine());
          }
    	 @Test
    	 public void responsecode3()
    	 {
    		 RestAssured.baseURI = "http://restcountries.eu/";
  		     RequestSpecification request = RestAssured.given();
  		     request.queryParam("fulltext", "true");
		     Response name = request.delete("/rest/v2/name/afghanistan");
		     System.out.println(name.getStatusLine());
    	 }
}
