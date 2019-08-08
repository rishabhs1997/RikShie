$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 783692,
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
  "duration": 55244927969,
  "status": "passed"
});
formatter.match({
  "location": "Login.All_Of_Us_login_page_is_opened()"
});
formatter.result({
  "duration": 52495004,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Check Login Page Process",
  "description": "",
  "id": "login-page;check-login-page-process",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Correct"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "i enter email and password",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "i click on login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "i check for successful login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close app",
  "keyword": "And "
});
formatter.match({
  "location": "Login.i_enter_email_and_password()"
});
formatter.result({
  "duration": 33422073001,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_click_on_login()"
});
formatter.result({
  "duration": 391068136,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_check_for_successful_login()"
});
formatter.result({
  "duration": 9243356481,
  "status": "passed"
});
formatter.match({
  "location": "Login.close_app()"
});
formatter.result({
  "duration": 2516760074,
  "status": "passed"
});
formatter.after({
  "duration": 497145,
  "status": "passed"
});
});