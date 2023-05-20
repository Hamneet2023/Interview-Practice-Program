package interviewPracticeQuestion;

import java.util.Scanner;

public class fabbonacciseries {
	public void prinFabonnaciDeries() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int a =-1;
		int b = 1;
		int c;
		for(int i= 1;i<=number;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
// a + b = c
// -1+1=0;
// 1+0=1;
// 0+1=1
// 1+1=2;
// 1+2=3;
// 2+3=5;
// 3+5=8;
// 5+8=13;