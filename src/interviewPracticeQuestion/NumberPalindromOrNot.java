package interviewPracticeQuestion;

import java.util.Scanner;

public class NumberPalindromOrNot {
public void palindromNumber() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number is palindrom or not");
	 int enteredNumber = sc.nextInt();
     int reversedNumber = 0;

     for (int i = enteredNumber; i > 0; i /= 10) {
         int digit = i % 10;
         reversedNumber = reversedNumber * 10 + digit;
     }

     System.out.println("Number after reversing: " + reversedNumber);

     if (enteredNumber == reversedNumber) {
         System.out.println("The number is a palindrome.");
     } else {
         System.out.println("The number is not a palindrome.");
     }
 }
}

