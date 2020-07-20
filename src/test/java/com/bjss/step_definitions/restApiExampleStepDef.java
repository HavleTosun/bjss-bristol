package com.bjss.step_definitions;


import com.bjss.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class restApiExampleStepDef {

    Response response;

    @Given("the user connected with example api")
    public void the_user_connected_with_example_api() {
        RestAssured.baseURI = ConfigurationReader.get("api.uri");

    }

    @When("the user update employee data")
    public void the_user_update_employee_data() {
        Map<String,Object> putMap = new HashMap<>();
        putMap.put("id",21);
        putMap.put("employee_name","test");
        putMap.put("employee_salary","1243");
        putMap.put("employee_age","23");
        putMap.put("profile_image","");

        given().and().pathParam("id",21).contentType(ContentType.JSON)
                .and().body(putMap)
                .when().put("/update/{id}");

    }

    @Then("status code should be {int}")
    public void status_code_should_be(int statusCode) {
        //verify status code is matching with feature file
        Assert.assertEquals(response.statusCode(),statusCode);

    }

}
