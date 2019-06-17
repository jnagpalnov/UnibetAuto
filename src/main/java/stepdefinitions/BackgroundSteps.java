package stepdefinitions;

import commonutils.CommonUtils;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import driversetup.DriverFactory;
import org.openqa.selenium.WebDriver;
import pageobjects.BlogPage;

public class BackgroundSteps {
    BlogPage blogPage=new BlogPage();

    @Given("User is on the Home page and accept cookies")
    public void navigateToHomePage() throws Throwable{
        WebDriver driver= DriverFactory.getInstanceOfDriverFactory().getDriver();
        driver.get(CommonUtils.getCentralData("AppUrl"));
        blogPage.acceptCookies();
    }

    @After
    public void quitDriver(){
        DriverFactory.getInstanceOfDriverFactory().quitDriver();

    }


}
