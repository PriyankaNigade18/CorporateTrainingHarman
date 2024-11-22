package com.RestAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestWithoutBDD {
  @Test
  public void testGetBookingId()
  {
	  
	  Response res=RestAssured.get("https://restful-booker.herokuapp.com/booking");
	  System.out.println("Satatus code is: "+res.statusCode());
	  System.out.println("Satatus line is: "+res.statusLine());
	  System.out.println("***********Response in string pattern*****");
	  System.out.println(res.asString());
	  System.out.println("***********Response in Json***************");
	  System.out.println(res.asPrettyString());
  }
  
  @Test
  public void getBookingDetails()
  {
	  Response res=RestAssured.get("https://restful-booker.herokuapp.com/booking/49");
	  System.out.println(res.statusCode());
	  System.out.println(res.asPrettyString());
	  String fname=res.jsonPath().getString("firstname");
	  
	  Assert.assertEquals(fname,"Josh");
	  System.out.println("Firstname is matching!");
  }
  
  @Test
  public void createBooking()
  {
	  RestAssured.post("https://restful-booker.herokuapp.com/booking");
	  
  }
  
  
  
}
