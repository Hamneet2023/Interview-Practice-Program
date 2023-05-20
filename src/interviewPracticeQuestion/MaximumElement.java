package interviewPracticeQuestion;

import java.util.Scanner;

public class MaximumElement {
	int[] enteredNumber = new int[5];

	public void enterElement() {
		System.out.println("Enter a Elements :");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < enteredNumber.length; i++) {
			enteredNumber[i] = sc.nextInt();
		}
	}

	public void displayElements() {
		for (int i = 0; i < enteredNumber.length; i++) {
			System.out.println(enteredNumber[i]);
		}
	}

	public void maxElement() {
		int max = enteredNumber[0];
		for (int i = 0; i < enteredNumber.length; i++) {
			if (enteredNumber[i] > max) {
				max = enteredNumber[i];
			}
		}
		System.out.println("max element  is :"+max);
	}

}
