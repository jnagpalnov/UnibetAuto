package pageobjects;

import baseclasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlogPage extends BasePage {
    By okButton=By.id("CybotCookiebotDialogBodyButtonAccept");
    By blogMenu=By.xpath("//div[text()='Blog']");
    By SearchFieldInMenuDrawer=By.xpath("//input[contains(@placeholder,'Search in blog')]");

    public void acceptCookies(){
        clickElement(find(okButton));
    }

    public void clickBlogMenu(){
        clickElement(find(blogMenu));
    }

    public void searchInBlog(String searchItem){
        WebElement searchField=find(SearchFieldInMenuDrawer);
        clickElement(searchField);
        enterText(searchField,searchItem);
        pressEnter(searchField);
    }

}
