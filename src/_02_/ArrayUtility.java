package _02_;

import java.util.Arrays;

public class ArrayUtility {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		
		double[] b = new double[3];
		b[0] = 2.0;
		b[1] = 3.0;
		b[2] = 4.0;
		
		System.out.println(Arrays.toString(intToDouble(a)));
		System.out.println(Arrays.toString(doubleToint(b)));
	}
	
	static double[] intToDouble(int[] source) {
		double[] dArr = new double[source.length];
		for(int i = 0; i < source.length; i++) {
		dArr[i] = source[i];
		}
		return dArr;
	}
	
	
	static int[] doubleToint(double[] source) {
		int[] iArr = new int [source.length];
		for(int i = 0; i < source.length; i++) {
		iArr[i] = (int) source[i];
		}
		
		return iArr;
	}

}
