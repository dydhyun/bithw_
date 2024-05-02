package _02_;

public abstract class Business {
	public int eno;
	public String name;
	public int pay;
	public int type;//1: 정규직 2: 계약직 3: 임시직
	
	public Business() {
		
	}
	
	public Business(int eno, String name, int pay, int type) {
			this.eno = eno;
			this.name = name;
			this.pay = pay;
			this.type = type;
		}
	
	public abstract double getMonthPay();
	
	public void showEmployeeInfo() {
		System.out.println(this.eno);
		System.out.println(this.name);
		System.out.println(this.pay);
		System.out.println(this.type);
	}
	
	
}
