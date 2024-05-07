package hw_05woal._07;

public class Count_GaBa {

	public Count_GaBa() {
		
	}
	public Count_GaBa(String str) {	
		int gCnt = 0;
		int bCnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '가') {
				
				gCnt++;
			}
			else if(str.charAt(i) == '바') {
				
				bCnt++;
			}	
			else {
				continue;
			}
			
		}

		if(gCnt > 0 || bCnt > 0) {
			System.out.println("가: " + gCnt + ", 바: " + bCnt);
		}
		else {
			System.out.println("가,바 가 존재하지 않습니다.");
		}
		
	}
	

}
