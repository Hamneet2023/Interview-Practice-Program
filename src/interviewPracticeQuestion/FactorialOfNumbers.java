package interviewPracticeQuestion;

public class FactorialOfNumbers {
	int fac = 1;

	public void factorial() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(fac = fac * i);
		}
		System.out.println("the facttorial of number 10 is:" + fac);
	}
}
