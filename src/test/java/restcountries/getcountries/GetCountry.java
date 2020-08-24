package restcountries.getcountries;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetCountry 
 {
	  @Test
	   public void countryInformation()
	    {      
		    RestAssured.baseURI = "http://restcountries.eu/";
			RequestSpecification request = RestAssured.given();
			request.queryParam("fulltext", "true").header("content-type", "application/json");
			Response name = request.get("/rest/v2/name/afghanistan");
			System.out.println(name.asString());
			
			System.out.println("-----------------------------------------------------------------------");
			
			request.queryParam("codes","col").header("content-type", "application/json");
			System.out.println(request.get("/rest/v2/alpha").asString());
			
			System.out.println("-----------------------------------------------------------------------");
			
			request.header("content-type", "application/json");
			System.out.println(request.get("/rest/v2/currency/cop").asString());
			
			System.out.println("-----------------------------------------------------------------------");
			
			request.header("content-type", "application/json");
			System.out.println(request.get("/rest/v2/lang/es").asString());
			
			System.out.println("-----------------------------------------------------------------------");
			
			request.queryParam("codes","afg").header("content-type", "application/json");
			System.out.println(request.get("/rest/v2/capital/tallinn").asString());
			
			System.out.println("-----------------------------------------------------------------------");
			
			
	    }
	  
 }
	
	// @Test
 //    public void list_of_codes()
  //   {
    //	  given().log().all().queryParam("codes","afg").header("content-type","application/json")
   // 	  .when().get("/rest/v2/alpha").then().log().all().assertThat().statusCode(200);
    // }	  
    	  

