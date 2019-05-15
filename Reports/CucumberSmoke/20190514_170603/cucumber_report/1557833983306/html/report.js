$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/New Bug/NewBugCreation.feature");
formatter.feature({
  "name": "New Bug Creation",
  "description": "  I want to create a new bug",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NewBugCreation"
    }
  ]
});
formatter.scenario({
  "name": "New Bug Creation with basic flow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NewBugCreation"
    },
    {
      "name": "@NewBugCreation"
    }
  ]
});
formatter.step({
  "name": "user present in New bug page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewBugCreation.user_present_in_Newbugpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills in all mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "NewBugCreation.user_fills_in_all_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create new bug successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewBugCreation.create_new_bug_successfully()"
});
formatter.result({
  "status": "passed"
});
});