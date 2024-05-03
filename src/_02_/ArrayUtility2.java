package _02_;

import java.util.Arrays;

public class ArrayUtility2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];
		int[] b = new int[3];
		a[0] = 4;
		a[1] = 4;
		a[2] = 4;
		a[3] = 6;
		
		b[0] = 4;
		b[1] = 5;
		b[2] = 7;
		System.out.println(Arrays.toString(remove(a,b)));
		System.out.println(Arrays.toString(concat(a,b)));
		
	}
	
	
	
	public static int[] concat(int[] s1, int[] s2) {
		int[] newArr = new int[s1.length + s2.length];
		for(int i = 0; i < s1.length; i++) {
			newArr[i] = s1[i];
		}
		for(int i = 0; i < s2.length; i++) {
			newArr[s1.length + i] = s2[i];
		}
		return newArr;
	}
	
	
	public static int[] remove(int[] s1, int[] s2) {
		int[] newArr = new int[s1.length];
		
		for(int i = 0; i < s1.length; i++) {
			int cnt = 0;
			
			for(int j = 0; j < s2.length; j++) {
			
				if(s1[i] == s2[j]) {
					continue;
				}
				else cnt++;
			}
			
			if(cnt >= s2.length) {
				newArr[i] = s1[i];
			}
		}
		for(int i = 0; i < newArr.length; i++) {
			if(newArr[i] == 0) {
				
			}
		}
		
		return newArr;
	}


}
