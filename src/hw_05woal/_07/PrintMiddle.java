package hw_05woal._07;

public class PrintMiddle {
	public PrintMiddle() {
		
	}

	public static void printMiddle(String str) {
		if(str.length() % 2 == 0) {
			System.out.print(str.charAt(str.length() / 2));
			System.out.println(str.charAt(str.length() / 2 + 1));
		}
		else {
			System.out.println(str.charAt(str.length() / 2));
		}
	}
	
	
}
