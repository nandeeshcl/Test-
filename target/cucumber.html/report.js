$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/Feature_FilesR/Reqres.feature");
formatter.feature({
  "name": "Cutomer_Feature",
  "description": "  This feature is used to test dummy API",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Reqres_API"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Create New User",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateUser"
    }
  ]
});
formatter.step({
  "name": "I have JSON",
  "keyword": "When "
});
formatter.step({
  "name": "I send Post request",
  "keyword": "And "
});
formatter.step({
  "name": "I verify status code is \u003cstatusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "response consists name \"\u003cname\u003e\" and job \"\u003cjob\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "statusCode",
        "name",
        "job"
      ]
    },
    {
      "cells": [
        "201",
        "appu",
        "QA"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create New User",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reqres_API"
    },
    {
      "name": "@CreateUser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have JSON",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUser.i_have_JSON()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send Post request",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUser.i_send_Post_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify status code is 201",
  "keyword": "Then "
});
formatter.match({
  "location": "ListUser.i_verify_status_code_is(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response consists name \"appu\" and job \"QA\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUser.response_consists_name_and_job(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});