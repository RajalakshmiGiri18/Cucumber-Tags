		Feature: Checking smoke Regression End2End Testing
		
		Scenario: Tags Demo with Different Testing
		
		@smoke
		Scenario: Add product to tag
		Given
		When
		And
		
		
		@smoke
		Scenario:Increase product quantity from bag
		Given
		When
		And
		
		
		
		@smoke @regression
		Scenario: succesful login
		Given
		When
		And
		
		@smoke @regression
		Scenario: Remove a product from bag
		Given
		When
		And
		
	@regression
	Scenario: Unsuccessful login
	Given
	When
	And
	
	@regression
	Scenario: Remove all products from the bag
	Given
	When
	And
	
	@smoke @End2End
	Scenario: Buy a product with cash payment
	Given
	When
	And
	
	@smoke @End2End
	Scenario: Buy a product with cc payment
	Given
	When
	And
	
	 @End2End
  Scenario: CC DD Card BankPayment Cash Paypal
    Given
    When
    And
	
	
	
	
		