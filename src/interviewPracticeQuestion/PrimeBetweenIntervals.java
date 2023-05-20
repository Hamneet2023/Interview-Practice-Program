package interviewPracticeQuestion;
//27: Write a Program to Display Prime Numbers Between Two Intervals

import java.util.Scanner;

public class PrimeBetweenIntervals {
	public void primebetweenIntervals() {
		
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter a first number:");
		int firstNumber=sc.nextInt();
		System.out.println("Enter a second number:");
		int lastNumber = sc.nextInt();
		int i;int x;
		for(x=firstNumber+1;x<=lastNumber-1;x++) {
			for(i=2;i<x;i++) {
				if(x%2==0) {
					break;
				}	
			}
			if(i==x) {
				System.out.println("number is prime"+x);
			}
		}
	}
}
