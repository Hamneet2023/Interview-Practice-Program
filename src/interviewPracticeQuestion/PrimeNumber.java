package interviewPracticeQuestion;

import java.util.Scanner;

public class PrimeNumber {
Scanner sc = new Scanner(System.in);
public void toCheckPrime() {
	System.out.println("enter a number:");
	int number=sc.nextInt();
	int i;
	for(i=2;i<=number-1;i++) {
		if(number%i==0) {
			break;
		}
	}
	if(number==i) {
		System.out.println("number is prime");
	}else {
		System.out.println("number is not a prime:");
	}
}
}
