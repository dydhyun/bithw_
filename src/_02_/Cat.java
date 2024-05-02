package _02_;

public class Cat extends Mammalia{
	public Cat() {
		
	}
	
	@Override
	public void cry() {
		System.out.println("고양이과 포유류는 웁니다..");
	}
	
	@Override
	public void sleep() {
		System.out.println("고양이과 포유류는 잡니다..");
	}

}
