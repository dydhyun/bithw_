package hw_05woal._07;

public class basic123 {

	public static void main(String[] args) {
		
		Count_GaBa a = new Count_GaBa("마나다라마바사가가"); // 매개변수 생성자 사용

		System.out.println("---------");
		
		Terminate_aeiou b = new Terminate_aeiou("aeiouabcdef"); // 매개변수 생성자 사용

		System.out.println("---------");
	
		Round_16459 c = new Round_16459(); // 생성자 사용
		
		double result = Round_16459.printRound(3.14159); // 매개변수 생성자 사용
		System.out.println(result); // static 메서드 사용

		System.out.println("---------");
		
		PrintMiddle.printMiddle("비둘기러기차"); // static 메서드 사용

		System.out.println("---------");
		
		StrSort.sort(); // static method 사용
		
		System.out.println("---------");
		double beforeMoney = 10000;
		double rate = 0.1;
		double interest;
		int year = 10;
		double afterMoney = beforeMoney;
		for(int i = 0; i < year; i++) {
			interest = afterMoney * rate;
			afterMoney += interest;
		}
		System.out.println(beforeMoney + " 원을 맡겼을때 " + year + " 년 후 " + afterMoney + " 원 입니다.");
	}

}
