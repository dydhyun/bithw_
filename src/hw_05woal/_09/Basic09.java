package hw_05woal._09;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Basic09 {
	public static void main(String[] args) {
	
		changeDay();
		System.out.println("--------------");
		System.out.println("--------------");
		printDay();
		System.out.println("--------------");
		System.out.println("--------------");
		printList();
	
	}
	
	
	
	/*
	 * 1. Calendar 객체를 오늘날짜로 생성하세요.
	 * 객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
	 * 위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
	 * */	
	public static void changeDay() {
		Calendar c = Calendar.getInstance();
		c.set(2024, 4, 8);
		System.out.println(c.get(c.YEAR) + "년 " 
				+ c.get(c.MONTH) + "월 " + c.get(c.DATE) + "일");
		
		c.add(Calendar.DATE, 365*5 + 30*2 + 3);
		System.out.println(c.get(c.YEAR) + "년 " 
				+ c.get(c.MONTH) + "월 " + c.get(c.DATE) + "일");
		
	}
	
	
	/*
	 * 2. Calendar 객체를 오늘날짜로 생성하세요.
	 * 오늘날짜를 2023-03-24 형식으로 출력하세요.
	 * 오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
	 * */
	public static void printDay() {
		Calendar c = Calendar.getInstance();
		StringBuilder sb = new StringBuilder();
		
		
		System.out.println(sb.append(c.get(Calendar.YEAR)).append("-")
				.append(c.get(Calendar.MONTH) < 10 ? "0" + c.get(Calendar.MONTH) : c.get(Calendar.MONTH))
				.append("-")
				.append(c.get(Calendar.DATE) < 10 ? "0" + c.get(Calendar.DATE) : c.get(Calendar.DATE)));
		
		
		Date day = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM일 dd일");
		System.out.println(sdf.format(day));
		
	}
	
	

//	3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
	public static void printList() {
		List<Integer> iList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println( i+1 + "번째 입력:");
			iList.add(sc.nextInt());
		}
		
		System.out.println(iList);
		
		
	}
	
}
