Feature: Search
  Background:
    Given User is on the Home page and accept cookies


    Scenario: User search for a sports
      When User clicks blogs menu
      And Search for the "football"
      Then Search results for "football" should be displayed