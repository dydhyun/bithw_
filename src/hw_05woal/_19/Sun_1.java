package hw_05woal._19;

import java.io.StringBufferInputStream;
import java.util.*;
import java.util.stream.IntStream;

public class Sun_1 {
    public static void main(String[] args) {
        Sun_1 solu = new Sun_1();
        String rsp = "222rsp가위바위보050rsp255";
        System.out.println(solu.solution(rsp));

        String[] strList = {"abc", "abcde", "a123456789bc"};
        System.out.println(Arrays.toString(solu.solution(strList)));

        int[] num_list = {123,344,1,2,3,4,5,7,9};
        System.out.println(Arrays.toString(solu.solution(num_list)));

        System.out.println(solu.solution2(rsp));

        int[] triSides = {3, 9, 5};
        System.out.println(solu.solutionTriangle(triSides));

        String cipher = "dfjardstddetckdaccccdegk";
        System.out.println(solu.solutionCipher(cipher, 4));

        String my_String = "a1B2c3D4e5F6g7";
        System.out.println(solu.solutionConvert(my_String));

        System.out.println(solu.oddEvenSum(num_list));

        int[] findmi = {4,5,6,7,88,8,9,0};
        System.out.println(Arrays.toString(solu.solutionArrayMaxIndex(findmi)));

    }


    public String solution(String rsp) {
        // 2 -> 0, 0 -> 5, 5 ->2
        // enhence for , strbuilder
//        StringBuilder sb = new StringBuilder();
//        for (char c : rsp.toCharArray()) {
//            switch (c) {
//                case '2':
//                    sb.append('0');
//                    break;
//                case '0':
//                    sb.append('5');
//                    break;
//                case '5':
//                    sb.append('2');
//                    break;
////                default: sb.append('-');
//            }
//        }
//        return sb.toString();
        return rsp.replaceAll("2", "가위").replaceAll("5", "보").replaceAll("0", "바위")
                .replaceAll("가위", "0").replaceAll("바위", "5").replaceAll("보", "2");
    }

    public int[] solution(String[] strList) {
        int[] intArr = new int[strList.length];
//        for(int i = 0; i < strList.length; i++){
//            intArr[i] += strList[i].length();
//        }

//        int index = 0;
//        for(String str : strList){
//            intArr[index++] = str.length();
//        }
//        return intArr;
//        return Arrays.stream(strList).mapToInt(String::length).toArray();
        return Arrays.stream(strList).mapToInt(s -> s.length()).toArray();
    }

    public int[] solution(int[] num_list) {
//        int oddNum = 0, evenNum = 0;
//
//        for(int num: num_list) {
//            if (num % 2 == 0) {
//                evenNum++;
//            } else {
//                oddNum++;
//            }
//        }
        int oddNum = (int) Arrays.stream(num_list).filter(s -> s % 2 == 1).count();
        int evenNum = (int) Arrays.stream(num_list).filter(s -> s % 2 == 0).count();
        return new int[] {evenNum, oddNum};
    }

    public int solution2(String my_string) {
//        return Arrays.stream(my_string.replaceAll("[^0-9]", "")
//                        .split("")).mapToInt(Integer::parseInt).sum();
        int answer = 0;

        for(char c : my_string.toCharArray()){
            if(c >= '0' && c <= '9'){
                answer += c - '0';
            }
        }
        return answer;
    }

    public int solutionTriangle(int[] sides) {
        int longest = Arrays.stream(sides)
                .sorted()
                .skip(sides.length-1)
                .sum();
        System.out.println("longest: " + longest);
        // 내림차순 정렬 후 longest => limit 1, sum => skip 1 담고싶다..
        int sum = Arrays.stream(sides)
                .sorted()
                .limit(sides.length-1)
                .sum();
        System.out.println("elseSum: " + sum);

        return longest >= sum? 0 : 1;

//        Arrays.sort(sides);
//        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }

    public String solutionCipher(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
                sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }

    public String solutionConvert(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < my_string.length(); i++){
            if(Character.isLowerCase(my_string.charAt(i))){
                sb.append(Character.toUpperCase(my_string.charAt(i)));
            }
            else if (Character.isUpperCase(my_string.charAt(i))) {
                sb.append(Character.toLowerCase(my_string.charAt(i)));
            }
            else sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
    public int oddEvenSum(int[] intArr){
        int even = Arrays.stream(intArr).filter(n -> n % 2 ==0).sum();
        System.out.println("evenSum: " + even);
        int odd = Arrays.stream(intArr).filter(n -> n % 2 ==1).sum();
        System.out.println("oddSum: " + odd);
        return even+odd;
    }
    public int[] solutionArrayMaxIndex(int[] array) {
        int a = Arrays.stream(array).max().orElse(-1);
        int b = IntStream.range(0, array.length)
                    .filter(i -> array[i] == a)
                .findFirst().orElse(-1);
        return new int[] {a,b};
    }


}
