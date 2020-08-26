package com.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainTest {
    public static Page page;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        page = new Page(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("mainpage"));
    }

    @Test
    public void loginTest() {
        page.clickLoginBtn();
        page.clickRegistrationBtn();
        page.inputEmail("//здесь ваш тест email");
        page.inputPswd("//здесь ваш тест пароль");
        page.clickEnterBtn();
    }


}
