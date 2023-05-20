package interviewPracticeQuestion;

import java.util.Scanner;

public class swap_two_numbers {
public void swaptwoNumbers() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  the value of varibe A and B:");
	int a = sc.nextInt();
	int b= sc.nextInt();
	System.out.println("the value of variable A and b after the sweeping:");
	 a = a+b;//10+20=30
	 b= a-b; //30-20=10
	 a= a-b; //30=10 =20
	 System.out.println("the value of  a and b is:"+ a+ "  "  +b);
	
}
}
