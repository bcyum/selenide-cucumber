Feature: Button Test

  Scenario: Click the Click Me button
    Given I open the demoqa elements page
    When I click on the Buttons section
    When I click the Click Me button
    Then I should see the message "You have done a dynamic click"
