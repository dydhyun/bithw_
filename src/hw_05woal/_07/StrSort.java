package hw_05woal._07;

import java.util.Arrays;

public class StrSort {
	public StrSort() {
		
	}
	
	public static void sort() {
		char[] stdStr = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};
		
		char[] bit = new char[3];
		char[] com = new char[3];
		char[] sql = new char[3];
		char[] intStr = new char[3];
		int b = 0, c = 0, s = 0, t = 0;
		// bit => 0, 4, 8
		// com => 1, 5, 9
		// sql => 2, 6, 10
		// int => 3, 7, 11
		for(int i = 0; i < stdStr.length; i++) {
			if( i % 4 == 0) {
					bit[b] += stdStr[i];
					b++;
			}
			else if(i % 4 == 1) {
					com[c] += stdStr[i];
					c++;
			}
			else if(i % 4 == 2) {
					sql[s] += stdStr[i];
					s++;
			}
			else if(i % 4 == 3) {
					intStr[t] += stdStr[i];
					t++;
			}
		}
		
		System.out.println(Arrays.toString(bit));
		System.out.println(Arrays.toString(com));
		System.out.println(Arrays.toString(sql));
		System.out.println(Arrays.toString(intStr));
	}

}
