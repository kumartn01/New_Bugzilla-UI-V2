$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Bug Details/verifyCommitForBugPage.feature");
formatter.feature({
  "name": "Verify Commit for Bug page",
  "description": "  I want to Verify Commit for Bug page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@commitBugPage"
    }
  ]
});
formatter.scenario({
  "name": "Verify Commit for Bug page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@commitBugPage"
    },
    {
      "name": "@commitBugPage"
    }
  ]
});
formatter.step({
  "name": "User present in bug page",
  "keyword": "Given "
});
formatter.match({
  "location": "VerifyCommitForBugPage.User_present_in_bug_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Modify the bug page field and commit",
  "keyword": "When "
});
formatter.match({
  "location": "VerifyCommitForBugPage.Modify_the_bug_page_field_and_commit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify changes are commited successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyCommitForBugPage.verify_changes_are_commited_successfully()"
});
formatter.result({
  "status": "passed"
});
});