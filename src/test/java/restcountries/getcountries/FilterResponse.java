package restcountries.getcountries;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class FilterResponse {
  @Test
  public void filter()
  {
	    RestAssured.baseURI = "http://restcountries.eu/";
		RequestSpecification request = RestAssured.given();
		request.queryParam("fulltext", "true").header("content-type", "application/json");
		Response name = request.get("/rest/v2/name/afghanistan");
		JsonPath j= new JsonPath(name.asString());
		System.out.println(j.getString("name"));
		
		System.out.println("Hello Loveneet SIngh");
		
		//given().queryParam("fulltext","true").header("content-type","application/json").when().get("")
				
				//given().log().all().queryParam("codes","afg").header("content-type","application/json")
				 //  	  .when().get("/rest/v2/alpha").then().log().all().assertThat().statusCode(200);
		
		//System.out.println(name1);
  }
}
