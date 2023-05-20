package interviewPracticeQuestion;

import java.util.Scanner;

public class ArmStrongNumber {

	public void printArmStrongNumber() {
		Scanner  sc = new Scanner(System.in);
		int enteredNumber = sc.nextInt();
		for(int i=1;i<=enteredNumber;i++) {
			int sum=0;
			int x=enteredNumber;
			while(x!=0) {
				int r=x%10;
				sum=sum*r*r*r;
				x=x/10;	
			}
			if(sum==enteredNumber) {
			System.out.println("number is Armstrong");
			}
		}	
		
	}
}
