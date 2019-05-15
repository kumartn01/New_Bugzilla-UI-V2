$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Login/ValidLogin.feature");
formatter.feature({
  "name": "Valid Login",
  "description": "  I want to verify user is able to login successfully with valid credentials",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Valid Login",
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
  "name": "Login page is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "ValidLogin.Login_page_is_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ValidLogin.user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidLogin.user_is_able_to_login_successfully()"
});
formatter.result({
  "status": "passed"
});
});