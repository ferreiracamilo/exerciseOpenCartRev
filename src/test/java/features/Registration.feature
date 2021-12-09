Feature: Account Registration

  Background: Registration form background steps
    Given the user navigates to 'https://demo.opencart.com/'
    And click on My Account
    And click on Register

  #EX1-TC2
  #for void values the example value set will be 'voidval' and within base page method will be a condition to do nothing in case the argument val is voidval
  @do
  Scenario Outline: Verify all fields are required to complete registry
    Given Check Privacy Policy Agreement checkbox
    And Fill <first_name>,<last_name>,<e_mail>,<telephone>,<password>,<confirm_password> in the registration form
    And click on Continue button at registration page
    Then A warning message is displayed

    Examples:
      | first_name | last_name | e_mail | telephone | password | confirm_password |
      | voidval | Ipsum | lorem@trinzpoe.com | 775-899-3934 | Mypassword123 | Mypassword123 |
      | Ivan | voidval | lorem@trinzpoe.com | 775-899-3934 | Mypassword123 | Mypassword123 |
      | Ivan | Ipsum | voidval | 775-899-3934 | Mypassword123 | Mypassword123 |
      | Ivan | Ipsum | lorem@trinzpoe.com | voidval | Mypassword123 | Mypassword123 |
      | Ivan | Ipsum | lorem@trinzpoe.com | 775-899-3934 | voidval | Mypassword123 |
      | Ivan | Ipsum | lorem@trinzpoe.com | 775-899-3934 | Mypassword123 | voidval |

  #EX1-TC3
  Scenario: Registration form won't let create multiple accounts under same email address
    Given Check Privacy Policy Agreement checkbox
    And Fill registration form fields with valid information and email "pombo@nomailjs.com"
    And click on Continue button at registration page
    Then A warning message 'Warning: E-Mail Address is already registered!' is displayed

  #EX1-TC5
  Scenario: Verify registration form won't accept different values in 'Password' and 'Confirm Password' fields
    Given Check Privacy Policy Agreement checkbox
    And Fill registration form fields with valid information, password "Mypassword123" and confirm password "Mypassword1234"
    And click on Continue button at registration page
    Then A warning message 'Password confirmation does not match password!' is displayed

  #EX1-TC6
  Scenario: Success message displays after successful registration
    Given Check Privacy Policy Agreement checkbox
    And Fill registration form fields with valid information
    And click on Continue button at registration page
    Then New screen is displayed along message 'Your Account Has Been Created'

  #EX1-TC4
  #Did not work final step ToDo
  Scenario: Verify message if registration is attempted using an email without '@' symbol at registration page
    Given Check Privacy Policy Agreement checkbox
    And Fill registration form fields with valid information and email "lorememail.com" (without '@')
    And click on Continue button at registration page
    Then A warning alert 'Please include '@' in the email address. 'Xxxxx' is missing an '@'.' is displayed at registration page

  #EX1-TC4
  Scenario: Verify message if registration is attempted using an email without .com at registration page
    Given Check Privacy Policy Agreement checkbox
    And Fill registration form fields with valid information and email "lorem@emailcom" (without .com)
    And click on Continue button at registration page
    Then A warning message 'E-Mail Address does not appear to be valid!' is displayed at registration page