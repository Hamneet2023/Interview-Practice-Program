package interviewPracticeQuestion;

public class ReplaceArrayWithAlphabates {
int[] arrayList = {4,5,7,9,10,0,0};
char alphabet;
public void  replaceArraywithAlbhabates() {

	for(int i=0;i<arrayList.length;i++) {
		 if (arrayList[i] >= 1 && arrayList[i] <= 26) {
			 int adjustedValue = arrayList[i];
			 int asciiValue = 'a' + adjustedValue; 
			 alphabet = (char) asciiValue; // Cast the ASCII value to a char type and assign it to 'alphabet'
			 System.out.println(alphabet);
			 //97+4=101 //97+5=102 //97+7=104 //97+9=106
		 }
		 else {
			 System.out.println(arrayList[i]);
		 }
		
	}
	//System.out.println(arrayList);
}
}

//97 + 4 = 101: The decimal value 101 corresponds to the Unicode character 'e'.
//97 + 5 = 102: The decimal value 102 corresponds to the Unicode character 'f'.
//97 + 7 = 104: The decimal value 104 corresponds to the Unicode character 'h'.
//97 + 9 = 106: The decimal value 106 corresponds to the Unicode character 'j'.