$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Product Add/AddProduct.feature");
formatter.feature({
  "name": "Verify whether user is able to add a New Product",
  "description": "  I want Verify whether user is able to add a New Product",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Add"
    }
  ]
});
formatter.scenario({
  "name": "Login and click on Product Add Tab to go to Add page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Add"
    },
    {
      "name": "@Add"
    }
  ]
});
formatter.step({
  "name": "navigate_to_application_url",
  "keyword": "Given "
});
formatter.match({
  "location": "AddProductVerification.navigate_to_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login_to_application_with_valid_credentials",
  "keyword": "When "
});
formatter.match({
  "location": "AddProductVerification.login_to_application_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click_on_ProductAdd_Button",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProductVerification.click_on_ProductAdd_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the product add fields",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductVerification.verify_the_product_add_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if ProductAdd button is disabled",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductVerification.verify_the_productAddButton_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "input all mandatory fields",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductVerification.input_all_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Product Add button is enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProductVerification.verify_ProductAdd_button_is_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify duplicate product cannot be created",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductVerification.verify_duplicate_product_cannot_be_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create a new valid product",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProductVerification.create_a_new_valid_product()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Product Add/AvailabilityOfAddedProduct.feature");
formatter.feature({
  "name": "Availability of newly added product in new bug page package dropdown",
  "description": "  I want verify whether newly created product is available to use ",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@VerifyAddedProduct"
    }
  ]
});
formatter.scenario({
  "name": "verification of newly added product in package dropdown",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VerifyAddedProduct"
    },
    {
      "name": "@VerifyAddedProduct"
    }
  ]
});
formatter.step({
  "name": "user present in new bug page",
  "keyword": "Given "
});
formatter.match({
  "location": "AvailabilityOfAddedProduct.user_present_in_new_bug_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on package dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "AvailabilityOfAddedProduct.click_on_package_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify presence of newly added product",
  "keyword": "Then "
});
formatter.match({
  "location": "AvailabilityOfAddedProduct.verify_presence_of_newly_added_product()"
});
formatter.result({
  "status": "passed"
});
});