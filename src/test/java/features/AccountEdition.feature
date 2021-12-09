Feature: Account edition feature

  Background: Necessary steps to be capable to click on Edit Account information button
    Given the user navigates to 'https://demo.opencart.com/'
    And click on My Account
    And click on Login button
    And Enter Credentials and click Login button

  #EX2-TC4
  Scenario: Verify confirmation message is displayed after account editing
    Given click on 'Edit your account information' button
    And modify any of the field with valid data and click continue
    Then MyAccount page is displayed along message 'Success: Your account has been successfully updated.'

  #EX2-TC5
  #CHECK DID NOT WORK ToDo
  #Last step did not work
  Scenario: Verify message if registration is attempted using an email without '@' symbol at account edition page
    Given click on 'Edit your account information' button
    And Fill account edition form fields with valid information and email "lorememail.com" (without '@')
    And click on Continue button at account edition page
    Then A warning alert 'Please include '@' in the email address. 'Xxxxx' is missing an '@'.' is displayed at account edition page

  #EX2-TC5
  Scenario: Verify message if registration is attempted using an email without .com at account edition page
    Given click on 'Edit your account information' button
    And Fill account edition form fields with valid information and email "lorem@emailcom" (without .com)
    And click on Continue button at account edition page
    Then A warning message 'E-Mail Address does not appear to be valid!' is displayed at account edition page