Feature: Home Page

  #EX2-TC1
  Scenario: Verify home page displays at top of the page text "Your Store"
    Given the user navigates to 'https://demo.opencart.com/'
    Then "Your Store" message is present at the top of the page