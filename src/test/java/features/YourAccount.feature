Feature: Account menu for active and logged users

  #EX2-TC2
  Scenario: Verify left menu contains mandatory items
    Given the user navigates to 'https://demo.opencart.com/'
    And click on My Account
    And click on Login button
    And Enter Credentials and click Login button
    Then "Edit your account information", "Change your password", "Modify your address book entries", "Modify your wish list" are present within left menu