package hw_05woal._16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Basic16 {
	public static void main(String[] args) {
		
		int[] numArr = {1,2,3,4,5,6,7,8};
		
		IntStream streamArr = Arrays.stream(numArr);
		int[] evenArr = streamArr.filter(arr -> arr % 2== 0).toArray();
		System.out.println(Arrays.toString(numArr));
		System.out.println(Arrays.toString(evenArr));
	}
	
	public static void printEvenNum(int[] numArr, PrintNumber printNumber) {
		printNumber.printEnvenNum(numArr);
	}
	
}
//1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요.
//PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.
