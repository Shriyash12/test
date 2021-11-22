Feature: Check the COD of product by entering pincode.

Scenario Outline: To check the availability of COD on product by pincode.

Given Open the browser
And Enter URL in searchbar
When User will land to homepage
Then Click New from navigation bar
And Select the product from new
And Enter the pincode <pincode> to check the COD
And Validate the message after checking
And Close the Browser

Examples:
|pincode|
|123456 |
