package interviewPracticeQuestion;

import java.util.Scanner;

public class findSmallestNumber {
	int[] rollNumber = new int[5];
	public void enterNumber() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<rollNumber.length;i++) {
			rollNumber[i]=sc.nextInt();
		}		
	}
	public void displayNumber() {
		for(int i=0;i<rollNumber.length;i++) {
		System.out.println(rollNumber[i]);
		}
	}
	public void findMinimum() {
		int min = rollNumber[0];
	for(int i=0;i<rollNumber.length;i++) {
		if(rollNumber[i]<min) {
			min=rollNumber[i];
		}
	}
	System.out.println("the minimum number is "+min);
	}

}
