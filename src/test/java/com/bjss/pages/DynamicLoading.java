package com.bjss.pages;

import com.bjss.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoading extends WelcomeBasePage {
    public DynamicLoading(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(partialLinkText="Example 2:")
    public WebElement dynamicLoadingExample;

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//div[.='Hello World!']")
    public WebElement helloWorld;

}
