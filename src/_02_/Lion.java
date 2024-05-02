package _02_;

public class Lion extends Cat{
	public Lion() {
		
	}
	
	@Override
	public void cry() {
		System.out.println("고양이과 포유류 사자는 웁니다..");
	}
	
	@Override
	public void sleep() {
		System.out.println("고양이과 포유류 사자는 잡니다..");
	}
}