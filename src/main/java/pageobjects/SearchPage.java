package pageobjects;

import baseclasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SearchPage extends BasePage {


    public void verifySearchResults(String searchItem){
        By searchResult=By.xpath("//a[contains(@href,'blog')]//p[contains(.,'"+searchItem+"')]");
        int searchResultsCount=findElements(searchResult).size();
        Assert.assertTrue("Search result count is " + searchResultsCount,searchResultsCount>0);
    }
}
