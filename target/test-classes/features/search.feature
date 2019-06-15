Feature: Search
  Background:
    Given User is on the Home page and accept cookies

   Scenario Outline:User perform search from Blog menu drawer
      When User clicks the blog menu
      And Search for the "<SearchItem>"
      Then Search results for "<SearchItem>" are displayed
     Examples:
       |SearchItem|
       |Football|
       |Tennis|
       |Golf|

     Scenario: User perform search on search page
       When User clicks the blog menu
       And Search for the "Football"
       Then Search results for "Football" are displayed
       And User change the search item to "Tennis"
       Then Search dropdown should display search results for "Tennis"
       When User clicks the search icon
       Then Search results for "Tennis" are displayed

     Scenario: User perform keyword search on Search page
       When User clicks the blog menu
       And Search for the "Football"
       Then Search results for "Football" are displayed
       And User change the search item to "Ten"
       Then Search dropdown should display search results for "Tennis"
       And User select topmost search result for "Tennis"
       Then User is redirected to the "Tennis" news article page

     Scenario: User perform invalid search on Search page
       When User clicks the blog menu
       And Search for the "%"
       Then Error "No search result" should be displayed
       And User change the search item to "invalidSearchItem%"






