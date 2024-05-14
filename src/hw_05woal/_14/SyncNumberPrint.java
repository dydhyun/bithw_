package hw_05woal._14;

public class SyncNumberPrint{
	public static void main(String[] args) {
		
//		Shared s = new Shared();
//		Shared2 s2 = new Shared2();
//		
//		NumberPrinter np = new NumberPrinter();
//		s.setPn(np);
//		s2.setPn(np);
//		s.start();
//		s2.start();
//		
//		System.out.println("====================");
//
//		Shared s3 = new Shared();
//		Shared2 s4 = new Shared2();
//		NumberPrinter2 np2 = new NumberPrinter2();
//		s3.setPn2(np2);
//		s4.setPn2(np2);
//		s3.start();
//		s4.start();
//		
//		System.out.println("====================");
//
		Shared s5 = new Shared();
		Shared2 s6 = new Shared2();
		NumberPrinter3 np3 = new NumberPrinter3();
		s5.setPn3(np3);
		s6.setPn3(np3);
		s5.start();
		s6.start();
		
	}
	
	
}
