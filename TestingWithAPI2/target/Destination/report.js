$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/delete.feature");
formatter.feature({
  "name": "Delete User Information",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Succesfully deletes a user By ID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@delete"
    }
  ]
});
formatter.step({
  "name": "the user is on the Reqres delete endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.delete.the_user_is_on_the_Reqres_delete_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he deletes the user with ID 2",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.delete.he_deletes_the_user_with_ID(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system returns status code",
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
  "name": "Valid Request",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid Request from server",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@get"
    }
  ]
});
formatter.step({
  "name": "the user is in the Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.get.the_user_is_in_the_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he enters the valid request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.get.he_enters_the_valid_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he gets the valid response",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.get.he_gets_the_valid_response()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/getByID.feature");
formatter.feature({
  "name": "Retrive Details by ID",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Succesfully retrive details using valid ID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ID"
    }
  ]
});
formatter.step({
  "name": "I open the API to retrive the details",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.getByID.i_open_the_API_to_retrive_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide a valid ID of 1",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.getByID.i_provide_a_valid_ID_of(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.getByID.the_response_status_will_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/post.feature");
formatter.feature({
  "name": "Post API test",
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
  "name": "the user in the Home Page for posting data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.post.the_user_in_the_Home_Page_for_posting_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he posts data",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.post.he_posts_data()"
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
  "name": "update Details by ID",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Succesfully updated details using valid ID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@put"
    }
  ]
});
formatter.step({
  "name": "I open the API to update the details",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.put.i_open_the_API_to_update_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides a valid ID of 21",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.put.user_provides_a_valid_ID_of(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status will be displayed after completion",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.put.the_response_status_will_be_displayed_after_completion()"
});
formatter.result({
  "status": "passed"
});
});