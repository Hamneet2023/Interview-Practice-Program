package interviewPracticeQuestion;

// Write a Program to Check Whether a Character is Alphabet or Not
public class IscharacterAlaphabate {
	public void isAlphabate() {
		char ch = 'f';
		//   char ch = sc.next().charAt(0);
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("this one is alphabate");
		} else {
			System.out.println("this one is not a alphabate:");
		}
	}
}
