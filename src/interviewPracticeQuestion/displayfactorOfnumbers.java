package interviewPracticeQuestion;

import java.util.Scanner;

//Write a Program to Display Factors of a Number
public class displayfactorOfnumbers {
	public void displayfactor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number:");
		int number=sc.nextInt();
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				System.out.println("the factor of"+number+ "number is:"+i);
			}
		}
	}
}
