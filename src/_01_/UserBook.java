package _01_;

public class UserBook {
	public User[] arr = new User[100];
	public int index=0;


	public User[] saveUserInfo(String userName, String password){
		arr[index] = new User(index+1,userName, password);
		index++;
		return arr;
	}
	
}
