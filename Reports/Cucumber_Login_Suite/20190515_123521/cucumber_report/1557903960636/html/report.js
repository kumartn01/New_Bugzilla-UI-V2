$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Login/BugzillaApplicationLoads.feature");
formatter.feature({
  "name": "BugzillaApplicationLoads",
  "description": "  I want to verify if Bugzilla Application Loads",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "verify if Bugzilla Application Loads",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User enters application url",
  "keyword": "Given "
});
formatter.match({
  "location": "BugzillaApplicationLoads.User_enters_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Application loads and its fields",
  "keyword": "When "
});
formatter.match({
  "location": "BugzillaApplicationLoads.verify_Application_loads_and_its_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the login button is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "BugzillaApplicationLoads.verify_the_login_button_is_disabled()"
});
formatter.result({
  "status": "passed"
});
});