package interviewPracticeQuestion;

import java.util.Scanner;

public class DecendingSorting {
int employeeId[] = new int[4];
Scanner sc  =new Scanner(System.in);

public void enterNumber() {
	System.out.println("Enter a Array elements:");
	for(int i=0;i<employeeId.length;i++) {
        employeeId[i]=sc.nextInt();
	}
}
public void displayID() {
	System.out.println("display a elements of  array:");
	for(int i=0;i<employeeId.length;i++) {
       System.out.println(employeeId[i]);
	}
}

public void sortingDecendingOrder() {
	System.out.println("Sorting of arrays");
	int swap=0;
	for(int i=0;i<employeeId.length;i++) {
		for(int j=i+1;j<employeeId.length;j++) {
			if(employeeId[i]>employeeId[j]) {
				swap=employeeId[i];
				employeeId[i]=employeeId[j];
				employeeId[j]=swap;
			}
		}
	}
}
public void displaysortedArray() {
	System.out.println("final elements of arry");
	for(int i=0;i<employeeId.length;i++) {
		System.out.println(employeeId[i]);
	}
}
}
