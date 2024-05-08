package hw_05woal._01;

import java.util.Scanner;

public class StrChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse r = new Reverse();
		System.out.println(r.reverseString("abcdef"));
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
//		DeleteStr d = new DeleteStr();
//		System.out.println(d.deleteString(str));
		
		Drainage dr = new Drainage();
		System.out.println(dr.Drain(str));
		
		sc.close();
		
	}

}
