package interviewPracticeQuestion;

import java.util.Scanner;

public class StringContainSubstring {
	public void checkSubString() {
	 Scanner sc = new Scanner(System.in);

     System.out.print("Enter the main string: ");
     String mainString = sc.nextLine();

     System.out.print("Enter the substring to check: ");
     String substring = sc.nextLine();

     if (mainString.contains(substring)) {
         System.out.println("mainString contains subString of another string:"+mainString +"subString is"+substring);
     } else {
         System.out.println("mainString doesnot contains subString of another string:"+mainString +"subString is"+substring);
     }
 }

}
