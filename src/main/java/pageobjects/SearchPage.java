package pageobjects;

import baseclasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    By searchField=By.xpath("//button[.//*[@*='#icon-search']]//parent::div//preceding-sibling::div//input");
    By searchFieldDropDownResults=By.xpath("//button[.//*[@*='#icon-search']]//parent::div//preceding-sibling::div//following-sibling::div//a");
    By searchIcon=By.xpath("//button[.//*[@*='#icon-search']]");

    public void verifySearchResults(String searchItem){
        By searchResult=By.xpath("//a[contains(@href,'blog')]//p[contains(.,'"+searchItem+"')]");
        int searchResultsCount=findElements(searchResult).size();
        Assert.assertTrue("Search result count is " + searchResultsCount,searchResultsCount>0);
    }

    public void changeSearchItem(String searchItem){
        WebElement searchField=find(this.searchField);
        searchField.clear();
        enterText(searchField,searchItem);
    }

    public void verifySearchDropdownContent(String searchItem){
        for(WebElement searchResult:findElements(searchFieldDropDownResults))
        {
            Assert.assertTrue("Expected keyword '" +searchItem+"' is not present in" +searchResult.getText(),searchResult.getText().contains(searchItem) || searchResult.getText().contains(searchItem.toLowerCase()));
        }
    }

    public void clickSearchIcon(){
        find(searchIcon).click();
    }

    public void selectSearchResultFromDropdown(){
        findElements(searchFieldDropDownResults).get(1).click();
    }

    public void verifyArticleHeading(String searchItem){
        Assert.assertTrue("Article with heading " + searchItem+ " is not present",isElementPresent(By.xpath("//h1[contains(.,'" + searchItem+"')]")));
    }

    public void verifyErrorMessage(String errorMessage){
        Assert.assertTrue("Error message " + errorMessage+ " is not present",isElementPresent(By.xpath("//h1[contains(.,'" + errorMessage+"')]")));
    }
}
