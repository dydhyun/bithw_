package hw_05woal._01;

public class Drainage {
	
	String Drain(String str) {
		
		String newStr = "";
		newStr += str.charAt(0);
		for(int i = 1; i < str.length(); i++) {
			if( i % 3 == 0 && i % 5 == 0) {
				newStr += 35;
			}
			else if(i % 3 == 0) {
				newStr += 3;
			}
			else if(i % 5 == 0) {
				newStr += 5;
			}
			else {
				newStr += str.charAt(i);
			}
			
		}
		
		return newStr;
	}
	
}
