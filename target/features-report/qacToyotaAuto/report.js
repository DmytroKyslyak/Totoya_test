$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/blabla.feature");
formatter.feature({
  "name": "Login feature",
  "description": "  dkfsjlsdj\n  fsdlf;sdf clsvd scvdvsd",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@batch1"
    },
    {
      "name": "@tagLoginFeat"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I open login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:19)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Web Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@batch1"
    },
    {
      "name": "@tagLoginFeat"
    },
    {
      "name": "@testToyota1"
    }
  ]
});
formatter.step({
  "name": "I open browser",
  "keyword": "When "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:26)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press button",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:31)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check element",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:35)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:40)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check element block",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:50)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button last page",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:56)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check last row",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:61)"
});
formatter.result({
  "status": "passed"
});
});