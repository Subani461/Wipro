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
  "location": "stepdefinitions.tc5.the_user_is_on_the_Reqres_delete_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he deletes the user with ID 4",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.tc5.he_deletes_the_user_with_ID(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system returns status code",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.tc5.the_system_returns_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/patch.feature");
formatter.feature({
  "name": "Updates user information",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Updating user job information Again",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@patch"
    }
  ]
});
formatter.step({
  "name": "the user is on the update page to update the data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.tc4.the_user_is_on_the_update_page_to_update_the_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he updates the previous data to new data",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.tc4.he_updates_the_previous_data_to_new_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system returns the status code for the above update as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.tc4.the_system_returns_the_status_code_for_the_above_update_as(java.lang.Integer)"
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
  "location": "stepdefinitions.tc2.the_user_in_the_Home_Page_for_posting_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he posts data",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.tc2.he_posts_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system returns the status code 201",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.tc2.the_system_returns_the_status_code(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/put.feature");
formatter.feature({
  "name": "Update user information",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Update user job information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@put"
    }
  ]
});
formatter.step({
  "name": "the user is on the update page for the user data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.tc3.the_user_is_on_the_update_page_for_the_user_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he updates the previous data",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.tc3.he_updates_the_previous_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system returns the status code 200 OK",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.tc3.the_system_returns_the_status_code_OK(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/request.feature");
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
  "location": "stepdefinitions.tc1.the_user_is_in_the_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he enters the valid request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.tc1.he_enters_the_valid_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he gets the valid response",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.tc1.he_gets_the_valid_response()"
});
formatter.result({
  "status": "passed"
});
});