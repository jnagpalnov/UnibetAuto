package stepdefinitions;

import cucumber.api.java.en.Then;
import pageobjects.SearchPage;

public class SearchPageSteps {
    SearchPage searchPage=new SearchPage();

    @Then("^Search results for \"(.*)\" are displayed$")
    public void searchSports(String searchItem) throws Throwable{
        searchPage.verifySearchResults(searchItem);
    }
}
