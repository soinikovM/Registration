package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
    public WebDriver driver;
    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[@id=\"cabinet-widget\"]/div/a/span")
    private WebElement loginBtn;

    public void clickLoginBtn() {
        loginBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"form-entry\"]/div/header/button")
    private WebElement registrationBtn;

    public void clickRegistrationBtn() {
        registrationBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"form-entry\"]/div/form/fieldset[1]/label/div[2]/input")
    private WebElement emailField;

    public void inputEmail(String login) {
        emailField.sendKeys(login);
    }

    @FindBy(xpath = "//*[@id=\"form-entry\"]/div/form/fieldset[2]/label/div[2]/input")
    private WebElement pswdField;

    public void inputPswd(String passwd) {
        pswdField.sendKeys(passwd);
    }

    @FindBy(xpath = "//*[@id=\"form-entry\"]/div/form/div/button")
    private WebElement enterBtn;

    public void clickEnterBtn() {
        enterBtn.click();
    }



}
