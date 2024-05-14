<<<<<<< HEAD
package hw_05woal._09;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Basic10 {

	
	// 코드뎁스, 코드라인, 메서드이름
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if
//		prob1();
		
//		else if
		while(true) {
			prob2();
		}
//		else{
//		System.out.println("잘못된 입력.");
//		}
	}

	
		/*
		 문제 1: ArrayList에서 특정 요소의 모든 인덱스 찾기
		 문제 설명:
		 Java에서 ArrayList<Integer> 타입의 리스트가 주어집니다.
		 이 리스트 안에서 특정 숫자가 나타나는 모든 인덱스를 찾아 리스트로 반환하는 메서드를 작성해보세요.
		 해당 숫자가 리스트에 없으면 빈 리스트를 반환합니다.
		예시:
	
		입력 리스트: [5, 3, 7, 3, 2, 3, 9]
		찾고자 하는 숫자: 3
		출력: [1, 3, 5]
		*/
	public static void prob1() {
		List<Integer> intArr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("숫자 입력(입력완료: 0):");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			intArr.add(input);
		}
		System.out.println(intArr);
		System.out.println("찾고싶은 숫자: ");
		int num = sc.nextInt();
		
		printNewList(intArr, num);
	}
	
	private static void printNewList(List<Integer> intArr, int num) {
		List<Integer> idxList = new ArrayList<>();
		
		for(int i = 0; i < intArr.size(); i++) {
			if(intArr.get(i) == num) {
				idxList.add(i);
				}
		}
		
		if(!idxList.isEmpty()) {
			System.out.println(idxList);
			System.out.println("총 " + idxList.size() + " 개");
		}
		else {
			System.out.println("찾으려는 숫자가 없습니다.");
		}
	}
	
	
	/*
	문제 2: ArrayList를 이용한 간단한 주소록 만들기
	문제 설명:
	간단한 주소록을 관리하는 Java 프로그램을 작성해보세요. 각 연락처는 이름(String)과 전화번호(String)로 이루어져 있습니다.
	사용자로부터 연락처를 추가, 삭제, 모든 연락처 출력의 기능을 수행하는 메뉴를 제공하세요.
	연락처 정보는 ArrayList에 저장해야 합니다.

	기능 요구 사항:

	연락처 추가: 사용자로부터 이름과 전화번호를 입력받아 ArrayList에 추가합니다.
	연락처 삭제: 사용자로부터 이름을 입력받아 해당 이름의 연락처를 ArrayList에서 찾아 삭제합니다. 해당 이름의 연락처가 여러 개 있을 경우 모두 삭제합니다.
	연락처 목록 출력: 현재 ArrayList에 저장된 모든 연락처를 출력합니다.
	*/	
	
	public static void prob2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택( 1.연락처 추가 2. 연락처 삭제 3. 목록출력)");
		int pick = sc.nextInt();
		Map<List<String>, List<String>> lst = new HashMap<List<String>, List<String>>();
		
		if(pick == 1) {
			lst.put(addName(), addNum());
		}
		else if(pick == 2) {
			System.out.println("삭제할 연락처의 이름: ");
			
			String name = sc.nextLine();
			del(lst.get(name), name);
		}
		else if(pick == 3) {
			
			print();
		}
		else System.out.println("잘못된 입력입니다.");
	}
	
	private static List<String> addName() {
		List<String> nameLst = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("name:");
		nameLst.add(sc.nextLine());

		return nameLst;
	}
	private static List<String> addNum() {
		List<String> pnumLst = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number:");
		pnumLst.add(sc.nextLine());

		return pnumLst;
	}
	
	private static void del(List<String> lst, String name) {
		if(lst.isEmpty()) {
			System.out.println("목록이 비었습니다.");
			return;
		}
		else if(!lst.contains(name)) {
			System.out.println("목록에 없는 이름입니다.");
			return;
		}
		else {
			lst.remove(0);
		}
	}
	
	private static void print() {
		
	}
	
}
=======
package hw_05woal._09;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Basic10 {

	
	// 코드뎁스, 코드라인, 메서드이름
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if
//		prob1();
		
//		else if
		while(true) {
			prob2();
		}
//		else{
//		System.out.println("잘못된 입력.");
//		}
	}

	
		/*
		 문제 1: ArrayList에서 특정 요소의 모든 인덱스 찾기
		 문제 설명:
		 Java에서 ArrayList<Integer> 타입의 리스트가 주어집니다.
		 이 리스트 안에서 특정 숫자가 나타나는 모든 인덱스를 찾아 리스트로 반환하는 메서드를 작성해보세요.
		 해당 숫자가 리스트에 없으면 빈 리스트를 반환합니다.
		예시:
	
		입력 리스트: [5, 3, 7, 3, 2, 3, 9]
		찾고자 하는 숫자: 3
		출력: [1, 3, 5]
		*/
	public static void prob1() {
		List<Integer> intArr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("숫자 입력(입력완료: 0):");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			intArr.add(input);
		}
		System.out.println(intArr);
		System.out.println("찾고싶은 숫자: ");
		int num = sc.nextInt();
		
		printNewList(intArr, num);
	}
	
	private static void printNewList(List<Integer> intArr, int num) {
		List<Integer> idxList = new ArrayList<>();
		
		for(int i = 0; i < intArr.size(); i++) {
			if(intArr.get(i) == num) {
				idxList.add(i);
				}
		}
		
		if(!idxList.isEmpty()) {
			System.out.println(idxList);
			System.out.println("총 " + idxList.size() + " 개");
		}
		else {
			System.out.println("찾으려는 숫자가 없습니다.");
		}
	}
	
	
	/*
	문제 2: ArrayList를 이용한 간단한 주소록 만들기
	문제 설명:
	간단한 주소록을 관리하는 Java 프로그램을 작성해보세요. 각 연락처는 이름(String)과 전화번호(String)로 이루어져 있습니다.
	사용자로부터 연락처를 추가, 삭제, 모든 연락처 출력의 기능을 수행하는 메뉴를 제공하세요.
	연락처 정보는 ArrayList에 저장해야 합니다.

	기능 요구 사항:

	연락처 추가: 사용자로부터 이름과 전화번호를 입력받아 ArrayList에 추가합니다.
	연락처 삭제: 사용자로부터 이름을 입력받아 해당 이름의 연락처를 ArrayList에서 찾아 삭제합니다. 해당 이름의 연락처가 여러 개 있을 경우 모두 삭제합니다.
	연락처 목록 출력: 현재 ArrayList에 저장된 모든 연락처를 출력합니다.
	*/	
	
	public static void prob2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택( 1.연락처 추가 2. 연락처 삭제 3. 목록출력)");
		int pick = sc.nextInt();
		Map<List<String>, List<String>> lst = new HashMap<List<String>, List<String>>();
		
		if(pick == 1) {
			lst.put(addName(), addNum());
		}
		else if(pick == 2) {
			System.out.println("삭제할 연락처의 이름: ");
			
			String name = sc.nextLine();
			del(lst.get(name), name);
		}
		else if(pick == 3) {
			
			print();
		}
		else System.out.println("잘못된 입력입니다.");
	}
	
	private static List<String> addName() {
		List<String> nameLst = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("name:");
		nameLst.add(sc.nextLine());

		return nameLst;
	}
	private static List<String> addNum() {
		List<String> pnumLst = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number:");
		pnumLst.add(sc.nextLine());

		return pnumLst;
	}
	
	private static void del(List<String> lst, String name) {
		if(lst.isEmpty()) {
			System.out.println("목록이 비었습니다.");
			return;
		}
		else if(!lst.contains(name)) {
			System.out.println("목록에 없는 이름입니다.");
			return;
		}
		else {
			lst.remove(0);
		}
	}
	
	private static void print() {
		
	}
	
}
>>>>>>> 3860299d9bdc5d296253ef038e6c8614b3a4a766
