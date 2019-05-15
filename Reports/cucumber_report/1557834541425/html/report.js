$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Product Edit/EditProductFields.feature");
formatter.feature({
  "name": "Verification of Edit product page fields",
  "description": "  I want to Verify Edit product page fields",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ProductEdit"
    }
  ]
});
formatter.scenario({
  "name": "Verify Edit product page fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ProductEdit"
    },
    {
      "name": "@ProductEdit"
    }
  ]
});
formatter.step({
  "name": "Product edit page loads",
  "keyword": "Given "
});
formatter.match({
  "location": "EditProductFields.Product_edit_page_loads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify product update button",
  "keyword": "When "
});
formatter.match({
  "location": "EditProductFields.verify_product_update_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product update button should be disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "EditProductFields.product_update_button_should_be_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the fields of this edit page",
  "keyword": "And "
});
formatter.match({
  "location": "EditProductFields.verify_the_fields_of_this_edit_page()"
});
formatter.result({
  "status": "passed"
});
});