$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/challengingDOM.feature");
formatter.feature({
  "name": "Chellinging DOM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Confirm that the blue\u0027 red\u0027 green button ids chance after the red button is clicked",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the examples page",
  "keyword": "Given "
});
formatter.match({
  "location": "ChallengingDOMStepDef.the_user_is_on_the_examples_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates \"Challenging DOM\"",
  "keyword": "And "
});
formatter.match({
  "location": "ChallengingDOMStepDef.the_user_navigates(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicked the red button",
  "keyword": "When "
});
formatter.match({
  "location": "ChallengingDOMStepDef.the_user_clicked_the_red_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the blue, red, and green button ids change",
  "keyword": "Then "
});
formatter.match({
  "location": "ChallengingDOMStepDef.the_blue_red_and_green_button_ids_change()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/dynamicLoading.feature");
formatter.feature({
  "name": "Dynamic Loading",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Confirm \u0027Hello World!\u0027 is rendered after the loading bar disappears",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the examples page",
  "keyword": "Given "
});
formatter.match({
  "location": "ChallengingDOMStepDef.the_user_is_on_the_examples_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates \"Dynamic Loading\"",
  "keyword": "And "
});
formatter.match({
  "location": "ChallengingDOMStepDef.the_user_navigates(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicked the example 2",
  "keyword": "And "
});
formatter.match({
  "location": "DynamicLoadingStepDef.the_user_clicked_the_example(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicked the start button and wait a certain time to load",
  "keyword": "When "
});
formatter.match({
  "location": "DynamicLoadingStepDef.the_user_clicked_the_start_button_and_wait_a_certain_time_to_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Hello World!\u0027 is rendered",
  "keyword": "Then "
});
formatter.match({
  "location": "DynamicLoadingStepDef.is_rendered(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/restApiExample.feature");
formatter.feature({
  "name": "Update Data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Update employee data and and verify that successfully updated",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user connected with example api",
  "keyword": "Given "
});
formatter.match({
  "location": "restApiExampleStepDef.the_user_connected_with_example_api()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user update employee data",
  "keyword": "When "
});
formatter.match({
  "location": "restApiExampleStepDef.the_user_update_employee_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "status code should be 204",
  "keyword": "Then "
});
formatter.match({
  "location": "restApiExampleStepDef.status_code_should_be(int)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.bjss.step_definitions.restApiExampleStepDef.status_code_should_be(restApiExampleStepDef.java:47)\r\n\tat ✽.status code should be 204(file:src/test/resources/features/restApiExample.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});