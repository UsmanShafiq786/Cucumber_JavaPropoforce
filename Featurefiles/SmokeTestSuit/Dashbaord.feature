Feature: Testing the functionality of Dashboard

  Background:
    Given user launch Chrome browser
    And  user open the URL "https://kaidee.propforce.com/en/login"

    Scenario:
      When  User enter the email as "usman.shafique123@empglabs.com" & password as "PFtest12345"
      And   User click on login button
      Then  user click on dashboard tab
