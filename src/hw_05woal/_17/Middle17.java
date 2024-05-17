package hw_05woal._17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Middle17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺽정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		
		studentList.stream().filter(stu -> stu.getScore() >= 95).forEach(System.out::println);
		
		System.out.println("=========================================================");
		
		Stream newStream = studentList.stream().map(stu -> 
									{
										if(stu.getScore() >= 95) {
											stu.setGrade("A+");
										} else {
											stu.setGrade("C");
										}
										return stu;
									}).filter(stu -> stu.getGrade().equals("A+"));
		
		newStream.forEach(System.out::println);
		
		System.out.println("=========================================================");
		System.out.println(studentList);
		System.out.println("=========================================================");
		
		
		Scanner sc = new Scanner(System.in);
		List<Character> charList = new ArrayList<>();
		System.out.println("문자 하나 입력.");
		for(int i = 0; i < 10; i++) {
			charList.add(sc.next().charAt(0));
		}
		charList.stream().map(
								ch -> Character.isLowerCase(ch) ?
										Character.toUpperCase(ch) : Character.toLowerCase(ch)
								).forEach(System.out::print);
		
		
		sc.close();
		
		
	}

}

/*
1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)를 저장하고
Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.

2. 1번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.

3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고
스트림을 이용해서 영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
*/