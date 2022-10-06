Feature: Testing the login functionality of Kaidee Region

  Background:
    Given user launch Chrome browser
    And  user open the URL "https://kaidee.propforce.com/en/login"

  Scenario: successful login with invalid email & valid password
    When  User enter the email as "usman.shafique123@empglabs.com" & password as "PFtest12345"
    And   User click on login button
  #  Then  Verify the Error is "Username/Password is incorrect!"

  Scenario: successful login with invalid email & invalid password
    When  User enter the email as "usman.shafique123@empglabs.com" & password as "PFtest123456"
    And   User click on login button
 #   And  Verify the Title is "Username/Password is incorrect!"

  Scenario: successful login with valid email & invalid password
    When  User enter the email as "usman.shafique@empglabs.com" & password as "PFtest123456"
    And   User click on login button
#    And  Verify the Title is "Username/Password is incorrect!"

  Scenario: successful login with valid email & valid password
    When  User enter the email as "usman.shafique@empglabs.com" & password as "PFtest12345"
    And   User click on login button

  Scenario Outline: Verifying login of all designations Valid email/valid password
    When  User enter <email> and <password>
    And   User click on login button

    Examples:

      | email                         | password    |
      | usman.shafique@empglabs.com   | PFtest12345 |
      | numan.murtaza@empglabs.com    | Qwer1234    |
      | usman.shafique12@empglabs.com | PFtest12345 |

  Scenario: Verify click on Forgot password link
    And User click on the forgot password link
    Then Verify the Title should be "Forgot Password?"

  Scenario: Verify Reset Password with Invalid email ID
    And  User click on the forgot password link
    And  User enter an email as "usman.ali.gmail.com"
    Then User click on Reset Password button
    And  Verify the Title is "Email is incorrect!"

  Scenario: Verify Reset Password with Valid email ID
    And  User click on the forgot password link
    And  User enter an email as "usman.shafique@empglabs.com"
    And  User click on Reset Password button
    Then Verify the Success message "An email with password reset instructions has been sent to you.Please follow the steps listed to proceed!"


  Scenario: Verify click on Zameen logo it should redirect to Zameen.com
    When User click on Zameen.com logo then redirected to url "https://www.zameen.com/"

  Scenario: Verify click on Kaidee logo it should redirect to kaidee.com
    When User click on Kaidee logo then redirected to url "https://www.kaidee.com/"

  Scenario: Verify click on Mubawab logo it should redirect to Mubawab.ma
    When User click on Mubawab logo then redirected to url "https://www.mubawab.ma/"

  Scenario: Verify click on Bproperty logo it should redirect to Bproprty.com
    When User click on Bproperty logo then redirected to url "https://www.bproperty.com/"

#  Scenario: Verify Reset Password email is being sent to user
#    And  User click on Forgot password link
#    Then User redirected to the url "http://dev.lms.empg.com/forgot_password.php"
#    And  User enter an email as "usman.shafique@empglabs.com"
#    And  User click on Reset Password button




