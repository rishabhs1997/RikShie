$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("primaryconsent.feature");
formatter.feature({
  "line": 1,
  "name": "Primary Consent",
  "description": "",
  "id": "primary-consent",
  "keyword": "Feature"
});
formatter.before({
  "duration": 604702,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Primary consent flow",
  "description": "",
  "id": "primary-consent;primary-consent-flow",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "i launch the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "All Of Us login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i enter email and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i click on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i check for successful login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i complete primary consent",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "display dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close app",
  "keyword": "And "
});
formatter.match({
  "location": "LaunchApp.i_launch_the_app()"
});
formatter.result({
  "duration": 46401603427,
  "status": "passed"
});
formatter.match({
  "location": "Login.All_Of_Us_login_page_is_opened()"
});
formatter.result({
  "duration": 43541463,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_enter_email_and_password()"
});
formatter.result({
  "duration": 31696309549,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_click_on_login()"
});
formatter.result({
  "duration": 443423561,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_check_for_successful_login()"
});
formatter.result({
  "duration": 6649590625,
  "status": "passed"
});
formatter.match({
  "location": "PrimaryConsent.i_complete_primary_consent()"
});
formatter.result({
  "duration": 254858614940,
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: UiAUtomator shut down unexpectedly\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RISHABHS\u0027, ip: \u0027169.254.143.16\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:\\Users\\rishabh.sakhare\\Do..., appActivity: com.vibrent.features.core.u..., appPackage: com.acadia.pmistaging, databaseEnabled: false, desired: {app: C:\\Users\\rishabh.sakhare\\Do..., appActivity: com.vibrent.features.core.u..., appPackage: com.acadia.pmistaging, deviceName: ViG-521, platformName: android, platformVersion: 7.0, udid: 02157df29c32133e}, deviceManufacturer: samsung, deviceModel: SM-G920F, deviceName: 02157df29c32133e, deviceScreenSize: 1440x2560, deviceUDID: 02157df29c32133e, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, platform: LINUX, platformName: Android, platformVersion: 7.0, takesScreenshot: true, udid: 02157df29c32133e, warnings: {}, webStorageEnabled: false}\nSession ID: 424243a0-1197-44e1-9455-2a52ccbd3b78\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat io.appium.java_client.DefaultGenericMobileElement.execute(DefaultGenericMobileElement.java:45)\r\n\tat io.appium.java_client.MobileElement.execute(MobileElement.java:1)\r\n\tat io.appium.java_client.android.AndroidElement.execute(AndroidElement.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat stepDefinations.PrimaryConsent.i_complete_primary_consent(PrimaryConsent.java:279)\r\n\tat ✽.And i complete primary consent(primaryconsent.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PrimaryConsent.display_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.close_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 421609,
  "status": "passed"
});
});