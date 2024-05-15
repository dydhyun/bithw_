package hw_05woal._14;

import java.util.Arrays;
import java.util.Scanner;

public class BasicPractArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArr = new int[5];

        int[] sA = saveArr(intArr, sc);
        prtArr(sA);
        System.out.println(eOArr(sA,sc));
        System.out.println(Arrays.stream(sA).max());
        sc.close();
    }
    public static int[] saveArr(int[] intArr, Scanner sc){
        System.out.println(intArr.length + "개 입력.");
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = sc.nextInt();
        }
        return intArr;
    }
    public static void prtArr(int[] intArr){
        for (int i = 0; i < intArr.length; i++){
            System.out.println(intArr[i]);
        }
    }
    public static int eOArr(int[] intArr, Scanner sc){
        System.out.println("even : True, odd: False");
        boolean EO = sc.nextBoolean();
        int result = 0;
        if(EO){
            System.out.println("짝수선택");
            for(int i = 0; i < intArr.length; i++){
                if(intArr[i] % 2 == 0) {
                    result += intArr[i];
                }
            }
        }
        else if(!EO) {
            System.out.println("홀수선택");
            for(int i = 0; i < intArr.length; i++){
                if(intArr[i] % 2 != 0) {
                    result += intArr[i];
                }
            }

        }
        return result;
    }


}
