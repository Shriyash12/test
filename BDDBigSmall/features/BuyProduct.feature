Feature: Search the product and Buy the product.

Scenario Outline: To check the functionality of buying the product

Given Open the browser
And Enter URL in searchbar
When User will land to homepage
And Search for product by entering keys in Search bar
Then Search result page is displayed for search keys
And Select the product
And Add product to cart to buy
And Fill the Delivery details <pin> and <phone> continue
And Continue shopping order placed
And Close the Browser


Examples:
|pin   |phone     |
|445001|9087654321|