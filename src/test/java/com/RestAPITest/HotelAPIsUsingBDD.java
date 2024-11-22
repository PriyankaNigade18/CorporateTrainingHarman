package com.RestAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

/*
 * given()- Pre-requisite
 * ----------------------------
 * headers,request payload,query,path parameter,authentication,cookies
 * 
 * when()- Request
 * ---------------------
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then()- validation
 * -----------------------------
 * status code,message,time,header,body(response payload)
 */


public class HotelAPIsUsingBDD 
{
  @Test(priority=1)
  public void getBookingIDs()
  {
	  Response res=given()
	  
			  .when()
			  .get("https://restful-booker.herokuapp.com/booking");
	  
//	  .then()
//	  .statusCode(200)
//	  .log().all();
	  
	  System.out.println(res.statusCode());
	  int code=res.statusCode();
	  Assert.assertEquals(code,200);
	  System.out.println("Code is matched!");
	  
	  
	  
  }
  
  
  int id;
  
  
  
  @Test(priority=2)
  public void createBooking()
  {
	 Response res=given()
	  .header("Content-Type","application/json")
	  .body("{\n"
	  		+ "    \"firstname\" : \"Jay\",\n"
	  		+ "    \"lastname\" : \"Nigade\",\n"
	  		+ "    \"totalprice\" : 666,\n"
	  		+ "    \"depositpaid\" : true,\n"
	  		+ "    \"bookingdates\" : {\n"
	  		+ "        \"checkin\" : \"2024-11-22\",\n"
	  		+ "        \"checkout\" : \"2024-11-23\"\n"
	  		+ "    },\n"
	  		+ "    \"additionalneeds\" : \"Breakfast\"\n"
	  		+ "}")
	  .when().post("https://restful-booker.herokuapp.com/booking");
	 
	 
	 System.out.println(res.statusCode());
	 System.out.println(res.asPrettyString());
	
	 
	 
	 id=res.jsonPath().getInt("bookingid");
	 System.out.println("Booking created for id: "+id);
	 
	 String fname=res.jsonPath().get("booking.firstname");
	 Assert.assertEquals(fname,"Jay");
	 System.out.println("First name is: "+fname);
	 
	 boolean status=res.jsonPath().getBoolean("booking.depositpaid");
	System.out.println(status);
	 
	 
  }
  
  @Test(priority=3)
  public void getBookingDeatails()
  {
	  System.out.println("Booking details");
	  Response res=given()
	  .when().get("https://restful-booker.herokuapp.com/booking/"+id);
	  
	  System.out.println(res.asPrettyString());
	  
	  String name=res.jsonPath().getString("firstname");
	  System.out.println(name);
	  
	  //res.jsonPath().get
  }
  
  
  @Test(enabled=false)
  public void getUsers()
  {
	  Response res=given()
	  
	  .when().get("https://gorest.co.in/public/v2/users");
	  
	 System.out.println(res.asPrettyString());
	 String gen=res.jsonPath().getString("gender[0]");
	 System.out.println(gen);
  }
  
  
  @Test
  public void createToken()
  {
	  //pojo-plain old java object class-->encapsulation
	  AuthenticateData auth=new AuthenticateData("admin","password123");
//	  auth.setUsername("admin");
//	  auth.setPassword("password123");
	  
	 Response res= given()
	  .header("Content-Type","application/json")
	  .body(auth)
	  .when().post("https://restful-booker.herokuapp.com/auth");
	 
	 String token=res.jsonPath().getString("token");
	 System.out.println(token);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
