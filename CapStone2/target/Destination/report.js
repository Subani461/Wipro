$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/commentByID.feature");
formatter.feature({
  "name": "Retrieve comments for a specific post",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Retrieve comments for post with ID 2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CommentID"
    }
  ]
});
formatter.step({
  "name": "user having the API endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.commentID.user_having_the_API_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I sends a GET request to endpoint \"/comments?postId\u003d1\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.commentID.i_sends_a_GET_request_to_endpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code should be as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.commentID.the_response_status_code_should_be_as(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response content type should be like \"application/json\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.commentID.the_response_content_type_should_be_like(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response body should contain comments for post ID 1",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.commentID.the_response_body_should_contain_comments_for_post_ID(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/delete.feature");
formatter.feature({
  "name": "Delete API test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User wants to delete data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@delete"
    }
  ]
});
formatter.step({
  "name": "the user in the HOME page for delete data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.delete.the_user_in_the_HOME_page_for_delete_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he deletes the data if ID 11",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.delete.he_deletes_the_data_if_ID(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system returns  status code",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.delete.the_system_returns_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/get.feature");
formatter.feature({
  "name": "Get data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User want to get list of all users from the application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@get"
    }
  ]
});
formatter.step({
  "name": "the user has the  REST API endpoint",
  "keyword": "Given "
});
formatter.step({
  "name": "I send a GET request to the endpoint is \"\u003cEndpoint\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the response status code will be 200",
  "keyword": "Then "
});
formatter.step({
  "name": "the response content type should be as \"application/json\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Endpoint"
      ]
    },
    {
      "cells": [
        "/posts/"
      ]
    },
    {
      "cells": [
        "/post/"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User want to get list of all users from the application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@get"
    }
  ]
});
formatter.step({
  "name": "the user has the  REST API endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.get.the_user_has_the_REST_API_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send a GET request to the endpoint is \"/posts/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.get.i_send_a_GET_request_to_the_endpoint_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code will be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.get.the_response_status_code_will_be(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response content type should be as \"application/json\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.get.the_response_content_type_should_be_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User want to get list of all users from the application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@get"
    }
  ]
});
formatter.step({
  "name": "the user has the  REST API endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.get.the_user_has_the_REST_API_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send a GET request to the endpoint is \"/post/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.get.i_send_a_GET_request_to_the_endpoint_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code will be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.get.the_response_status_code_will_be(java.lang.Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [404] but found [200]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:907)\r\n\tat org.testng.Assert.assertEquals(Assert.java:917)\r\n\tat stepdefinitions.get.the_response_status_code_will_be(get.java:37)\r\n\tat ✽.the response status code will be 200(file:///C:/Users/Administrator/eclipse-workspace/CapStone2/src/test/resources/features/get.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the response content type should be as \"application/json\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.get.the_response_content_type_should_be_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/getById.feature");
formatter.feature({
  "name": "Retrive Details by ID",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Succesfully retrive details using valid ID",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ID"
    }
  ]
});
formatter.step({
  "name": "the user having the  REST API endpoint",
  "keyword": "Given "
});
formatter.step({
  "name": "I send a GET request to the endpoint with \"\u003cID\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the response status code wil be as 200",
  "keyword": "Then "
});
formatter.step({
  "name": "the response content type will be as \"application/json\"",
  "keyword": "And "
});
formatter.step({
  "name": "the response should contain user data with ID 1",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ID"
      ]
    },
    {
      "cells": [
        "1"
      ]
    },
    {
      "cells": [
        "1010"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Succesfully retrive details using valid ID",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ID"
    }
  ]
});
formatter.step({
  "name": "the user having the  REST API endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.getByIdd.the_user_having_the_REST_API_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send a GET request to the endpoint with \"1\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.getByIdd.i_send_a_GET_request_to_the_endpoint_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code wil be as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.getByIdd.the_response_status_code_wil_be_as(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response content type will be as \"application/json\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.getByIdd.the_response_content_type_will_be_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response should contain user data with ID 1",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.getByIdd.the_response_should_contain_user_data_with_ID(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Succesfully retrive details using valid ID",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ID"
    }
  ]
});
formatter.step({
  "name": "the user having the  REST API endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.getByIdd.the_user_having_the_REST_API_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send a GET request to the endpoint with \"1010\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.getByIdd.i_send_a_GET_request_to_the_endpoint_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code wil be as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.getByIdd.the_response_status_code_wil_be_as(java.lang.Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [404] but found [200]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:907)\r\n\tat org.testng.Assert.assertEquals(Assert.java:917)\r\n\tat stepdefinitions.getByIdd.the_response_status_code_wil_be_as(getByIdd.java:44)\r\n\tat ✽.the response status code wil be as 200(file:///C:/Users/Administrator/eclipse-workspace/CapStone2/src/test/resources/features/getById.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the response content type will be as \"application/json\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.getByIdd.the_response_content_type_will_be_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the response should contain user data with ID 1",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.getByIdd.the_response_should_contain_user_data_with_ID(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/getComment.feature");
formatter.feature({
  "name": "Retrieve comments for a post",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Retrieve comments for a specific post",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@comment"
    }
  ]
});
formatter.step({
  "name": "User having the API endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.getComment.user_having_the_API_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send a GET request to the endpoint \"/posts/1/comments\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.getComment.i_send_a_GET_request_to_the_endpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.getComment.the_response_status_code_should_be(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response content type should be \"application/json\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.getComment.the_response_content_type_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response body should contain a list of comments",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.getComment.the_response_body_should_contain_a_list_of_comments()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/patch.feature");
formatter.feature({
  "name": "Pacth API test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User wants to Patch data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@patch"
    }
  ]
});
formatter.step({
  "name": "the user in the HOME page for patch data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.patch.the_user_in_the_HOME_page_for_patch_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he patch the data",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.patch.he_patch_the_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system return the status code",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.patch.the_system_return_the_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/post.feature");
formatter.feature({
  "name": "Put API test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User wants to post data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@post"
    }
  ]
});
formatter.step({
  "name": "the user in the HOME page for post data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.post.the_user_in_the_HOME_page_for_post_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he posts the data",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.post.he_posts_the_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system returns the status code 201",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.post.the_system_returns_the_status_code(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/put.feature");
formatter.feature({
  "name": "Put API test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User wants to put data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@put"
    }
  ]
});
formatter.step({
  "name": "the user in the HOME page for put data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.put.the_user_in_the_HOME_page_for_put_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he puts the data",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.put.he_puts_the_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system returns the status code",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.put.the_system_returns_the_status_code()"
});
formatter.result({
  "status": "passed"
});
});