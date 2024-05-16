package hw_05woal._16;

import java.util.Arrays;

public class IntArrUtils {
 	
	public static int getMax(int[] arr) {
	  int max = arr[0];
	  
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getMid(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
    
       
}
/*
*   3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 
*   static 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 구현하고 
*   maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 
*   람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
*/