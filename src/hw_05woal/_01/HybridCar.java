package hw_05woal._01;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("속도를 올립니다.");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("속도를 내립니다.");

	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("연료를 넣습니다.");

	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("충전 합니다.");

	}

}
