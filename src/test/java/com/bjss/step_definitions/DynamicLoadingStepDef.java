package com.bjss.step_definitions;

import com.bjss.pages.DynamicLoading;
import com.bjss.utilities.ConfigurationReader;
import com.bjss.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DynamicLoadingStepDef {


    @Given("the user clicked the example {int}")
    public void the_user_clicked_the_example(Integer int1) {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        DynamicLoading dynamicLoading = new DynamicLoading();
        dynamicLoading.goToDynamicLoading();
        dynamicLoading.dynamicLoadingExample.click();
    }

    @When("the user clicked the start button and wait a certain time to load")
    public void the_user_clicked_the_start_button_and_wait_a_certain_time_to_load() {
        DynamicLoading dynamicLoading = new DynamicLoading();
        dynamicLoading.startButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.get(),20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Hello World!']")));
    }


    @Then("{string} is rendered")
    public void is_rendered(String string) {

        DynamicLoading dynamicLoading = new DynamicLoading();
        System.out.println(dynamicLoading.helloWorld.getText() + " is rendered." );

    }

}
