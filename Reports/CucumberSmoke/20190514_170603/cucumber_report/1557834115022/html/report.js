$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/New-Bugzilla-Application/Automation/New_Bugzilla-UI-V2/Include/features/BDD Cucumber Tests/Web UI Tests/Search/BasicSearch.feature");
formatter.feature({
  "name": "Basic Search",
  "description": "  I want to do basic search",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BasicSearch"
    }
  ]
});
formatter.scenario({
  "name": "Basic Search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BasicSearch"
    },
    {
      "name": "@BasicSearch"
    }
  ]
});
formatter.step({
  "name": "user is present in Search page",
  "keyword": "Given "
});
formatter.match({
  "location": "BasicSearch.user_is_present_in_Search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for bugs with specific package",
  "keyword": "When "
});
formatter.match({
  "location": "BasicSearch.User_searches_for_bugs_with_specific_package()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is shown correct search result",
  "keyword": "Then "
});
formatter.match({
  "location": "BasicSearch.User_is_shown_correct_search_result()"
});
formatter.result({
  "status": "passed"
});
});