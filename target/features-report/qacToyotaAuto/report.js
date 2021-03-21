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
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:25)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "File-03-Task02-03",
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
      "name": "@testCreateNewPayment"
    }
  ]
});
formatter.step({
  "name": "I open browser as \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:35)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create new payment",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:51)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button last page",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:93)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify record",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:61)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify record with DB",
  "keyword": "And "
});
formatter.match({
  "location": "com.qaconsultants.TestSteps.\u003cinit\u003e(TestSteps.java:64)"
});
formatter.result({
  "status": "passed"
});
});