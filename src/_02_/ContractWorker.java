package _02_;

public class ContractWorker extends Business {
	int workDay;
	
	public ContractWorker() {type = 2;}

	
	@Override
	public double getMonthPay() {
		return pay * workDay;
	}
	
	@Override
	public void showEmployeeInfo() {
		System.out.println(eno);
		System.out.println(name);
		System.out.println(getMonthPay());
		System.out.println(type);
	}
}
