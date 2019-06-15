package stepdefinitions;

import cucumber.api.java.en.*;
import pageobjects.SearchPage;

public class SearchPageSteps {
    SearchPage searchPage=new SearchPage();

    @Then("^Search results for \"(.*)\" are displayed$")
    public void searchSports(String searchItem) throws Throwable{
        searchPage.verifySearchResults(searchItem);
    }

    @Then("^User change the search item to \"(.*)\"$")
    public void changeSearchIem(String searchItem) throws Throwable{
        searchPage.changeSearchItem(searchItem);
    }

    @Then("^Search dropdown should display search results for \"(.*)\"$")
    public void verifySearchDropdownContent(String searchItem) throws Throwable{
        searchPage.verifySearchDropdownContent(searchItem);
    }

    @Then("^User clicks the search icon$")
    public void clickSearchIcon() throws Throwable{
        searchPage.clickSearchIcon();
    }

    @When("^User select topmost search result for \"(.*)\"$")
    public void selectTopMostResult() throws Throwable{
        searchPage.selectSearchResultFromDropdown();
    }
}
