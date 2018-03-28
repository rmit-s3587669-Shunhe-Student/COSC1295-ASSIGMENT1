package assignment1;
/**@author Yao Chen*/
import java.util.ArrayList;

public class Teenagers extends People {
	public ArrayList<Teenagers> friendList=null;
	
	public Teenagers(String userName, String status, String sex, int age, Adults momObj, Adults dadObj) {
		super(userName, status, sex, age, momObj, dadObj);
	}
	
	public ArrayList<Teenagers> getFriendList() {
		return friendList;
	}
	public void setFriendList(ArrayList<Teenagers> friendList) {
		this.friendList = friendList;
	}

	@Override
	public void showInFor() {
		super.showInFor();
		System.out.printf("%-13s", "| "+"No data");
		System.out.printf("%-13s", "| "+"No data");
		System.out.println("|");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
	}
}
