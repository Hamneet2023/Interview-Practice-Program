package interviewPracticeQuestion;

public class ReverseString {
	String str ="Hello";
	String reverse="";
	public void StringReverse() {
		for(int i=str.length()-1;i>=0;i--) {
		reverse+=str.charAt(i);
		}
		System.out.println("String after reversing"+"  "+reverse);
		if(str.equals(reverse)) {
			System.out.println("the string is palindrom:");
		}else {
			System.out.println("The string is not a palindrom");
		}
	}

}
