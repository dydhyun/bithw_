package hw_05woal._10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		store();
		contact();

	}

	//1. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분)
	//value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
	public static void store(){

		Map<String, Integer> nMap = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("---입력:1 -- 출력:2 --- 종료:0");
			int menu = sc.nextInt();
			sc.nextLine();

			if(menu == 1) {
				System.out.println("key 입력(String)");
				String sc1 = sc.nextLine();
				Integer sc2;
				System.out.println("Value 입력(Integer)");
				sc2 = sc.nextInt();
				sc.nextLine();
				nMap.put(sc1, sc2);

			} else if (menu == 2) {
				System.out.println(nMap);
			} else if(menu == 0) break;
			else System.out.println("잘못된 입력입니다.");
		}
	}

	//2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고,
	//특정 이름의 전화번호를 조회하는 기능을 구현하세요.
	public static void contact(){

		Map<String, String> contact = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("---전화번호 입력:1 -- 이름으로 조회:2 --- 종료:0");
			int menu = sc.nextInt();
			sc.nextLine();

			if(menu == 1) {
				System.out.println("이름 입력");
				String sc1 = sc.nextLine();

				System.out.println("전화번호 입력");
				String sc2 = sc.nextLine();
				String regex = "^\\d{3}-\\d{4}-\\d{4}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(sc2);

				if(matcher.matches()) {
					contact.put(sc1, sc2);
					System.out.println("입력 하였습니다.");
					}
				else {
					System.out.println("틀린 양식입니다. 입력을 취소합니다.");
				}
			} else if (menu == 2) {
				System.out.println("조회할 이름 입력:");
				String search = sc.nextLine();
				System.out.println(contact.get(search));
			} else if(menu == 0) break;
			else System.out.println("잘못된 입력입니다.");
		}
	}


}