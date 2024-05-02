package _02_;

public class FullTimeWorker extends Business{
	int bonus;
	
	public FullTimeWorker() {type = 1;}
	
	@Override
	public double getMonthPay() {
		return pay / 12 + bonus/12;
	}
	
	@Override
	public void showEmployeeInfo() {
		System.out.println(eno);
		System.out.println(name);
		System.out.println(getMonthPay());
		System.out.println(type);
	}

}
