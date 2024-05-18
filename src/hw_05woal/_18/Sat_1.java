package hw_05woal._18;

import java.util.Arrays;
import java.util.stream.IntStream;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class Sat_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8,9};
		Sat_1 sol = new Sat_1();
		
		System.out.println(sol.solution(array));
		System.out.println(Arrays.toString(sol.solution(8)));
//		int target = 1;
//		int cnt = countDuplicateNum(array, target);
//		System.out.println("1targerN: " + target + " cnt: " + cnt);
			
		
	}
	
//	public static int countDuplicateNum(int[] array, int n) {
//        List<Integer> arrLst = new ArrayList<>();
//        for(int num : array) {
//        	arrLst.add(num);
//        }
//        
//        return Collections.frequency(arrLst, n);
//        
//    }
//	
//	public static int countDuplicateNum2(int[] array, int n) {
//        return (int) Arrays.stream(array).filter(e -> e == n).count();
//    }

    public int solution(int[] array) {
    	Arrays.sort(array);
    	return array[array.length/2];
    }
    
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n-1)
                         .filter(i -> i % 2 != 0)
                         .sorted()
                         .toArray();
    }

}
