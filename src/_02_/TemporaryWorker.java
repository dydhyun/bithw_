package _02_;

public class TemporaryWorker extends Business {
	int hireYear;
	
	public TemporaryWorker() {type = 3;}

	
	@Override
	public double getMonthPay() {
		return pay / 12 ;
	}
	
	@Override
	public void showEmployeeInfo() {
		System.out.println(eno);
		System.out.println(name);
		System.out.println(getMonthPay());
		System.out.println(type);
	}
	
}
