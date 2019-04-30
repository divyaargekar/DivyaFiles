$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Resources/LineChartsgettext.feature");
formatter.feature({
  "name": "For Ajax loaded clickable Line chart points get the tooltip text and highlighted window text",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@scenario1"
    }
  ]
});
formatter.scenario({
  "name": "Get text of Tooltip and Highlighted window Sessions compare text and write results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "name": "User is on LineCharts AjaxLoaded data clickable points page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User mouse over tooltip element and get text of Tooltip",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on element and session will be highlighted",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Compare text between tooltip and highlighted window Session values",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});