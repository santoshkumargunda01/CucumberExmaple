Feature: Login  
  @successful
  Scenario Outline: Login in to application    

    Given I am in login screen
    When I enter "<username>", "<password>"
    Then I click login button
    Then I see home page of the applcation

    Examples:
    | username | password |
    | admin    | admin     |
    
	
