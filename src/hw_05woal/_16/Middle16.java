package hw_05woal._16;

import java.util.Scanner;

public class Middle16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열입력1.");
		StringBuilder sb1 = new StringBuilder(sc.nextLine());
		
		System.out.println("문자열입력2.");
		StringBuilder sb2 = new StringBuilder(sc.nextLine());
		
		
		System.out.println(
				combineStrBuilder(sb1, sb2, (sb1Param, sb2Param) -> {	
					return sb1Param.append(sb2Param).reverse();
					})
				);
		
		//************************************************************************************************************************
		System.out.println("입력할 수의 개수 입력");
		int leng = sc.nextInt();
		sc.nextLine();

        int[] arr = new int[leng];
        for(int i = 0; i < leng; i++) {
        	System.out.println("숫자 입력");
			arr[i] = sc.nextInt();
		}
        
        System.out.println(
        		"Max; " + arrUtils(arr,(mmmArr) -> IntArrUtils.getMax(arr))
        		);
        System.out.println(
        		arrUtils(arr,IntArrUtils::getMax)
        		);
        
        System.out.println(
                "Min; " + arrUtils(arr,(mmmArr) -> IntArrUtils.getMin(arr))
                );
        System.out.println(
                arrUtils(arr,IntArrUtils::getMin)
                );
        
        System.out.println(
                "Mid; " + arrUtils(arr,(mmmArr) -> IntArrUtils.getMid(arr))
                );
        System.out.println(
                arrUtils(arr,IntArrUtils::getMid)
                );
		
        sc.close();
	}
	
	
	
	public static StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2, StringBuilderUtils stringBuilderUtils) {
		return stringBuilderUtils.combineStrBuilder(sb1,sb2);
	}
	
	public static StringBuilder appendSb(StringBuilder sb1, StringBuilder sb2) {
		return sb1.append(sb2);
	}
	public static StringBuilder reverseSb(StringBuilder sb) {
		return sb.reverse();
	}
	public static StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) {
		StringBuilder sb3 = appendSb(sb1, sb2);
		return sb3.reverse();
	}
	
	
	//************************************************************************************************************************
	
	public static int arrUtils(int[] arr, MaxMinMid maxMinMid) {
		return maxMinMid.maxOrMinOrMid(arr);
	}
	
}
/*
 *	 1. 두 개의 StringBuilder 값을 매개변수로 받아
 *	 두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
 *	 StringBuilderUtils 함수형 인터페이스 선언,
 * 	 StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 추상메소드 선언
 *   
 *   2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 
 *   역순으로 변경하는 메소드 reverseSb를 각각 선언하고 StringBuilder의 메소드를 참조하여 combineStrBuilder 각각 구현하세요.
 *   
 *   3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 
 *   static 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 구현하고 
 *   maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 
 *   람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
*/