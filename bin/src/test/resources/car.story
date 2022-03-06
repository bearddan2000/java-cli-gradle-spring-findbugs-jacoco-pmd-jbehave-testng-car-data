JBehave Story - An increase test

Meta:

Narrative:
As a user
I want to get price, year, make, and model of a car

Scenario: Get car attributes
When Car created
Then Car price should be 0.0
Then Car year should be 0
Then Car model should be test
Then Car make should be test
