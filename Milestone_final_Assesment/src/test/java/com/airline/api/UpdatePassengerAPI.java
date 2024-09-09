//Name: Bhagyasri
//Date: 04/09/2024
package com.airline.api;

import io.restassured.RestAssured;

public class UpdatePassengerAPI {
    public void updatePassengerDetailsViaAPI(String bookingReference, String newPassengerName) {
        RestAssured.given()
            .contentType("application/json")
            .body("{\"passengerName\":\"" + newPassengerName + "\"}")
            .put("https://api.airline.com/bookings/" + bookingReference)
            .then()
            .statusCode(200);
    }
}