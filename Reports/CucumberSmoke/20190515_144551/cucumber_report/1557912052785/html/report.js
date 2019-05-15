$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Product Edit/UpdateProduct.feature");
formatter.feature({
  "name": "Update Product",
  "description": "  I want to update the product",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UpdateProduct"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UpdateProduct"
    },
    {
      "name": "@UpdateProduct"
    }
  ]
});
formatter.step({
  "name": "user in edit page",
  "keyword": "Given "
});
formatter.match({
  "location": "UpdateProduct.user_in_edit_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user modifies the product description and updates",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProduct.user_modifies_the_product_description_and_updates()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product should be update successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProduct.product_should_be_update_successfully()"
});
formatter.result({
  "status": "passed"
});
});