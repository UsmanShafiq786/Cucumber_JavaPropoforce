Feature: Google syncing Login Functionality

  Background:
    Given Given user launch Chrome browser
    When  User open the URL "https://zameen.propforce.com"
    Then  user redirected to the URL "https://accounts.google.com/o/oauth2/auth/identifier?access_type=offline&approval_prompt=force&client_id=141646075248-2o3mk304mpfc7vdr5bogt14qml29hupk.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fiap.propforce.com%2Foauth2%2Fcallback&response_type=code&scope=profile%20email&state=g45y1ztUGliUdlrOfEDiKzj9VCWo1mKy1neDBZDobEM%3Ahttps%3A%2F%2Fzameen.propforce.com%2F&flowName=GeneralOAuthFlow"

  Scenario: : Verify there is label IAP EMPGLabs on login screen
    Then   There should be a label IAP EMPGLabs

  Scenario: Verify user should be able see Developer info after clicking on IAP EMPGLabs Link
    Then  User should be able to click on IAP EMPGLABS

  Scenario: Verify clicking on "Got it" button developer info should be closed
    Then User should be able to click on IAP EMPGLABS
    Then  user click on the got it button

  Scenario: Verify entering email and password User should be redirected to Propforce login page
    When User enter an email as "usman.shafique@empglabs.com" in the email field
    And  User Click on Next button
    Then User redirected to the password screen "https://accounts.google.com/signin/v2/challenge/pwd?access_type=offline&approval_prompt=force&client_id=141646075248-2o3mk304mpfc7vdr5bogt14qml29hupk.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fiap.propforce.com%2Foauth2%2Fcallback&response_type=code&scope=profile%20email&state=LXrZKwkP6jtf6L5JXIYJNozU-Klj41CmOo7jqj3l6Mw%3Ahttps%3A%2F%2Fzameen.propforce.com%2F&flowName=GeneralOAuthFlow&cid=1&navigationDirection=forward&TL=AB_wV5opFhX3jM802p0CaFioYRVi6W2istFxE69PGH4BdeAl2FOxpk8bC07e4P3y"
    And  User enter the password as "usman@sibgha7890" in the password
    Then User redirected to the login URL "https://zameen.propforce.com/en/login" of Propforce login





