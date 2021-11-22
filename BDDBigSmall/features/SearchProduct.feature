Feature: Search the product and validating the Product Name.

Scenario: To validate and search the product and validating the product name on search result page and product details page.

Given Open the browser
And Enter URL in searchbar
When User will land to homepage
And Input some keys in Search bar of hit enter
Then Search result page is displayed
And Select the product and get the name of product
And Product details page is displayed
And Validate the name of product with name of product on search result page
And Close the Browser