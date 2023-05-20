package interviewPracticeQuestion;

public class SortAraryAsendingOrder {
	int[] rollNumber = {12,3,5,7,10};
	public void sortArrayAsendingOrder() {
		int swap=0;
		
		for(int i=0;i<rollNumber.length;i++) {
			for(int j=i+1;j<rollNumber.length;j++) {
			     if(rollNumber[i]>rollNumber[j]) {
			    	 swap=rollNumber[i];
			    	 rollNumber[i]=rollNumber[j];
			    	 rollNumber[j]=swap;
			     }
			}
			//System.out.println(rollNumber[i]);
		}
	
	}
	public void displayElement() {
		for(int i=0;i<rollNumber.length;i++) {
			System.out.println(rollNumber[i]);
			}
		}


}

