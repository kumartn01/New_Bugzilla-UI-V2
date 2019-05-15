$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Bug Details/VerifyAddingComments.feature");
formatter.feature({
  "name": "Verify adding comments",
  "description": "  I want to Verify adding comments",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AddingComments"
    }
  ]
});
formatter.scenario({
  "name": "Verify adding comments",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AddingComments"
    },
    {
      "name": "@AddingComments"
    }
  ]
});
formatter.step({
  "name": "User moves to comments section in Bug page",
  "keyword": "Given "
});
formatter.match({
  "location": "VerifyAddingComments.User_moves_to_comments_section_in_Bug_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters comments",
  "keyword": "When "
});
formatter.match({
  "location": "VerifyAddingComments.User_enters_comments()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Comments  is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyAddingComments.Verify_Comments_is_added_successfully()"
});
formatter.result({
  "status": "passed"
});
});