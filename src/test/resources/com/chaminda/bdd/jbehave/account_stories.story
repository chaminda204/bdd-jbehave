Scenario: Depositing money into bank account ffdgdg
  
Given the Accounts initial balance is $<initial>
When I deposit $<amount>
Then the balance should be $<endBalance>
    
Examples:
| initial | amount  | endBalance|
| 0		  | 100     | 100 		|
| 100	  | 100     | 200 		|
| -50	  | 100     | 50  		|
| -50	  | 50      | 0   		|

   
