$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Product Add/AvailabilityOfAddedProduct.feature");
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