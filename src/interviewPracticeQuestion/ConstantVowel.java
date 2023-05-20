package interviewPracticeQuestion;

import java.util.Scanner;

//6: Write a program to Check Whether an Alphabet is Vowel or Consonant.
public class ConstantVowel {
	public void constanVowel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enteres alphabate:");
		char enterAlbhabate = sc.next().charAt(0);
		if (enterAlbhabate == 'a' || enterAlbhabate == 'i' || enterAlbhabate == 'e' || enterAlbhabate == 'o'
				|| enterAlbhabate == 'u'||enterAlbhabate == 'A'||enterAlbhabate == 'I'||enterAlbhabate == 'E'||enterAlbhabate == 'O'||enterAlbhabate == 'U') {
			System.out.println("character is alphabate ");
		} else {
			System.out.println("this one is not a albhabte");
		}
	}
}
