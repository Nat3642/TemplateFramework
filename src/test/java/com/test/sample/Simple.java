package com.test.sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Simple {
    @Test
    public void t1(){
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        chromedriver.get("https://thinking-tester-contact-list.herokuapp.com/");
        WebElement submit = chromedriver.findElement(By.id("submit"));
        WebElement email = chromedriver.findElement(By.id("email"));
        WebElement password = chromedriver.findElement(By.id("password"));

        email.sendKeys("kir1@gmail.com");
        password.sendKeys("321321321");
        submit.click();
        WebDriverWait wait = new WebDriverWait(chromedriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("My Contacts"));

        Assert.assertEquals("My Contacts",chromedriver.getTitle());
        chromedriver.quit();



    }

}
