package com.test.sample;

import com.test.ulility.BrowserUtil;
import com.test.ulility.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleTests {
      public SampleTests(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

    @FindBy(xpath = "//*[@id='email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id='submit']")
    public WebElement buttonSubmit;

    @Test
    public void t1() {
        Driver.getDriver().get("https://thinking-tester-contact-list.herokuapp.com/");
        inputEmail.sendKeys("georgewashington@gmail.com");
        inputPassword .sendKeys("georgywashington");

        buttonSubmit.click();
        
    }
}
