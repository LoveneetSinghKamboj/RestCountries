package restcountries.getcountries;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HeaderInfo 
{
	@Test
	public void printHeaderInformation() 
	{
		// RestAssured.baseURI="http://restcountries.eu/";
		// given().log().all().queryParam("fulltext","true").header("content-type","application/json")
		// .when().get("/rest/v2/name/afghanistan").then().log().all().assertThat().statusCode(200);

		RestAssured.baseURI = "http://restcountries.eu/";
		RequestSpecification request = RestAssured.given();
		request.queryParam("fulltext", "true").header("content-type", "application/json");
		Response name = request.get("/rest/v2/name/afghanistan");
		Headers allHeaders = name.headers();
		for (Header header : allHeaders) 
		{
			System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		}
	}
}
