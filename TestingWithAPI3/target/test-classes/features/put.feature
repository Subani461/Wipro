Feature: Update Pet Details

  @put
  Scenario: Successfully updating a pets details
    Given I open the API to update the details
    When user provides a valid ID of 0, name "PersianCat", status "SOLD"
    Then the response status code should be displayed