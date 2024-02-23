## Assignment
Suppose you save $100 each month into a savings account with an annual interest rate of 5%.  The monthly interest rate is:

0.05/12  =  0.00417  Divide the annual rate by 12 to get the monthly interest rate.

After the first month, the value in the account is amount saved each month times 1 plus the monthly interest rate:

100 * (1 + 0.00417) = 100.417

After the second month, the value in the account is the amount saved each month plus the balance from the first month times 1 plus the monthly interest rate:

(100 + 100.417) * (1 + 0.00417) = 201.252

After the third month, the value in the account is the amount saved each month plus the balance from the second month times 1 plus the monthly interest rate:

(100 + 201.252) * (1 + 0.00417) = 302.507

And so on.

Write a program that prompts the user to enter the monthly savings amount using an input dialog box.  Use a second dialog box to have the user input the annual percentage rate the account accrues in interest (Use a double for this value so the user can enter 5 to represent 5% or 3.25 to represent 3.25%.  Remember that you must divide this number by 100 to change it into a percentage).  Display the value of the account after the 6th month using an output dialog box.   Make all output aesthetically pleasing.