package stepdefinitions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class smartHomeSystem {
	    Response response;
	    RequestSpecification request;
	    @SuppressWarnings("rawtypes")
		ResponseBody body;
	    String output;
	    private static final String BASE_URL="";
	@Test
	public void setUp() {
		 RestAssured.baseURI=BASE_URL;
		 request = RestAssured.given();
	}
    @SuppressWarnings("unchecked")
	public void testAddDevice() {
    		@SuppressWarnings("unused")
    		//Code for Post data into Application
		    JSONObject requestParams = new JSONObject();
    		requestParams.put("ID",1);
		    requestParams.put("name", "Light");
		    requestParams.put("status", "OFF");
		    requestParams.put("ID",2);
		    requestParams.put("name", "Thermostat");
		    requestParams.put("status", "OFF");
		    requestParams.put("ID",3);
		    requestParams.put("name","Fan");
		    request.header("Content-Type","application/json");
		    request.body(requestParams.toJSONString());
		    response=request.put("/device");//Given endPoint
		    body = response.body();
		    
		    //Printing the Body after posting
		    System.out.println(response.getStatusLine());
		    System.out.println(body.asString());
		    //Assertions 
		    int expStatusCode=201;
		   	int statusCode = response.getStatusCode();
		   	System.out.println(statusCode);
		   	assertEquals(expStatusCode,statusCode);
    }

    @Test
    public void testGetAllDevices() {
  	  //Getting all the data
   	  response = request.get("/devices");//Given endpoint
   	  
   	  //Printing the body
   	  output=response.asString();
	  System.out.println(output);
	  
	   //Assertions
	   	int statusCode = response.getStatusCode();
	   	System.out.println(statusCode);
	    int expStatusCode=200;
	   	System.out.println(statusCode);
	   	assertEquals(expStatusCode,statusCode);
    }

    @Test
    public void testGetDevice() {
    	 int int1=1;//Device ID
		response =request.get("/devices/" + int1);
		//Output
	    output=response.asString();
 	   	System.out.println(output);
 	   	//Assertions
 	   	int statusCode = response.getStatusCode();
 	   	System.out.println(statusCode);
 	   int expStatusCode=200;
	   	System.out.println(statusCode);
	   	assertEquals(expStatusCode,statusCode);
    }

    @Test
    public void testUpdateDevice() {
    	int ID=1;
    	 HashMap<String, Object> updatedDetails = new HashMap<>();
    	 updatedDetails.put("ID", 1);
         updatedDetails.put("name", "Light");
         updatedDetails.put("status", "ON");

         response = request.header("Content-Type", "application/json")
                           .body(updatedDetails)
                           .put("//" +ID);
         //Output
         
         String output = response.getBody().asString();
         System.out.println(output);
         
         //Assertions
	         int statusCode = response.getStatusCode();
	         System.out.println("Status Code: " + statusCode);         
	        int expStatusCode=201;
	 	   	System.out.println(statusCode);
	 	   	assertEquals(expStatusCode,statusCode);
    }

    @Test
    public void testDeleteDevice() {
    	int ID=1;
    	 response =given().delete("/users/" + ID);
    	  System.out.println(response.getStatusLine());
  	    int expStatusCode=204;
  	   	int statusCode = response.getStatusCode();
  	   	System.out.println(statusCode);
  	   	assertEquals(expStatusCode,statusCode);
    }

    @Test
    public void testCreateSchedule() {
    	  schedule schedule = new schedule("1", "Turn on light at 7 AM");

          given()
              .contentType(ContentType.JSON)
              .body(schedule)
          .when()
              .post("/schedules")
          .then()
              .statusCode(201)
              .body("id", equalTo("1"))
              .body("description", equalTo("Turn on light at 7 AM"));
    }

    @Test
    public void testGetIDSchedule() {
    	   // Assuming the schedule with ID "1" exists
        given()
            .pathParam("id", "1")
        .when()
            .get("/schedules/{id}")
        .then()
            .statusCode(200)
            .body("id", equalTo("1"))
            .body("description", equalTo("Turn on light at 7 AM"));
    }
    @Test
    public void testGetAllSchedules() {
        // Send a GET request to retrieve all schedules
        given()
        .when()
            .get("/schedules")
        .then()
            .statusCode(200);
    }
}

