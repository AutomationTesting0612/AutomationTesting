$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('features\Home.feature');
formatter.feature({
  "line": 2,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Home"
    },
    {
      "line": 1,
      "name": "@Automation"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Navigate to Home Page after Login",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "validate the title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDef.navigateToHomePageAfterLogin()"
});
formatter.result({
  "duration": 248375900,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.validateTheTitle()"
});
formatter.result({
  "duration": 480000,
  "status": "passed"
});
formatter.uri('features\Login.feature');
formatter.feature({
  "line": 2,
  "name": "Test login functionality",
  "description": "",
  "id": "test-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    },
    {
      "line": 1,
      "name": "@Automation"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Test the login Functionality",
  "description": "",
  "id": "test-login-functionality;test-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the URL",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click the Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.openTheBrowser()"
});
formatter.result({
  "duration": 7909500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.enterTheURL()"
});
formatter.result({
  "duration": 126600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.clickTheSubmitButton()"
});
formatter.result({
  "duration": 75100,
  "status": "passed"
});
});