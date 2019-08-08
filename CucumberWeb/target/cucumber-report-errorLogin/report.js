$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Check error for various usernames",
  "description": "",
  "id": "login-page;check-error-for-various-usernames",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Error"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "i enter for \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "username is wrong",
  "keyword": "But "
});
formatter.step({
  "line": 20,
  "name": "display error messages for \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "login-page;check-error-for-various-usernames;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 24,
      "id": "login-page;check-error-for-various-usernames;;1"
    },
    {
      "cells": [
        "vignet",
        ""
      ],
      "line": 25,
      "id": "login-page;check-error-for-various-usernames;;2"
    },
    {
      "cells": [
        "",
        ""
      ],
      "line": 26,
      "id": "login-page;check-error-for-various-usernames;;3"
    },
    {
      "cells": [
        "vig24568@gmail",
        "x##"
      ],
      "line": 27,
      "id": "login-page;check-error-for-various-usernames;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 583356,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Open All of us Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i launch the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "All Of Us login page is opened",
  "keyword": "And "
});
formatter.match({
  "location": "LaunchApp.i_launch_the_app()"
});
formatter.result({
  "duration": 55871166727,
  "status": "passed"
});
formatter.match({
  "location": "Login.All_Of_Us_login_page_is_opened()"
});
formatter.result({
  "duration": 53080823,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Check error for various usernames",
  "description": "",
  "id": "login-page;check-error-for-various-usernames;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Error"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "i enter for \"vignet\" and \"\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "username is wrong",
  "keyword": "But "
});
formatter.step({
  "line": 20,
  "name": "display error messages for \"vignet\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "vignet",
      "offset": 13
    },
    {
      "val": "",
      "offset": 26
    }
  ],
  "location": "Login.i_enter_for_and(String,String)"
});
formatter.result({
  "duration": 25859431063,
  "status": "passed"
});
formatter.match({
  "location": "Login.username_is_wrong()"
});
formatter.result({
  "duration": 1149970771,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vignet",
      "offset": 28
    }
  ],
  "location": "Login.display_error_messages_for(String)"
});
formatter.result({
  "duration": 225207192,
  "status": "passed"
});
formatter.after({
  "duration": 434335,
  "status": "passed"
});
formatter.before({
  "duration": 458966,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Open All of us Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i launch the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "All Of Us login page is opened",
  "keyword": "And "
});
formatter.match({
  "location": "LaunchApp.i_launch_the_app()"
});
formatter.result({
  "duration": 1494363498,
  "status": "passed"
});
formatter.match({
  "location": "Login.All_Of_Us_login_page_is_opened()"
});
formatter.result({
  "duration": 11668749,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Check error for various usernames",
  "description": "",
  "id": "login-page;check-error-for-various-usernames;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Error"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "i enter for \"\" and \"\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "username is wrong",
  "keyword": "But "
});
formatter.step({
  "line": 20,
  "name": "display error messages for \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 13
    },
    {
      "val": "",
      "offset": 20
    }
  ],
  "location": "Login.i_enter_for_and(String,String)"
});
formatter.result({
  "duration": 12202814720,
  "status": "passed"
});
formatter.match({
  "location": "Login.username_is_wrong()"
});
formatter.result({
  "duration": 1238063999,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 28
    }
  ],
  "location": "Login.display_error_messages_for(String)"
});
formatter.result({
  "duration": 193759781,
  "status": "passed"
});
formatter.after({
  "duration": 214705,
  "status": "passed"
});
formatter.before({
  "duration": 256168,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Open All of us Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i launch the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "All Of Us login page is opened",
  "keyword": "And "
});
formatter.match({
  "location": "LaunchApp.i_launch_the_app()"
});
formatter.result({
  "duration": 944442073,
  "status": "passed"
});
formatter.match({
  "location": "Login.All_Of_Us_login_page_is_opened()"
});
formatter.result({
  "duration": 9694948,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Check error for various usernames",
  "description": "",
  "id": "login-page;check-error-for-various-usernames;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Error"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "i enter for \"vig24568@gmail\" and \"x##\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "username is wrong",
  "keyword": "But "
});
formatter.step({
  "line": 20,
  "name": "display error messages for \"vig24568@gmail\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "vig24568@gmail",
      "offset": 13
    },
    {
      "val": "x##",
      "offset": 34
    }
  ],
  "location": "Login.i_enter_for_and(String,String)"
});
formatter.result({
  "duration": 12552354604,
  "status": "passed"
});
formatter.match({
  "location": "Login.username_is_wrong()"
});
formatter.result({
  "duration": 1099637589,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vig24568@gmail",
      "offset": 28
    }
  ],
  "location": "Login.display_error_messages_for(String)"
});
formatter.result({
  "duration": 92752272,
  "status": "passed"
});
formatter.after({
  "duration": 215936,
  "status": "passed"
});
});