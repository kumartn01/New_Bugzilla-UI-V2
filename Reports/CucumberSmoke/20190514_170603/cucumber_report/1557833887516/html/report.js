$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Product Add/DeleteAddedProduct.feature");
formatter.feature({
  "name": "Delete newly added product",
  "description": "  I want to delete the newly added product",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DeleteProduct"
    }
  ]
});
formatter.scenario({
  "name": "Delete newly added product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DeleteProduct"
    },
    {
      "name": "@DeleteProduct"
    }
  ]
});
formatter.step({
  "name": "user present in product edit page",
  "keyword": "Given "
});
formatter.match({
  "location": "DeleteAddedProduct.user_present_in_product_edit_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click delete product button",
  "keyword": "When "
});
formatter.match({
  "location": "DeleteAddedProduct.click_delete_product_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteAddedProduct.product_is_deleted()"
});
formatter.result({
  "status": "passed"
});
});