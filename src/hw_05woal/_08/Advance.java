package hw_05woal._08;

import java.util.Scanner;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
		 *  연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
		 *  출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
		 *  ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String us = new String();
		StringBuilder sb = new StringBuilder();
		
		System.out.print("문자열 입력: ");
		us = sc.nextLine();
		
		sb.append(us);
		System.out.println(sb);
		
		boolean c = false;
		for(int i = 0; i < us.length(); i++) {
			for(int j = 0; j < us.length(); j++) {
			if(sb.toString().charAt(i) != us.charAt(j)) {
				c = true;
			}
			if( c) { 
				sb.append(us.charAt(i));
			}
			}
		}
		System.out.println(sb);
		
	}

}
