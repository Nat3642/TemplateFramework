package com.test.steps;

import com.test.pages.LandingPage;
import com.test.ulility.BrowserUtil;
import com.test.ulility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyStepdefs {
    @Given("user is on the landing page and user clicks on {string} button")
    public void user_is_on_the_landing_page_and_user_clicks_on_button(String buttonName) {
        LandingPage.clickMenuByName(buttonName);
    }
    @Then("user must see {string} in title")
    public void user_must_see_in_title(String titleName) {
        BrowserUtil.waitForInTitle(titleName);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(titleName));
    }


}
