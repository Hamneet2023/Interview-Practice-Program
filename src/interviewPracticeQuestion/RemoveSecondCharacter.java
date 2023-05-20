package interviewPracticeQuestion;

import java.util.Arrays;
import java.util.Scanner;

//13: Write a program to remove second character of every word in a sentence.
public class RemoveSecondCharacter {
	public void removeSecondCharacter() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String enteredSentence = sc.nextLine();
        String[] words = enteredSentence.split(" ");
       System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>1){
            	//words[i]=words[i].substring(0, 1)+words[i].substring(2, words[i].length());
            	words[i]=words[i].substring(0, 1)+words[i].substring(2);
            }
	}
        System.out.println(String.join("", words));
}
}