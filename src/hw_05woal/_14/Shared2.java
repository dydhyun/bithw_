package hw_05woal._14;

public class Shared2 extends Thread{
	private NumberPrinter pn;
	private NumberPrinter2 pn2;
	private NumberPrinter3 pn3;
	
	
	public NumberPrinter getPn() {
		return pn;
	}
	public void setPn(NumberPrinter pn) {
		this.pn = pn;
	}

	
	public NumberPrinter2 getPn2() {
		return pn2;
	}
	public void setPn2(NumberPrinter2 pn2) {
		this.pn2 = pn2;
	}

	
	public NumberPrinter3 getPn3() {
		return pn3;
	}
	public void setPn3(NumberPrinter3 pn3) {
		this.pn3 = pn3;
	}

	
//	@Override
//	public void run() {
//		this.pn.numPrint2(10);
//	}
//	
//	@Override
//	public void run() {
//		this.pn2.numPrint2(10);
//	}
//	
	@Override
	public void run() {
		this.pn3.numPrint2(10);
	}
//	
//	 @Override
//	    public void run() {
//	        if (this.pn != null) {
//	            this.pn.numPrint2(10);
//	        }
//	        if (this.pn2 != null) {
//	            this.pn2.numPrint2(10);
//	        }
//	        if (this.pn3 != null) {
//	            this.pn3.numPrint2(10);
//	        }
//	    }
	
}
