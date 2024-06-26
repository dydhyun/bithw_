package hw_05woal._14;

public class NumberPrinter3 extends Thread{
	private int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	
	public synchronized void numPrint1(int input) {
			this.setNum(input);
		
			for(int i = num; i <= 50; i++) {
				if(i % 3 == 0) {
					System.out.println("서브스레드1: " + i);
					notify();	
					
					try {
						wait();
						sleep(100);
					}catch(InterruptedException ie) {
						System.out.println(ie.getMessage());
						break;
					}
				}		
			}
			notify();
	}
	
	public synchronized void numPrint2(int input) {
			this.setNum(input);
			
			for(int i = num; i <= 100; i++) {
				if(i % 35 == 0) {
					System.out.println("서브스레드2: " + i);
					notify();
					
					try {
						wait();
						sleep(100);
					}catch(InterruptedException ie) {
						System.out.println(ie.getMessage());
						break;
					}
				}
			}
			notify();			
	}
	
}
//5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.

//1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고 1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 
//각각의 스레드를 실행하십시오.

//2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서 끝난 후에 메인 스레드가 실행되도록 구현하세요.

//3. 공유객체로 사용될 클래스 NumberPrinter를 만들고 멤버변수로 int num을 가지고 정수형 매개변수를 받아 
//매개변수로 받아온 값은 num에 저장하고, num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 
//num~100까지 숫자 중 5와 7의 공배수를 출력하는 메소드 numPrint2(int num)를 구현하세요. 
//그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 호출하는 스레드 클래스 1개를 구현하고 
//메인스레드에서 두 개의 스레드를 실행하세요.

//4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.

//5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.