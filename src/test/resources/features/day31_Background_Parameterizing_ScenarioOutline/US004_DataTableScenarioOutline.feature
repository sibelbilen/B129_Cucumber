Feature: Data_tables

  Scenario Outline: TC01_Form_Doldurma

    Given user is on "https://editor.datatables.net" page
    And user clicks on the New button
    And user enters the first name "<firstname>"
    And user enters the last name "<lastname>"
    And user enters the position "<position>"
    And user enters the office "<office>"
    And user enters the extension "<extension>"
    And user enters the start date "<start_date>"
    And user enters the salary "<salary>"
    And click on create button
    And search for the first name "<firstname>"
    Then verify the name field contains the first name "<firstname>"
    Then close the application
    Examples:
      | firstname | lastname | position | office | extension | start_date | salary |
