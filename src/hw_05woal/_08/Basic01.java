package hw_05woal._08;

import java.util.Scanner;

public class Basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("str1 입력: ");
		String str1 = sc.nextLine();
		System.out.print("str2 입력: ");
		String str2 = sc.nextLine();
		System.out.print("str3 입력: ");
		String str3 = sc.nextLine();
		
		
		conCat(str1, str2, str3);
		
		hellO();
		
	}
	
	
	
	public static void conCat(String str1, String str2, String str3) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.append(str1).append(str2).append(str3));
	}
	
	
	public static void hellO() {
		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
//		sb.setLength(30);
		int leng = sb.capacity()- sb.length();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		
		for(int i = 0; i < leng; i++) {
			sb.append('a');
		}
		System.out.println(sb);
//		System.out.println(sb.toString().replaceAll(" ", "a"));
	}
	

	
	
}
