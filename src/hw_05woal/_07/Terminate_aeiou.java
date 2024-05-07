package hw_05woal._07;

public class Terminate_aeiou {
	public Terminate_aeiou() {
		
	}
	
	public Terminate_aeiou(String str) {
		String newStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' 
					|| str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' ||
					str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				continue;
			}
			else {
				newStr += str.charAt(i);
			}
		}
		System.out.println(newStr);
		
	}
	
	
}
