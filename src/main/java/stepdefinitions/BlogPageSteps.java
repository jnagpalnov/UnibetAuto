package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageobjects.BlogPage;

public class BlogPageSteps {

    BlogPage blogPage=new BlogPage();

    @When("User clicks the blog menu")
    public void clickBlogMenu() throws Throwable{
        blogPage.clickBlogMenu();
    }

    @When("^Search for the \"(.*)\"$")
    public void searchSports(String searchItem) throws Throwable{
        blogPage.searchInBlog(searchItem);
    }


}
