$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login2.feature");
formatter.feature({
  "name": "To validate the login functionality of given application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify the username and password with given credentials for Amazon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the given URL.",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.userWillEnterTheGivenURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username and password in the respected field.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.userEnterUsernameAndPasswordInTheRespectedField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click the login button.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.userWillClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the login functionnality.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.userVerifiesTheLoginFunctionnality()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});