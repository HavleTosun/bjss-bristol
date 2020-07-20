package com.bjss.pages;

import com.bjss.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class WelcomeBasePage {
    public WelcomeBasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(partialLinkText="Challenging")
    public WebElement challengingDom;

    @FindBy(partialLinkText="Dynamic Loading")
    public WebElement dynamicLoading;

    public void goToChallengingDom(){
        challengingDom.click();

    }

    public void goToDynamicLoading(){
        dynamicLoading.click();
    }

}
