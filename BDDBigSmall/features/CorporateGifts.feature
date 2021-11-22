Feature: Enquiry for Corporate gifts.

Scenario Outline: To check the functionality and put inquiry for Corporate gifts

Given Open the browser
And Enter URL in searchbar
When User will land to homepage
Then Select Corporate Gifts from Navigation Bar
And User will navigate To corporate gift page
And Enter the Details in the form <name> and <email> and <phone> and <inquiry>
And Hit the inquire now
And Close the Browser

Examples:
|name    |email      |phone     |inquiry                    |
|Shriyash|xyz@abc.com|9087654321|Inquiry for corporate gifts|