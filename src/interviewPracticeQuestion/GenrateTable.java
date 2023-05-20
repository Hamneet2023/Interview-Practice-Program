package interviewPracticeQuestion;

import java.util.Scanner;

public class GenrateTable {

	public void genrateTable() {
		int sum=0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int table=sc.nextInt();
		for(int i= 1;i<=10;i++) {
			int result=i*table;
			System.out.println(table+"*"+i+"="+result);
			sum=sum+result;
		}
		System.out.println("the sum is "+sum);
	}
}
