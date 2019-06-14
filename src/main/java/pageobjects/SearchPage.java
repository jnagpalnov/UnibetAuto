package pageobjects;

import baseclasses.BasePage;
import org.openqa.selenium.By;

public class SearchPage extends BasePage {


    public void verifySearchResults(String searchItem){
        By searchResult=By.xpath("//a[contains(@href,'blog')]//p[contains(.,'football')]");
    }
}
