Feature: Amazon search criteria

Scenario: Search amazon1
Given the user is on the amazon home page
When user entres coffee mug
And user click search button
Then user should view search results

Scenario: Seach amazon2
Given the user is on the amazon home page
When user entres pretty coffe mug
And user click search button
Then user should view search results as a pretty cofee mug

Scenario: Search amazon3
Given the user is on the amazon home page
When user entres cool coffe mug
And user click search button
Then user should view search results as a cool cofee mug

Scenario: Search amazon4
Given the user is on the amazon home page
When user entres cute cofffe mug
And user click search button
Then user should view search results as a cute coffe mug