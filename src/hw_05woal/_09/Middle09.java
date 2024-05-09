package hw_05woal._09;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Middle09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		trans();
		
		hanguel();
		
		dif();
		
	}
	
	/*1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
	 * yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
	 * parse() 메소드를 이용하면 String -> Calendar로 변환가능)
	 */
	//2024-04-29
	public static void trans() {
		Scanner sc = new Scanner(System.in);
		System.out.println("yyyy-MM-dd 형식의 날짜 입력:");
		String dateStr = sc.nextLine();//"2024-05-09";

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		// 문자열 -> Date
		try {
			Date date = formatter.parse(dateStr);
			Calendar c = new GregorianCalendar();
			c.setTime(date);
			c.add(Calendar.DATE,3);
			System.out.println(formatter.format(c.getTimeInMillis()));
			
		}
		catch(Exception e){
			System.out.println("잘못된 입력입니다.");
			System.out.println(e);
		}
		
		
	}
	
	/*2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
	 * 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
	 */	
	public static void hanguel() {
		List<String> ls = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		
	}
	
	
	/*
	 * 3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
	 *시 분 초 형태로 나타내시오.
	 */
	public static void dif() {
		
	}
	

}
