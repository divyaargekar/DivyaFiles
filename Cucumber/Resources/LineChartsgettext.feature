@scenario1
Feature: For Ajax loaded clickable Line chart points get the tooltip text and highlighted window text

  Scenario: Get text of Tooltip and Highlighted window Sessions compare text and write results
    Given User is on LineCharts AjaxLoaded data clickable points page
    When User mouse over tooltip element and get text of Tooltip
    When User click on element and session will be highlighted
    Then Compare text between tooltip and highlighted window Session values
