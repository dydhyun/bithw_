package hw_05woal._01;

//딜리트 생각하기
public class DeleteStr {
	
	String deleteString(String str) {
		String dltdStr = "";
		
		for( int i = 0; i < str.length(); i++) {
			int cnt = 0;
			for(int j = i + 1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					cnt++;
				}
			}
			if(cnt > 0) {
				
			}else {
				dltdStr += str.charAt(i);
			}
		}
		
		return dltdStr;
	}
	
}
