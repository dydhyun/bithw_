package hw_05woal._01;

public class Reverse {
	
	String reverseString(String str) {
		char[] data = new char[str.length()];
		for( int i = 0; i < str.length(); i++) {
			for(int j = str.length() - 1 - i; j >= 0; j--) {
				data[j] = str.charAt(i);
			}
		}
		String rStr = new String(data);

		return rStr;
	}
	
}
