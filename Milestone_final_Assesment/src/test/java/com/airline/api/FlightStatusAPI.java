//Name: Bhagyasri
//Date: 04/09/2024
package com.airline.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FlightStatusAPI {
    public String verifyFlightStatusViaAPI(String flightNumber) {
        Response response = RestAssured.get("https://api.airline.com/flights/" + flightNumber);
        return response.jsonPath().getString("status");
    }
}