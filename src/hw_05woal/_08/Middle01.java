package hw_05woal._08;

import java.util.Scanner;

public class Middle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		helloBit();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력:");
		int num = sc.nextInt();
		reveRse(num);
		
	}
	
	public static void helloBit() {
		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
		int leng = sb.capacity()- sb.length();

		
		for(int i = 0; i < leng; i++) {
			if(i % 3 == 0) {
				sb.append('b');
			}
			else if(i % 3 == 1) {
				sb.append('i');
			}
			else {
				sb.append('t');
			}
		}
		System.out.println(sb);
	}
	
	public static void reveRse(int num) {
		StringBuffer sb = new StringBuffer();
		sb.append("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.toString().charAt(num));
		
	}

}
