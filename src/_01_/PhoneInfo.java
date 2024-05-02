package _01_;

public class PhoneInfo {
    String[] names = new String[100];
    String[] phoneNums = new String[100];

    int index = 0;

    public void insertPhone(String name, String phoneNum) {
        names[index] = name;
        phoneNums[index] = phoneNum;
    }
    public void printAllPhoneInfo() {
    	for(String i : names) {
    		System.out.println(i);
    	}
    	for(String i : phoneNums) {
    		System.out.println(i);
    	}
    }
	public void printPhoneInfo(int index) {
		System.out.println(this.names[index]);
		System.out.println(this.phoneNums[index]);
	    	
    }
}

