Feature: Order history feature

  #EX2-TC6
  Scenario: Verify "You have not made any previous orders!" message is displayed if user's didn't place orders yet
    Given the user navigates to 'https://demo.opencart.com/'
    And click on My Account
    And click on Login button
    And Enter Credentials and click Login button
    And click on 'Order History' button
    Then Verify message 'You have not made any previous orders!' is displayed