$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Login/CaptureVersionOfApplication.feature");
formatter.feature({
  "name": "Capture Version of Application",
  "description": "  I want to Capture Version of Application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Capture Version of Application",
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
  "name": "Url of the application",
  "keyword": "Given "
});
formatter.match({
  "location": "CaptureVersionOfApplication.Url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Application loads",
  "keyword": "When "
});
formatter.match({
  "location": "CaptureVersionOfApplication.Application_loads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Capture current version of application",
  "keyword": "Then "
});
formatter.match({
  "location": "CaptureVersionOfApplication.Capture_current_version_of_application()"
});
formatter.result({
  "status": "passed"
});
});