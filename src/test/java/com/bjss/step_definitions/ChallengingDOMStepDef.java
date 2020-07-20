package com.bjss.step_definitions;

import com.bjss.pages.ChallengingDOM;
import com.bjss.pages.WelcomeBasePage;
import com.bjss.utilities.ConfigurationReader;
import com.bjss.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class ChallengingDOMStepDef {

    @Given("the user is on the examples page")
    public void the_user_is_on_the_examples_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
    }

    @Given("the user navigates {string}")
    public void the_user_navigates(String string) {
        ChallengingDOM challengingDOM = new ChallengingDOM();
        challengingDOM.goToChallengingDom();
    }

    @When("the user clicked the red button")
    public void the_user_clicked_the_red_button() {
        ChallengingDOM challengingDOM = new ChallengingDOM();
        challengingDOM.expectedRedButton.click();

    }

    @Then("the blue, red, and green button ids change")
    public void the_blue_red_and_green_button_ids_change() {
        ChallengingDOM challengingDOM = new ChallengingDOM();

        String actualBlueButton = Driver.get().findElement(By.xpath("//*[contains(@id,'0138')][1]")).getTagName();
        if(!challengingDOM.expectedBlueButton.equals(actualBlueButton)){
            System.out.println("Blue button id changed");
        }

        String actualRedButton = Driver.get().findElement(By.xpath("//*[contains(@id,'0138')][2]")).getTagName();
        if(!challengingDOM.expectedBlueButton.equals(actualRedButton)){
            System.out.println("Red button id changed");
        }
        String actualGreenButton = Driver.get().findElement(By.xpath("//*[contains(@id,'0138')][3]")).getTagName();
        if(!challengingDOM.expectedBlueButton.equals(actualGreenButton)){
            System.out.println("Green button id changed");
        }


    }
}
