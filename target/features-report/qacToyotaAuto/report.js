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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:20)"
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
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:29)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press button last page",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:33)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button Payment",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:37)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I edit Payment Info",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:41)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button Update",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:46)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check last row",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:49)"
});
formatter.result({
  "status": "passed"
});
});