Feature: Beymen Web Application Test Automation

  Scenario: Beymen Test Automation
    Given Navigate to Beymen Website
    And   Verify menu options
    And   Go to the Woman section from the menu options
    And   Go to bag
    And   From the Bag section, click on Shoulder Bag
    And   Choose Boxy Pink Leather Crossbody Bag
    And   Click Add to Cart
    And   Verify Added to Cart
    And   Go back to Beymen Homepage
    And   Go to the Male section from the menu options
    And   Click on Sweatshirt from Clothing section
    And   Choose the Summit Gray Hoodie
    And   Please choose size S
    And   Go to Kids section from menu options
    And   Go Boy
    And   Click on Shirts from the Boys section
    And   Choose the Polo Ralph Lauren Shirt
    And   Please choose size M
    And   Go to Cart
    And   Verify that all added products have arrived in the cart
    And   Verify all items in the Order Summary
    When  Delete all items in the cart and verify that there are no items in the cart
    Then  Go back to Home Page

