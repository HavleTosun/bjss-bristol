package com.bjss.pages;

import com.bjss.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingDOM extends WelcomeBasePage {
    public ChallengingDOM(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[contains(@id,'0138')][1]")
    public WebElement expectedBlueButton;

    @FindBy(xpath = "//*[contains(@id,'0138')][2]")
    public WebElement expectedRedButton;

    @FindBy(xpath = "//*[contains(@id,'0138')][3]")
    public WebElement expectedGreenButton;
}
