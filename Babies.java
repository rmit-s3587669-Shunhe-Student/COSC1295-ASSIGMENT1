package assignment1;

/** @author Yao Chen */
public class Babies extends People {

	public Babies(String userName, String status, String sex, int age, Adults momObj, Adults dadObj) {
		super(userName, status, sex, age, momObj, dadObj);
	}

	@Override
	public void showInFor() {
		super.showInFor();
		System.out.printf("%-13s", "| " + "No data");
		System.out.printf("%-13s", "| " + "No data");
		System.out.println("|");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------");
	}
}