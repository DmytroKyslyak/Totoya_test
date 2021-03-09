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
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:19)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "BD",
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
      "name": "@dataBaseToyota"
    }
  ]
});
formatter.step({
  "name": "I receive all customers",
  "keyword": "When "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:28)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive info about all payments",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:33)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive customer name with sum \"800\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:36)"
});
formatter.result({
  "status": "passed"
});
});