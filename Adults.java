package assignment1;

/**@author Yao Chen*/
import java.util.ArrayList;

public class Adults extends People {
	private Adults coupleObj;
	private String maritalStatus;
	public ArrayList childList = null; // Store different types objects
	public ArrayList<Adults> friendList = null;

	public Adults(String userName, String status, String sex, int age, Adults momObj, Adults dadObj, Adults coupleObj,
			String maritalStatus) {
		super(userName, status, sex, age, momObj, dadObj);
		this.coupleObj = coupleObj;
		this.maritalStatus = maritalStatus;
	}

	@Override
	public void showInFor() {
		super.showInFor();

		if (!(this.coupleObj == null)) {
			System.out.printf("%-13s", "| " + this.getCoupleObj().getUserName());
		} else {
			System.out.printf("%-13s", "| " + "No data");
		}
		System.out.printf("%-13s", "| " + this.maritalStatus);
		System.out.println("|");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------");
	}

	public Adults getCoupleObj() {
		return coupleObj;
	}

	public void setCoupleObj(Adults coupleObj) {
		this.coupleObj = coupleObj;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public ArrayList getChildList() {
		return childList;
	}

	public void setChildList(ArrayList childList) {
		this.childList = childList;
	}

	public ArrayList<Adults> getFriendList() {
		return friendList;
	}

	public void setFriendList(ArrayList<Adults> friendList) {
		this.friendList = friendList;
	}

}

