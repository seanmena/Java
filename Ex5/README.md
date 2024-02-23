## Assignment
A checksum is a value that is computed based upon some information.  It is functional in the sense that given the same information, the exact same value will be computed.   Checksums are often used when information is being transmitted over a network.  This lets the receiving end know if the information was transmitted accurately.

All published books have a unique 10 and 13 digit ISBN number.  This stands for International Standard Book Number.  Your textbook in this class has an ISBN-10 number.  The first 9 digits (which may include leading zeros) are the information part of the ISBN-10 number.  The 10th digit is a checksum which is calculated from the other 9 digits using the following formula where d1 is the first digit beginning on the left, d2 is the second digit, etc.:

( (1* d1) + (2 * d2) + (3 * d3) + (4 * d4) + (5 * d5) + (6 * d6) + (7 * d7) + (8 * d8) + (9 * d9) ) % 11

Because the large sum then uses modulus 11 arithmetic, the possible values for the checksum are the numbers 0 through 10.  According to the ISBN-10 convention, the checksum can only be a single character (digit) so if the checksum is 10 the last character is denoted as X (Roman numeral for 10) .

Write a program that loops, prompting the user to enter the first 9 digits into an input dialog box.  You must parse the input value as a single integer.  Compute the checksum digit and output the complete 10 digit ISBN number using a Confirm Dialog asking if the user wants to enter another 9 digit number.  If the user selects the YES button, then loop.  If NO is selected, the program will end.

An example of this program in action (without dialog boxes) is:

Enter the first 9 digits of an ISBN number:  013601267 <enter>

The ISBN-10 number is:  0136012671

Do you want to enter another? <yes>

Enter the first 9 digits of an ISBN number:  013031997 <enter>

The ISBN-10 number is:  013031997X

Do you want to enter another? <no>

Extracting the Digits from the Integer
The algorithm to compute the checksum is relatively simple, so the interesting part of this program is figuring out how to extract each of the 9 digits from the integer. Hint:  Section 3.13 (9th Edition) Case Study: Lottery shows you how to extract the digits from a 2-digit number. 

Remember, I am forcing you to turn the String from the dialog box into an integer.  I will not accept a solution that doesn't do this.  When the ISBN number has leading zeros, it makes the problem more complex because you must go from a String to an int and back to a String again. 