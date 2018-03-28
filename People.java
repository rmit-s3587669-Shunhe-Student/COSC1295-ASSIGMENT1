package assignment1;

/**
 * @author Shunhe Wang
 */
public abstract class People {
	private String userName;
	private String status;
	private String sex;
	private int age;
	private Adults momObj;
	private Adults dadObj;
	private String imgPath=null;// Image


	public People(String userName, String status, String sex, int age, Adults momObj, Adults dadObj) {
		this.userName = userName;
		this.status = status;
		this.sex = sex;
		this.age = age;
		this.momObj = momObj;
		this.dadObj = dadObj;
	}

	/** Show person information */
	public void showInFor() {
		System.out.printf("%-15s", "| " + this.getUserName());
		System.out.printf("%-25s", "| " + this.getStatus());
		System.out.printf("%-7s", "| " + this.getSex());
		System.out.printf("%-7s", "| " + this.getAge());

		if (!(this.getMomObj() == null)) {
			System.out.printf("%-15s", "| " + this.getMomObj().getUserName());
		} else
			System.out.printf("%-15s", "| " + "No data");
		if (!(this.getDadObj() == null)) {
			System.out.printf("%-15s", "| " + this.dadObj.getUserName());
		} else
			System.out.printf("%-13s", "| " + "No data");

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adults getMomObj() {
		return momObj;
	}

	public void setMomObj(Adults momObj) {
		this.momObj = momObj;
	}

	public Adults getDadObj() {
		return dadObj;
	}

	public void setDadObj(Adults dadObj) {
		this.dadObj = dadObj;
	}
	
	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}
