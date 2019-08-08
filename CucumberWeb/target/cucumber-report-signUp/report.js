$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/signup.feature");
formatter.feature({
  "line": 1,
  "name": "Signup Flow",
  "description": "",
  "id": "signup-flow",
  "keyword": "Feature"
});
formatter.before({
  "duration": 591977,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Register page",
  "description": "",
  "id": "signup-flow;register-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "launch the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "All Of Us login page is opened",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "navigate to signup page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "enter email address",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on continue",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchApp.launch_the_app()"
});
formatter.result({
  "duration": 65155675830,
  "status": "passed"
});
formatter.match({
  "location": "Login.All_Of_Us_login_page_is_opened()"
});
formatter.result({
  "duration": 136922248,
  "status": "passed"
});
formatter.match({
  "location": "SignUp.navigate_to_signup_page()"
});
formatter.result({
  "duration": 1947447112,
  "status": "passed"
});
formatter.match({
  "location": "SignUp.enter_email_address()"
});
formatter.result({
  "duration": 12947294397,
  "status": "passed"
});
formatter.match({
  "location": "SignUp.enter_password()"
});
formatter.result({
  "duration": 10974468658,
  "status": "passed"
});
formatter.match({
  "location": "SignUp.click_on_continue()"
});
formatter.result({
  "duration": 5154273888,
  "status": "passed"
});
formatter.after({
  "duration": 517261,
  "status": "passed"
});
formatter.before({
  "duration": 495092,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Security Page",
  "description": "",
  "id": "signup-flow;security-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "all fields are entered",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click on Sign Up",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "check for successful signup",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close app",
  "keyword": "And "
});
formatter.match({
  "location": "SignUp.all_fields_are_entered()"
});
formatter.result({
  "duration": 32646948489,
  "status": "passed"
});
formatter.match({
  "location": "SignUp.click_on_Sign_Up()"
});
formatter.result({
  "duration": 2560394727,
  "status": "passed"
});
formatter.match({
  "location": "SignUp.check_for_successful_signup()"
});
formatter.result({
  "duration": 24480183981,
  "status": "passed"
});
formatter.match({
  "location": "Login.close_app()"
});
formatter.result({
  "duration": 2399354573,
  "status": "passed"
});
formatter.after({
  "duration": 529166,
  "status": "passed"
});
});