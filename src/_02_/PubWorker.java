package _02_;
public class PubWorker extends Worker{
	
	@Override
	public void going() {
		System.out.println("going with nothing");
	}
	@Override
	public void working() {
		System.out.println("working with nothing");
	}
	@Override
	public void exiting() {
		System.out.println("exiting with nothing");
	}

}
