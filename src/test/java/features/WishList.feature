Feature: Wishlist functionality feature

  #EX2-TC3
  Scenario: Verify "Your wish list is empty" message is displayed if user's wishlist didn't add items
    Given the user navigates to 'https://demo.opencart.com/'
    And click on My Account
    And click on Login button
    And Enter Credentials and click Login button
    And click on 'Wish List' button
    Then 'Your wish list is empty' message is displayed within Wishlist page