Feature: Newsletter feature

  #EX2-TC7
  Scenario: Verify user is capable to update newsletter subscription
    Given the user navigates to 'https://demo.opencart.com/'
    And click on My Account
    And click on Login button
    And Enter Credentials and click Login button
    And click on 'Subscribe / unsubscribe to newsletter' button
    And click on deactivated option and click continue button
    Then Verify message 'Success: Your newsletter subscription has been successfully updated!' is displayed within your 'My Account' page