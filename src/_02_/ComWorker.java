package _02_;

public class ComWorker extends Worker{
	@Override
	public void going() {
		System.out.println("going with com");
	}
	@Override
	public void working() {
		System.out.println("working with com");
	}
	@Override
	public void exiting() {
		System.out.println("exiting with com");
	}
	
}
