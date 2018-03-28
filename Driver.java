package assignment1;

/**
 * @author Shunhe Wang*/
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	ArrayList<People> people = null;
	Scanner scan = null;

	private int choiceMenu;
	private String userName;
	private String userName1;
	private String userName2;
	private People p;
	private String choiceYorN;
	private People tempPeople;
	private int age;
	private String userStatus;
	private String userSex;
	private String parentName;
	private Adults coupleObj;
	private Teenagers teenager;
	private String friendName;
	private Adults aduParObj;
	private Adults aduParCoupObj;
	private Adults tempAdu;
	private String coupleName;
	private String maritalStatus;
	private People adult;

	/** initialize some adults data */
	People p22 = new Adults("Liu", "Working at KFC", "Female", 35, null, null, null, "Single");
	People p23 = new Adults("Shen", "Working at Rmit", "Male", 55, null, null, null, "Single");
	People p1 = new Adults("Mary", "Working at KFC", "Female", 35, null, null, null, "Single");
	People p2 = new Adults("Lee", "Working at Rmit", "Male", 55, null, null, null, "Single");
	People p3 = new Adults("Joe", "Finding the job", "Female", 40, null, null, null, "Single");
	People p4 = new Adults("Joez", "At home", "Male", 45, null, null, null, "Single");
	People p5 = new Adults("Nan", "Looking for job", "Male", 25, null, null, null, "Single");
	People p6 = new Adults("Zoe", "At park", "Female", 45, null, null, null, "Single");
	People p7 = new Adults("Maison", "Working at Rmit", "Female", 45, null, null, null, "Single");
	People p8 = new Adults("Kitty", "Working at Rmit", "Male", 43, null, null, null, "Single");
	People p9 = new Adults("Lisa", "Looking for job", "Male", 35, null, null, null, "Single");
	People p10 = new Adults("Jacob", "Working at Rmit", "Female", 46, null, null, null, "Single");
	People p11 = new Adults("Viva", "Looking for job", "Male", 55, null, null, null, "Single");
	People p12 = new Adults("HeiQiuDan", "At home", "Female", 43, null, null, null, "Single");
	People p13 = new Adults("Fiona", "Working at Rmit", "Female", 43, null, null, null, "Single");
	Adults a1 = (Adults) p1;
	Adults a2 = (Adults) p2;
	Adults a3 = (Adults) p3;
	Adults a4 = (Adults) p4;
	Adults a5 = (Adults) p5;
	Adults a7 = (Adults) p7;
	Adults a8 = (Adults) p8;
	Adults a10 = (Adults) p10;
	Adults a11 = (Adults) p11;
	Adults a12 = (Adults) p12;
	Adults a13 = (Adults) p13;
	Adults a22 = (Adults) p22;
	Adults a23 = (Adults) p23;

	public Driver() {
		people = new ArrayList<People>();
		scan = new Scanner(System.in);
		/**
		 * Add some couple object so that some adults are single and some has been
		 * married
		 */
		p22 = new Adults("Liu", "Working at KFC", "Female", 35, null, null, a23, "Married");
		p23 = new Adults("Shen", "Working at Rmit", "Male", 55, null, null, a22, "Married");
		p1 = new Adults("Mary", "Working at KFC", "Female", 35, null, null, a2, "Married");
		p2 = new Adults("Lee", "Working at Rmit", "Male", 55, null, null, a1, "Married");
		p3 = new Adults("Joe", "Finding the job", "Male", 40, (Adults) p1, (Adults) p2, a4, "Married");
		p4 = new Adults("Joez", "At home", "Female", 45, (Adults) p22, (Adults) p23, a3, "Married");
		p5 = new Adults("Nan", "Looking for job", "Male", 25, (Adults) p1, (Adults) p2, null, "Single");
		p6 = new Adults("Zoe", "At park", "Female", 45, (Adults) p1, (Adults) p2, null, "Single");
		p7 = new Adults("Maison", "Working at Rmit", "Male", 45, null, null, a8, "Married");
		p8 = new Adults("Kitty", "Working at Rmit", "Female", 43, null, null, a7, "Married");
		p10 = new Adults("Jacob", "Working at Rmit", "Female", 46, (Adults) p1, (Adults) p2, a11, "Married");
		p11 = new Adults("Viva", "Looking for job", "Male", 55, (Adults) p22, (Adults) p23, a10, "Married");
		p12 = new Adults("HeiQiuDan", "At home", "Female", 43, null, null, a13, "Married");
		p13 = new Adults("Fiona", "Working at Rmit", "Female", 43, null, null, a12, "Married");
		/** Add some teenagers objects */
		People p14 = new Teenagers("Kenny", "Studying at Rmit", "Female", 15, (Adults) p3, (Adults) p4);
		People p15 = new Teenagers("Ken", "Finding parttim job", "Male", 13, (Adults) p3, (Adults) p4);
		People p16 = new Teenagers("Jing", "Studying at Rmit", "Female", 12, (Adults) p3, (Adults) p4);
		People p17 = new Teenagers("Hawa", "Studying at school", "Female", 8, (Adults) p7, (Adults) p8);
		People p18 = new Teenagers("John", "Studying at school", "Male", 13, (Adults) p7, (Adults) p8);
		/** Add some babies objects */
		People p19 = new Babies("Xiao", "At home", "Male", 1, (Adults) p3, (Adults) p4);
		People p20 = new Babies("Feng", "At home", "Female", 2, (Adults) p7, (Adults) p8);
		People p21 = new Babies("Liang", "At home", "Male", 1, (Adults) p7, (Adults) p8);
		Teenagers t14 = (Teenagers) p14;
		Teenagers t17 = (Teenagers) p17;
		Teenagers t18 = (Teenagers) p18;
		/** Add all objects above into arrayList */
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		people.add(p7);
		people.add(p8);
		people.add(p9);
		people.add(p10);
		people.add(p11);
		people.add(p12);
		people.add(p13);
		people.add(p14);
		people.add(p15);
		people.add(p16);
		people.add(p17);
		people.add(p18);
		people.add(p19);
		people.add(p20);
		people.add(p21);
		people.add(p22);
		people.add(p23);
		/** Add some child objects into adults.childlist */
		((Adults) p22).childList = new ArrayList();
		((Adults) p22).childList.add(p4);
		((Adults) p22).childList.add(p11);

		((Adults) p23).childList = new ArrayList();
		((Adults) p23).childList.add(p4);
		((Adults) p23).childList.add(p11);

		((Adults) p1).childList = new ArrayList();
		((Adults) p1).childList.add(p3);
		((Adults) p1).childList.add(p10);
		((Adults) p1).childList.add(p5);

		((Adults) p2).childList = new ArrayList();
		((Adults) p2).childList.add(p3);
		((Adults) p2).childList.add(p10);
		((Adults) p2).childList.add(p5);

		((Adults) p3).childList = new ArrayList();
		((Adults) p3).childList.add(p14);
		((Adults) p3).childList.add(p15);
		((Adults) p3).childList.add(p16);
		((Adults) p3).childList.add(p19);

		((Adults) p4).childList = new ArrayList();
		((Adults) p4).childList.add(p14);
		((Adults) p4).childList.add(p15);
		((Adults) p4).childList.add(p16);
		((Adults) p4).childList.add(p19);

		((Adults) p7).childList = new ArrayList();
		((Adults) p7).childList.add(p17);
		((Adults) p7).childList.add(p18);
		((Adults) p7).childList.add(p20);
		((Adults) p7).childList.add(p21);

		((Adults) p8).childList = new ArrayList();
		((Adults) p8).childList.add(p17);
		((Adults) p8).childList.add(p18);
		((Adults) p8).childList.add(p20);
		((Adults) p8).childList.add(p21);

		/** Add some objects into adults and teenagers friendList */
		((Adults) p3).friendList = new ArrayList<Adults>();
		((Adults) p3).friendList.add((Adults) p10);
		((Adults) p3).friendList.add((Adults) p8);
		((Adults) p3).friendList.add((Adults) p5);

		((Adults) p5).friendList = new ArrayList<Adults>();
		((Adults) p5).friendList.add((Adults) p3);
		((Adults) p5).friendList.add((Adults) p8);

		((Adults) p8).friendList = new ArrayList<Adults>();
		((Adults) p8).friendList.add((Adults) p3);
		((Adults) p8).friendList.add((Adults) p5);

		((Adults) p10).friendList = new ArrayList<Adults>();
		((Adults) p10).friendList.add((Adults) p3);

		t14.friendList = new ArrayList<Teenagers>();
		t14.friendList.add(t17);
		t14.friendList.add(t18);

		t17.friendList = new ArrayList<Teenagers>();
		t17.friendList.add(t14);

		t18.friendList = new ArrayList<Teenagers>();
		t18.friendList.add(t14);

	}

	/** Main menu */
	public void mainMenu() {
		System.out.println("****************************************");
		System.out.println("***               MininNet Menu                 ***");
		System.out.println("***--------------------------------------***");
		System.out.println("**       1 List everyone information        **");
		System.out.println("**       2 Select user name                        **");
		System.out.println("**       3 Add new user                             **");
		System.out.println("**       4 Are these two direct friend      **");
		System.out.println("**       5 Are these two couple                **");
		System.out.println("**       6 Exit social network system       **");
		System.out.println("****************************************");
		System.out.print("Enter an option_ ");
	}

	/** Execute main menu */
	public void controlMenu() {
		final int firstMenuNum = 1;
		final int lastMenuNum = 6;
		while (true) {
			this.mainMenu();
			choiceMenu = this.checkMenuNum(firstMenuNum, lastMenuNum);// get one integer in the meau range
			switch (choiceMenu) {
			case 1:
				this.runChoice1();
				break;
			case 2:
				this.runChoice2();
				break;
			case 3:
				this.runChoice3();
				break;
			case 4:
				this.runChoice4();
				break;
			case 5:
				this.runChoice5();
				break;
			case 6:
				System.exit(0);
				break;
			}
		}
	}

	/** Check input the same name */
	public boolean checkSameName(String name) {
		for (int i = 0; i < people.size(); i++) {
			String existName = people.get(i).getUserName();
			if (existName.equals(name)) {
				System.out.println("---       There is a same name in miniNet so cannot enter   ---");
				System.out.print("Please enter name again_ ");
				return true;
			}
		}
		return false;
	}
	
	/**Add image*/
	public void addImage(){
		if(choiceYorN.equalsIgnoreCase("Yes")) {
			System.out.println("---    Your photo needs to be kept in photo file    ---");
			System.out.print("Please enter your photo path_ ");
			String imaPath=scan.next();
			String regex="^(([Cc]|[Dd]|[Ee][Ff]):/)((photo)/)[A-Za-z]+.([Gg][Ii][Ff]|[Jj][Pp][Gg]|[Bb][Mm][Pp])";
			if(imaPath.matches(regex)) {
				System.out.println("---       Your photo is added successfully       ---");
			}else {
				System.out.println("---          Cannot find the image         ---");
				System.out.print("Do you need to add again_");
				choiceYorN=this.getYorN();
				if(choiceYorN.equalsIgnoreCase("Yes")) {
					addImage();
				}
			}
		}
	}

	/** Execute choice 3 */
	public void runChoice3() {
		final int maleNum = 1;
		final int femaleNum = 2;
		final int maxBabyAge = 2;
		final int maxTeenAge = 16;
		System.out.print("Enter new user name_");
		do {
			userName = this.getValid(); // get a string
		} while (checkSameName(userName));
		System.out.println("---   Do you want to upload photo   ---");
		System.out.print("Please enter ('Yes' or 'No')_ ");
		choiceYorN=this.getYorN();
		this.addImage();
		System.out.print("Enter new user status:");
		userStatus = scan.next();
		System.out.println("Choose new user sex");
		System.out.print("1) Male, 2) Female_  ");
		choiceMenu = this.checkMenuNum(maleNum, femaleNum);
		if (choiceMenu == 1) {
			userSex = "Male"; // get sex attribute
		}
		if (choiceMenu == 2) {
			userSex = "Female";
		}
		System.out.print("Enter new user age_ ");
		age = this.checkAge();
		// For teenager and baby object
		if (age < maxTeenAge) {
			System.out.println("Because this user age is under 16, Must be add parent name");
			while (true) {
				do {
					do {
						do {
							System.out.print("Enter your mom or father name_ ");
							parentName = this.getValid(); // get a valid string
						} while (!this.checkName(parentName)); // check there is a existed object that has name inputed
																// above
						tempPeople = p;
					} while (!this.isAdult(tempPeople)); // check this object is adult or not
				} while (!this.hasMarried((Adults) tempPeople)); // check this adult has been married
				if (checkParAndParpa((Adults) tempPeople)) { // Because adults children can also be adult or teenager or
																// baby
					break; // If this adult has children and child is adult, so this adult cannot
				} // become this baby parent. If not,can.
			}

			String coupleName = ((Adults) tempPeople).getCoupleObj().getUserName();
			coupleObj = (Adults) this.getPeopleObj(coupleName); // Get couple object
			// For baby, only add parent, so that If adding object is baby, we can add
			// directly baby object in that time
			if (age <= maxBabyAge) {
				if (tempPeople.getSex().equalsIgnoreCase("Male") && coupleObj.getSex().equalsIgnoreCase("Female")) {// Distinct
																													// parent
																													// sex
					People newBaby = new Babies(userName, userStatus, userSex, age, coupleObj, (Adults) tempPeople);
					people.add(newBaby);
					this.addChild(newBaby); // parent chlildList also add this new baby object
					System.out.println("---    New baby add successfully   ---");
				}
				if (tempPeople.getSex().equalsIgnoreCase("Female") && coupleObj.getSex().equalsIgnoreCase("Male")) {
					People newBaby = new Babies(userName, userStatus, userSex, age, (Adults) tempPeople, coupleObj);
					people.add(newBaby);
					this.addChild(newBaby);
					System.out.println("---    New baby add successfully   ---");

				}
			}
			// For teenagers, we also add directly teen object and there is new task to ask
			// user to establish friendship connection or not.
			if (age > maxBabyAge) {
				if (tempPeople.getSex().equalsIgnoreCase("Male") && coupleObj.getSex().equalsIgnoreCase("Female")) {
					People teen = new Teenagers(userName, userStatus, userSex, age, coupleObj, (Adults) tempPeople);
					teenager = (Teenagers) teen;
					people.add(teen);
					this.addChild(teen);
					System.out.println("---      New teenager add successfully       ---");
				}
				if (tempPeople.getSex().equalsIgnoreCase("Female") && coupleObj.getSex().equalsIgnoreCase("Male")) {
					People teen = new Teenagers(userName, userStatus, userSex, age, (Adults) tempPeople, coupleObj);
					people.add(teen);
					teenager = (Teenagers) teen;
					this.addChild(teen);
					System.out.println("---      New teenager add successfully   ---");
				}
				// This method do with adding teenagers friend.
				System.out.println("---      Do you want to add friend         ---");
				System.out.print("Please enter('Yes' or 'No')_");
				choiceYorN = this.getYorN();
				if(choiceYorN.equalsIgnoreCase("Yes")) {
					this.doAddFriendForTeen();
				}
				if(choiceYorN.equalsIgnoreCase("Yes")) {
					this.controlMenu();
				}
			}
		}
		// For adult
		if (age > maxTeenAge) {
			this.doAddParentForAdults(); // Adult can choose to add parent info or not.
			// Add couple object and set married status
			if(aduParObj!=null) {
				System.out.println("---   Add parent information successfully   ---");
			}
			
			Loop: while (true) {
				do {
					System.out.println("---    Do you enter this couple information for this adult    ---");
					System.out.print("Please enter ('Yes' or 'No')_ "); // Adult can choose add couple information or
																		// not
					choiceYorN = this.getYorN();
					if (choiceYorN.equalsIgnoreCase("Yes")) {
						System.out.print("Enter couple name_");
						coupleName = this.getValid();
					} else {
						coupleName = null; // If first time to add couple is not successful and second time dont
						coupleObj = null; // continue to add, we need to put 'null' to these local variable,
						maritalStatus = "Single"; // Because these variable has kept value at the first time.
						System.out.println("---      You do not add couple for this adult       ---");
						break Loop; // There is a sign,because If choose no, directly go out from all loop
					}
				} while (!isAdult(coupleName));
				if (coupleName != null) {
					coupleObj = (Adults) this.getPeopleObj(coupleName); // Get couple object
				}
				if (coupleObj.getMaritalStatus().equalsIgnoreCase("Married")) { // Check this couple object has been
																				// married or single.
					System.out.println("---     " + coupleName + " has been married     ---");
				} else {
					maritalStatus = "Married";
					break;
				}
			}
			// When Add new adult object, we need to separate this adult parent obejcts are
			// existed or not
			if (aduParObj == null && aduParCoupObj == null) {
				adult = new Adults(userName, userStatus, userSex, age, aduParObj, aduParCoupObj, coupleObj,
						maritalStatus);
				people.add(adult);
				System.out.println("---         Add adult successfully     ---");
			}
			if (aduParObj != null && aduParCoupObj != null) {
				if (aduParObj.getSex().equalsIgnoreCase("Male")) {
					adult = new Adults(userName, userStatus, userSex, age, aduParCoupObj, aduParObj, coupleObj,
							maritalStatus);
					people.add(adult);
					System.out.println("---         Add adult successfully     ---");
				}
				if (aduParObj.getSex().equalsIgnoreCase("Female")) {
					adult = new Adults(userName, userStatus, userSex, age, aduParObj, aduParCoupObj, coupleObj,
							maritalStatus);
					people.add(adult);
					System.out.println("---         Add adult successfully     ---");
				}
				this.addChild(aduParObj, aduParCoupObj, (Adults) adult); // If parent existed, add this new adult to
																			// parent childList
				if (coupleObj != null) { // If this adult has married, add this adult object to its couple object
					coupleObj.setCoupleObj((Adults) adult);
					coupleObj.setMaritalStatus("Married");
				}
			}
			// This method does with add friend for adults
			System.out.println("---      Do you want to add friend         ---");
			System.out.print("Please enter('Yes' or 'No')_");
			choiceYorN = this.getYorN();
			if(choiceYorN.equalsIgnoreCase("Yes")) {
				this.doAddFriendForAdult();
			}
			if(choiceYorN.equalsIgnoreCase("No")) {
				System.out.println("---   You are not add friend   ---");
				this.controlMenu();
			}
			
		}
	}

	/**
	 * Add adult child into adult childList. e.g grandPa children are adults and
	 * every adult's children can have teenagers or baby
	 */
	public void addChild(Adults adMom, Adults adDad, Adults ad) {
		if (adMom.getChildList() == null && adDad.getChildList() == null) {
			adMom.childList = new ArrayList();
			adDad.childList = new ArrayList();
			adMom.childList.add(ad);
			adDad.childList.add(ad);
		} else {
			adMom.childList.add(ad);
			adDad.childList.add(ad);
		}
	}

	/**Do with adding parents object for adult*/
	public void doAddParentForAdults() {
		do {
			do {
				System.out.println("---   Because this user is adult, do you enter the parent information   ---");
				System.out.print("Please enter ('Yes' or 'No')_");
				choiceYorN = this.getYorN();
				if (choiceYorN.equalsIgnoreCase("Yes")) {
					System.out.print("Enter parent name_ ");
					parentName = this.getValid();
				}
				if (choiceYorN.equalsIgnoreCase("No")) {
					parentName = null;
					System.out.println("---   You are not add Parent   ---");
					break;
				}
			} while (!this.isAdult(parentName));
			if (choiceYorN.equalsIgnoreCase("No")) {
				break;
			}
		} while (!this.hasMarried((Adults) tempAdu));
		if(tempAdu!=null) {
			if (((Adults) tempAdu).childList != null) {													//When childList is not null
				if (((Adults) tempAdu).childList.get(1) instanceof Teenagers
						|| ((Adults) tempAdu).childList.get(1) instanceof Babies) {			//When childList has stored teenagers and babies objects
					System.out.println(
							"---    This young adult has been teenagers or babies children so cannot as adult parent   ---");
					this.doAddParentForAdults();
				}
			}
		}
		
		if (choiceYorN.equalsIgnoreCase("Yes")) {
			aduParObj = (Adults) this.getPeopleObj(parentName);
			String parCoupName = aduParObj.getCoupleObj().getUserName();
			aduParCoupObj = (Adults) this.getPeopleObj(parCoupName);
		} else {
			aduParObj = null;
			aduParCoupObj = null;
		}
	}

	/** Check input name is adult name */
	public boolean isAdult(String name) {
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i) instanceof Adults) {
				tempAdu = (Adults) people.get(i);
				if (tempAdu.getUserName().equals(name)) {
					return true;
				}
			}
		}
		System.out.println("---   Cannot find the this adult information   ---");
		return false;
	}

	/** Add friend for adults */
	public void doAddFriendForAdult() {
		
		
		if (choiceYorN.equalsIgnoreCase("Yes")) {
			do {
				System.out.print("Enter friend name_");
				friendName = this.getValid();
			} while (!this.checkName(friendName));
			if (this.isAdult(friendName)) { // If add friend, need to check this object is adult or not
				Adults tempAduFriend = (Adults) tempAdu;
				if (tempAduFriend.getMaritalStatus().equals("Single")) {
					if (!this.isFamily(adult, tempAduFriend)) { // Check two adults may be brothers or sisters.
						if (this.checkFriend(tempAduFriend, adult)) { // Check having exist
							System.out.println(
									"---      They have been friend so no need to continue to add again    ---");
						} else {
							this.addFriend(adult, tempAduFriend);
							System.out.println("---     Friendship connection establish successfully     ---");
						}
					} else {
						System.out.println(
								"---   They have been family so cannot become friend (Brother or Sister)   ---");
					}
				} else {
					if (tempAduFriend.getCoupleObj().getUserName().equals(adult.getUserName())) { // Check two adults
																									// have been couple
						System.out
								.println("---   They have been couple so cannot becom friend (Wife or Husband)   ---");
					} else {
						if (!this.isFamily(adult, tempAduFriend)) {
							if (this.checkFriend(tempAduFriend, adult)) {
								System.out.println(
										"---      They have been friend so no need to continue to add again    ---");
							} else {
								this.addFriend(adult, tempAduFriend);
								System.out.println("---     Friendship connection establish successfully     ---");
							}
						} else {
							System.out.println(
									"---   They have been family so cannot become friend (Brother or Sister)   ---");
						}
					}
				}
			}
		}
		if (choiceYorN.equalsIgnoreCase("No")) { // If choose 'No', no add friend
			System.out.println("---   You are not add friend   ---");
			this.controlMenu();
		}
		System.out.println("---   Continue to add friend    ---");
		System.out.print("Please enter ('Yes' or 'No')_");
		choiceYorN = this.getYorN();
		if (choiceYorN.equalsIgnoreCase("Yes")) {
			this.doAddFriendForAdult();
		}
		if (choiceYorN.equalsIgnoreCase("No")) {
			this.controlMenu();
		}
	}

	/** If object has children, these children is adult or (teenagers and babies) */
	public boolean checkParAndParpa(Adults temp) {
		if (temp.getChildList() != null) {
			if (temp.getChildList().get(1) instanceof Adults) {
				System.out.print("---   This adult is old man and children is also adult   ---");
				System.out.println("---   He cannot be as teenagers or babies parent   ---");
				return false;
			}
		}
		return true;
	}

	/** Do with adding Friend for teenagers object */
	public void doAddFriendForTeen() {
		if (choiceYorN.equalsIgnoreCase("Yes")) {
			do {
				System.out.print("Enter friend name_");
				friendName = this.getValid();
			} while (!this.checkName(friendName));
			if (this.isTeen(friendName)) {
				People teenFriend = p;
				String friendMom = teenFriend.getMomObj().getUserName();
				String friendDad = teenFriend.getDadObj().getUserName();
				if (friendMom.equals(coupleObj.getUserName()) || friendDad.equals(coupleObj.getUserName())) {// Check
																												// same
																												// parent
					System.out.println("--- They are family relationship so cannot become friend ---");
				} else {
					addFriend(teenager, teenFriend);
					System.out.println("---   Friendship connection establish successfully   ---");
				}
			} else {
				System.out.println("---   " + friendName + " is not teenager so cannot become friend   ---");
			}
		}
		if (choiceYorN.equalsIgnoreCase("No")) {
			System.out.println("---   You are not add friend   ---");
		}
		System.out.println("---   Continue to add friend    ---");
		System.out.print("Please enter ('Yes' or 'No')_");
		choiceYorN = this.getYorN();
		if (choiceYorN.equalsIgnoreCase("Yes")) {
			this.doAddFriendForTeen();
		}
		if (choiceYorN.equalsIgnoreCase("No")) {
			this.controlMenu();
		}

	}

	/** Check name is teenager name */
	public boolean isTeen(String name) {
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i) instanceof Teenagers) {
				if (people.get(i).getUserName().equals(name)) {
					return true;
				}
			}
		}
		return false;
	}

	/** Add new child for adults */
	public void addChild(People temp) {
		if (((Adults) tempPeople).getChildList() == null && coupleObj.getChildList() == null) {
			((Adults) tempPeople).childList = new ArrayList();
			coupleObj.childList = new ArrayList();
			((Adults) tempPeople).childList.add(temp);
			coupleObj.childList.add(temp);
		} else {
			((Adults) tempPeople).childList.add(temp);
			coupleObj.childList.add(temp);
		}
	}

	/** execute choice 5 when user chooses */
	public void runChoice5() {
		do {
			System.out.println("---      Enter first user Name      ---");
			userName1 = this.getValid();
		} while (!this.checkName(userName1)); // check this name exists in the arraylist
		People firstPeople = p; // get the object who user name is equals to what input above

		do {
			System.out.println("---      Enter second user Name      ---");
			userName2 = this.getValid();
		} while (!this.checkName(userName2) || !this.checkName(userName1, userName2));// second input name is not same
																						// to first inputed name
		People secondPeople = p;
		if (isAdult(firstPeople) && isAdult(secondPeople)) { // two adults objects
			// when two adults are single at the same time
			if (((Adults) firstPeople).getCoupleObj() == null || ((Adults) secondPeople).getCoupleObj() == null) {
				System.out.println("---      They have not been couple and they are also single      ---");
				if (firstPeople.getSex().equals(secondPeople.getSex())) { // check adults sex is same or different
					System.out.println("---     Because the same sex, so they cannot become couple     ---");
				} else {
					System.out.println("---     Do you restablish marital relations to them    ---");
					System.out.print("Please enter ('Yes' or 'No')_");
					choiceYorN = this.getYorN(); // get "yes" or "no" only
					if (choiceYorN.equalsIgnoreCase("Yes")) {
						this.becomeCouple((Adults) firstPeople, (Adults) secondPeople); // add couple object with each
																						// other
						System.out.println("CONGRATULATION, ESTABLISH SUCCESSFULLY");
					} else {
						this.controlMenu();
					}
				}
			} else { // two adults has married
				if (((Adults) firstPeople).getCoupleObj().getUserName().equals(secondPeople.getUserName())) {
					System.out.println("---          They have been couple          ---");
				} else {
					System.out.println("---  They are not couple and they have been married with others   ---");
				}
			}
			System.out.println("---       Coutinue to enter name       ---");
			System.out.print("Please enter ('Yes' or 'No')_");
			choiceYorN = this.getYorN();
			if (choiceYorN.equalsIgnoreCase("Yes")) {
				this.runChoice5();
			} else {
				this.controlMenu();
			}
		} else { // two objects is not adults at the same time
			System.out.println("---  They are not couple because these two person is not adult at the same time   ---");
			System.out.println("---       Coutinue to enter name       ---");
			System.out.print("Please enter ('Yes' or 'No')_");
			choiceYorN = this.getYorN();
			if (choiceYorN.equalsIgnoreCase("Yes")) {
				this.runChoice5();
			} else {
				this.controlMenu();
			}
		}
	}

	/** Add couple objects for adults */
	public void becomeCouple(Adults adu1, Adults adu2) {
		adu1.setCoupleObj(adu2);
		adu1.setMaritalStatus("Married");
		adu2.setCoupleObj(adu1);
		adu2.setMaritalStatus("Married");
	}

	/** Check object is adult or not */
	public boolean isAdult(People p) {
		if (p instanceof Adults) {
			return true;
		}
		return false;
	}

	/** Execute choice 1 */
	public void runChoice1() {
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("***        Persons inforamtion list in miniNet          ***");
		System.out.println("***************************************************");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------");
		this.tabHead();
		for (int i = 0; i < people.size(); i++) {
			people.get(i).showInFor(); // show every object information
		}
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("***     Friendship connection information list       ***");
		System.out.println("***************************************************");
		// Show friend connection (user name | user friend name)
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i) instanceof Adults) {
				Adults temp = (Adults) people.get(i);
				if (temp.friendList == null) {
					System.out.println(temp.getUserName() + " is NO Friend");
					System.out.println("------------------------------------------------");
				} else {
					this.friendList(temp); // show friend name
					System.out.println("------------------------------------------------");
				}
			}
			if (people.get(i) instanceof Teenagers) {
				Teenagers temp = (Teenagers) people.get(i);
				if (temp.getFriendList() == null) {
					System.out.println(temp.getUserName() + " is NO Friend");
					System.out.println("------------------------------------------------");
				} else {
					this.friendList(temp); // show friend name
					System.out.println("------------------------------------------------");
				}
			}
		}
		System.out.println();
	}

	/** show friend name of inputed objects */
	public void friendList(People p) {
		System.out.print("User Name: " + p.getUserName() + " | Friend Name: ");
		if (p instanceof Adults) {
			for (int i = 0; i < ((Adults) p).getFriendList().size(); i++) {
				Adults ad = (Adults) ((Adults) p).getFriendList().get(i);
				String tName = ad.getUserName();
				System.out.print(tName);
				System.out.print(" ");
			}
		}
		if (p instanceof Teenagers) {
			for (int i = 0; i < ((Teenagers) p).getFriendList().size(); i++) {
				Teenagers tn = (Teenagers) ((Teenagers) p).getFriendList().get(i);
				String tName = tn.getUserName();
				System.out.print(tName);
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	/** Execute choice 4 */
	public void runChoice4() {
		do {
			System.out.println("---   Enter first user Name   ---");
			userName1 = this.getValid();
		} while (!this.checkName(userName1)); // check user name is in the people list
		People firstPeople = p;

		do {
			System.out.println("---   Enter second user Name   ---");
			userName2 = this.getValid();
		} while (!this.checkName(userName2) || !this.checkName(userName1, userName2)); // second name is not same first
																						// name
		People secondPeople = p;
		// check these two objects is teenagers or adults at the same time
		if (!this.inTeenOrAdu(firstPeople, secondPeople)) {
			System.out.println("---   They are not friends and they cannot become friends   ---");
			System.out.println("---         Coutinue to enter name£¿Enter 'Yes' or 'No'         ---");
			System.out.println("Please enter_");
			choiceYorN = this.getYorN();
			if (choiceYorN.equalsIgnoreCase("Yes")) {
				this.runChoice4();
			} else {
				this.controlMenu();
			}
		} else { // if two teenagers or two adults
			if (firstPeople instanceof Teenagers && secondPeople instanceof Teenagers) {
				Teenagers firstTeen = (Teenagers) firstPeople;
				Teenagers secondTeen = (Teenagers) secondPeople;
				// check two teenagers have had friend or not
				if (firstTeen.getFriendList() == null || secondTeen.getFriendList() == null) { // these two teenagers
																								// have had not friends
					this.doForUnFriend(firstTeen, secondTeen);
				} else { // when have friends
					if (this.checkFriend(firstTeen, secondTeen)) { // when this two teenagers have had friend
						this.doForhasFriend(firstTeen, secondTeen);
					} else { // when not friend
						this.doForUnFriend(firstTeen, secondTeen);
					}
				}
			}
			// When two adults
			if (firstPeople instanceof Adults && secondPeople instanceof Adults) {
				Adults firstAdu = (Adults) firstPeople;
				Adults secondAdu = (Adults) secondPeople;
				// Check two adults have friend or not
				if (firstAdu.getFriendList() == null || secondAdu.getFriendList() == null) {
					this.doForUnFriend(firstAdu, secondAdu);
				} else {
					if (this.checkFriend(firstAdu, secondAdu)) {// when has been friend
						this.doForhasFriend(firstAdu, secondAdu);
					} else {// when not be friend
						this.doForUnFriend(firstAdu, secondAdu);
					}
				}
			}
		}
	}

	/** Process next task when these two objects have been friend */
	public void doForhasFriend(People firstP, People secP) {
		// Ask user, do you need to delete
		System.out.println("---                      They have been friend                   ---");
		System.out.println("---  Do you want to remove friendship connection?  ---");
		System.out.print("Please input ('Yes' or 'No')_ ");
		choiceYorN = this.getYorN();
		if (choiceYorN.equalsIgnoreCase("Yes")) {
			// If input yes, delete friendship connection
			this.deleteFriend(firstP, secP);
			System.out.println("---      DELETE SUCCESSFULLY      ---");
		} else {
			this.controlMenu();
		}
	}

	/** Process next task when these two objects have not been friend */
	public void doForUnFriend(People firstP, People secP) {
		// Ask user, do you need to add friendship connection
		System.out.println("---                They have not been friend             ---");
		System.out.println("---  Do you want to establish friendship between them  ---");
		System.out.print("Please input ('Yes' or 'No')_ ");
		choiceYorN = this.getYorN();
		if (choiceYorN.equalsIgnoreCase("Yes")) {
			// Check these two has the same parent, if yes, brother or sister cannot become
			// friend
			if (isFamily(firstP, secP)) {
				System.out.println("--  They cannot become friend because they have the same parent --");
				this.controlMenu();
			} else { // if not be brother or sister
				if (firstP instanceof Teenagers && secP instanceof Teenagers) {// if two objects are teenager
					this.addFriend(firstP, secP);
					System.out.println("---         ADD SUCCESSFULLY       ---");
				}
				if (firstP instanceof Adults && secP instanceof Adults) { // if two objects are adults
					// check these two adults objects is couple or not
					if (((Adults) firstP).getCoupleObj() == null || ((Adults) secP).getCoupleObj() == null) {// if
																												// single
						this.addFriend(firstP, secP);
						System.out.println("---         ADD SUCCESSFULLY       ---");
					} else {
						if (((Adults) firstP).getCoupleObj().getUserName().equals(((Adults) secP).getUserName())) {// if
																													// is
																													// couple
							System.out.println(
									"---      They cannnot become friend because they have been couple      ---");
							this.controlMenu();
						} else {// if married with others, it means not couple
							this.addFriend(firstP, secP);
							System.out.println("---         ADD SUCCESSFULLY       ---");
						}
					}
				}
			}
		} else {
			this.controlMenu();
		}
	}

	/** Check adults or teenagers have friend or not */
	public boolean checkFriend(People p1, People p2) {
		if (p1 instanceof Teenagers && p2 instanceof Teenagers) {
			for (int i = 0; i < ((Teenagers) p1).getFriendList().size(); i++) {
				Teenagers tTemp = ((Teenagers) p1).getFriendList().get(i);
				if (tTemp.getUserName().equals(p2.getUserName())) {
					return true;
				}
			}
		}
		if (p1 instanceof Adults && p2 instanceof Adults) {
			for (int i = 0; i < ((Adults) p1).getFriendList().size(); i++) {
				Adults aTemp = ((Adults) p1).getFriendList().get(i);
				if (aTemp.getUserName().equals(p2.getUserName())) {
					return true;
				}
			}
		}
		return false;
	}

	/** Delete object from friendList */
	public void deleteFriend(People p1, People p2) {
		if (p1 instanceof Teenagers && p2 instanceof Teenagers) {
			((Teenagers) p1).getFriendList().remove(p2);
			((Teenagers) p2).getFriendList().remove(p1);
			if (((Teenagers) p1).getFriendList().size() == 0) {
				((Teenagers) p1).setFriendList(null);
			}
			if (((Teenagers) p2).getFriendList().size() == 0) {
				((Teenagers) p2).setFriendList(null);
			}
		}

		if (p1 instanceof Adults && p2 instanceof Adults) {
			((Adults) p1).getFriendList().remove(p2);
			((Adults) p2).getFriendList().remove(p1);
			if (((Adults) p1).getFriendList().size() == 0) {
				((Adults) p1).setFriendList(null);
			}
			if (((Adults) p2).getFriendList().size() == 0) {
				((Adults) p2).setFriendList(null);
			}
		}
	}

	/** Add object into friendlist */
	public void addFriend(People p1, People p2) {
		if (p1 instanceof Teenagers && p2 instanceof Teenagers) {
			if (((Teenagers) p1).getFriendList() == null) {
				((Teenagers) p1).friendList = new ArrayList<Teenagers>();
				((Teenagers) p1).friendList.add((Teenagers) p2);
			} else {
				((Teenagers) p1).friendList.add((Teenagers) p2);
			}
			if (((Teenagers) p2).getFriendList() == null) {
				((Teenagers) p2).friendList = new ArrayList<Teenagers>();
				((Teenagers) p2).friendList.add((Teenagers) p1);
			} else {
				((Teenagers) p2).friendList.add((Teenagers) p1);
			}
		}

		if (p1 instanceof Adults && p2 instanceof Adults) {
			if (((Adults) p1).getFriendList() == null) {
				((Adults) p1).friendList = new ArrayList<Adults>();
				((Adults) p1).friendList.add((Adults) p2);
			} else {
				((Adults) p1).friendList.add((Adults) p2);
			}
			if (((Adults) p2).getFriendList() == null) {
				((Adults) p2).friendList = new ArrayList<Adults>();
				((Adults) p2).friendList.add((Adults) p1);
			} else {
				((Adults) p2).friendList.add((Adults) p1);
			}
		}
	}

	/** Check two objects are brother or sister */
	public boolean isFamily(People p1, People p2) {
		if (p1 instanceof Teenagers && p2 instanceof Teenagers) {
			String p1FatherName = p1.getDadObj().getUserName();
			String p2FatherName = p2.getDadObj().getUserName();
			if (p1FatherName.equals(p2FatherName)) {
				return true;
			} else
				return false;
		}
		if (p1 instanceof Adults && p2 instanceof Adults) {
			if (p1.getDadObj() == null || p2.getDadObj() == null) {
				return false;
			} else {
				String p1FatherName = p1.getDadObj().getUserName();
				String p2FatherName = p2.getDadObj().getUserName();
				if (p1FatherName.equals(p2FatherName)) {
					return true;
				} else
					return false;
			}
		}
		return false;
	}

	/** Check two objects is teenager or adult */
	public boolean inTeenOrAdu(People people1, People people2) {
		if (people1 instanceof Teenagers && people2 instanceof Teenagers) {
			return true;
		} else {
			if (people1 instanceof Adults && people2 instanceof Adults) {
				return true;
			} else {
				return false;
			}
		}
	}

	/** Check two name is the same or different */
	public boolean checkName(String name1, String name2) {
		if (name1.equals(name2)) {
			System.out.println("YOU CANNOT INPUT THE SAME NAME");
			System.out.println("PLEASE ENTER SECOND NAME AGAIN");
			return false;
		}
		return true;
	}

	/** @overload Show all friend information of selected adult */
	public void showSelectedFriend(Adults temp) {
		for (int i = 0; i < temp.getFriendList().size(); i++) {
			String userFriendName = temp.getFriendList().get(i).getUserName();
			Adults aduTemp = (Adults) this.getPeopleObj(userFriendName);
			aduTemp.showInFor();
		}
	}

	/** @overload Show all friend information of selected teenager */
	public void showSelectedFriend(Teenagers temp) {
		for (int i = 0; i < temp.getFriendList().size(); i++) {
			String userFriendName = temp.getFriendList().get(i).getUserName();
			Teenagers teenTemp = (Teenagers) this.getPeopleObj(userFriendName);
			teenTemp.showInFor();
		}
	}

	/** Print people attributes */
	public void tabHead() {
		System.out.printf("%-15s", "|Name");
		System.out.printf("%-25s", "|Status");
		System.out.printf("%-7s", "|Sex");
		System.out.printf("%-7s", "|Age");
		System.out.printf("%-15s", "|Mom Name");
		System.out.printf("%-15s", "|Dad Name");
		System.out.printf("%-15s", "|Couple Name");
		System.out.printf("%-15s", "|MaritalStatus");
		System.out.println("|");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------");
	}

	/** Execute choice 2 */
	public void runChoice2() {
		System.out.print("Enter your selected name_");
		do {
			userName = this.getValid();
		} while (!checkName(userName));
		System.out.println("------  " + userName + " information List   ------");
		this.tabHead();
		p.showInFor(); // Showing object all information
		this.controlModifMenu();
	}

	/** Check name is in arraylist */
	public boolean checkName(String name) {
		for (int i = 0; i < people.size(); i++) {
			p = people.get(i);
			if (p.getUserName().equals(name)) {
				return true;
			}
		}
		System.out.println(name + " IS NOT IN MININET PLEASE ENTER AGAIN");
		return false;
	}

	/** Sub Menu below choice 2 */
	public void modifMenu() {
		System.out.println("********************************");
		System.out.println("**    Query & modify Menu      **");
		System.out.println("********************************");
		System.out.println("** 1 Print parent information  **");
		System.out.println("** 2 Print children information*");
		System.out.println("** 3 Print friends information  **");
		System.out.println("** 4 Update the information    **");
		System.out.println("** 5 Delete the user:                   **");
		System.out.println("** 6 Back to main menu            **");
		System.out.println("********************************");
	}

	/** Execute sub menu below choice 2 */
	public void controlModifMenu() {
		final int firstMenuNum = 1;
		final int lastMenuNum = 6;
		while (true) {
			this.modifMenu();
			System.out.print("Enter an option_ ");
			choiceMenu = this.checkMenuNum(firstMenuNum, lastMenuNum);
			switch (choiceMenu) {
			case 1:
				// Show parent information
				if (!this.hasParentInFo(p)) {
					System.out.println("---No parent information found in mininet---");
					System.out.println();
				} else {
					String momName = p.getMomObj().getUserName();
					String dadName = p.getDadObj().getUserName();
					Adults mother = (Adults) this.getPeopleObj(momName);
					Adults father = (Adults) this.getPeopleObj(dadName);
					System.out.println("*****************************");
					System.out.println("** Parent Information List  **");
					System.out.println("*****************************");
					this.tabHead();
					this.printParentInFo(mother, father);
					System.out.println();
				}
				break;
			case 2:
				// Show children information
				System.out.println("*****************************");
				System.out.println("**Children Information List**");
				System.out.println("*****************************");
				if (this.isAdult(p)) {
					if (!hasChild((Adults) p)) {
						System.out.println(p.getUserName() + " has no child");
						System.out.println("---No children information---");
					} else {
						this.tabHead();
						for (int i = 0; i < ((Adults) p).getChildList().size(); i++) {
							People child = (People) ((Adults) p).getChildList().get(i);
							child.showInFor();
						}
					}
				} else {
					System.out.println("---    " + p.getUserName() + " is not adult     ---");
					System.out.println("---    No children information    ---");
				}
				System.out.println();
				break;
			case 3:
				// Show friend information
				System.out.println("***************************************************");
				System.out.println("***     Friendship connection information list       ***");
				System.out.println("***************************************************");
				if (p instanceof Babies) {
					System.out.println("---  " + userName + " is a baby so there is no any friend   ---");
				} else {
					if (p instanceof Teenagers) {
						if (((Teenagers) p).getFriendList() == null) {
							System.out.println("---  " + p.getUserName() + " is NO Friend    ---");
						} else {
							this.tabHead();
							this.showSelectedFriend((Teenagers) p);
						}
					}
					if (p instanceof Adults) {
						if (((Adults) p).getFriendList() == null) {
							System.out.println("---  " + p.getUserName() + " is NO Friend   ---");
						} else {
							this.tabHead();
							this.showSelectedFriend((Adults) p);
						}
					}
				}
				System.out.println();
				break;
			case 4:
				// Modify or update normal information
				this.controlUpdInFoMenu();
				System.out.println();
				break;
			case 5:
				// Delete this object
				if (this.hasParentInFo(p)) { // If this object has parent, delete this object from its parent objects'
												// childList
					String momName = p.getMomObj().getUserName();
					String dadName = p.getDadObj().getUserName();
					Adults mother = (Adults) this.getPeopleObj(momName);
					Adults father = (Adults) this.getPeopleObj(dadName);
					this.removeChildFromParent(mother);
					this.removeChildFromParent(father);
				}
				// If this object is baby, remove this object directly
				if (p instanceof Babies) {
					people.remove(p);
				}
				// If this object is teenager
				if (p instanceof Teenagers) {
					if (!hasFriend((Teenagers) p)) { // If this teenager has no friend, remove directly
						people.remove(p);
					} else { // If this teenager has friend
						for (int i = 0; i < ((Teenagers) p).getFriendList().size(); i++) { // Find out all relation
																							// object, and delete this
																							// object from that objects'
																							// friendList
							String friendName = ((Teenagers) p).getFriendList().get(i).getUserName();
							Teenagers teenFriend = (Teenagers) this.getPeopleObj(friendName);
							this.removeFriend(teenFriend);
						}
						people.remove(p);
					}
				}
				// If this object is adult
				if (p instanceof Adults) {
					if (hasFriend((Adults) p)) { // If this adult has friend, find out all friend object, delete this
													// object for that friend objects' friendList
						for (int i = 0; i < ((Adults) p).getFriendList().size(); i++) {
							String friendName = ((Adults) p).getFriendList().get(i).getUserName();
							Adults aduFriend = (Adults) this.getPeopleObj(friendName);
							this.removeFriend(aduFriend);
						}
					}
					// If this adult has not married
					if (!hasMarried((Adults) p)) {
						people.remove(p);
					}
					if (hasMarried((Adults) p)) {
						String coupleName = ((Adults) p).getCoupleObj().getUserName();
						Adults coupleObj = (Adults) this.getPeopleObj(coupleName); // Get couple object

						/**
						 * Because adult is likely father or grandpa so we need to know this adult is
						 * who If this adult is father, his children are always teenagers or baby If
						 * this adult is grandPa, his children are also adults If no children for this
						 * object, we will not consider that above, remove directly Main process: Get
						 * first child, and judge this child is adult or teen or baby
						 */
						if (hasChild((Adults) p) && hasChild(coupleObj)) { // If has children
							if (((Adults) p).childList.get(1) instanceof Teenagers
									|| ((Adults) p).childList.get(1) instanceof Babies) { // if child is teen or baby,
																							// that menu this adult is
																							// father or mom

								for (int i = 0; i < ((Adults) p).getChildList().size(); i++) {
									if (((Adults) p).getChildList().get(i) instanceof Babies) { // If child is baby,
																								// remove this baby
																								// first.
																								// cuz after we remove
																								// this adult, these
																								// child will have not
																								// parent.
																								// That is this child
																								// will be not exist in
																								// miniNet, cuz each
																								// child must have
																								// parent.
										String babyName = ((Babies) ((Adults) p).getChildList().get(i)).getUserName();
										Babies baby = (Babies) this.getPeopleObj(babyName);
										people.remove(baby);
									}
									// If this child is teenager
									if (((Adults) p).getChildList().get(i) instanceof Teenagers) {
										String teenName = ((Teenagers) ((Adults) p).getChildList().get(i))
												.getUserName();
										Teenagers teen = (Teenagers) this.getPeopleObj(teenName); // Get each
																									// teenager(this
																									// adult's child)
										if (teen.getFriendList() != null) { // If this teenager has friend
											for (int j = 0; j < teen.getFriendList().size(); j++) { // Find out each
																									// relation teenager
																									// from friendList
												String teenFriendName = teen.getFriendList().get(j).getUserName();
												Teenagers teenager = (Teenagers) this.getPeopleObj(teenFriendName); // Get
																													// these
																													// relation
																													// teenagers
																													// objects
												this.removeFriend(teenager, teen); // Remove teenagers(this adult's
																					// child) from each relation teens
																					// friendList
											}
										}
										people.remove(teen);
									}
								}
							}

							if (((Adults) p).childList.get(1) instanceof Adults) { // If this adult child is also adult,
																					// that mean is grandpa
								for (int i = 0; i < ((Adults) p).getChildList().size(); i++) {
									String adultName = ((Adults) ((Adults) p).getChildList().get(i)).getUserName();
									Adults adult = (Adults) this.getPeopleObj(adultName); // Get this adult
																							// object(child)
									adult.setDadObj(null); // Delete his parent object for this adult
									adult.setMomObj(null);
									/**
									 * Because adult can have not parent information, so we do not continue to
									 * consider next tasks
									 */
								}
							}
						}
						coupleObj.setChildList(null); // Delete all child objects for this adult's another person, (wife
														// or husband)
						this.removeCoupleInFo(coupleObj); // Change married status to 'Single' and delete couple object
						people.remove((Adults) p); // Remove this adult from arrayList
					}
				}
				System.out.println("---   DELETE SUCCESSFULLY   ---");
				System.out.println();
				this.controlMenu();
				break;
			case 6:
				this.controlMenu();
				break;
			}
		}
	}

	/** Get object from arraylist */
	public People getPeopleObj(String name) {
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i) instanceof Babies) {
				Babies temp = (Babies) people.get(i);
				if (temp.getUserName().equals(name)) {
					return temp;
				}
			}
			if (people.get(i) instanceof Adults) {
				Adults temp = (Adults) people.get(i);
				if (temp.getUserName().equals(name)) {
					return temp;
				}
			}
			if (people.get(i) instanceof Teenagers) {
				Teenagers temp = (Teenagers) people.get(i);
				if (temp.getUserName().equals(name)) {
					return temp;
				}
			}
		}
		return null;
	}

	/** Check adult has child or not */
	public boolean hasChild(Adults temp) {
		if (temp.childList != null) {
			return true;
		}
		return false;
	}

	/** Delete couple object and change to 'Single' from 'Married' */
	public void removeCoupleInFo(Adults temp) {
		temp.setCoupleObj(null);
		temp.setMaritalStatus("Single");
	}

	/** Check adult has had married or not */
	public boolean hasMarried(Adults temp) {
		if (temp.getMaritalStatus().equalsIgnoreCase("Married")) {
			return true;
		}
		System.out.println("---       This adult has been single      ---");
		return false;
	}

	/** @overload Delete friend for two teenagers */
	public void removeFriend(Teenagers temp1, Teenagers temp2) {
		temp1.friendList.remove(temp2);
		if (temp1.getFriendList().size() == 0) {
			temp1.setFriendList(null);
		}
	}

	/** @overload Delete friend */
	public void removeFriend(People temp) {
		if (temp instanceof Adults) {
			((Adults) temp).friendList.remove(p);
			if (((Adults) temp).getFriendList().size() == 0) {
				((Adults) temp).friendList = null;
			}
		}
		if (temp instanceof Teenagers) {
			((Teenagers) temp).friendList.remove(p);
			if (((Teenagers) temp).getFriendList().size() == 0) {
				((Teenagers) temp).friendList = null;
			}
		}
	}

	/** Delete child object from adults' childList */
	public void removeChildFromParent(Adults temp) {
		temp.childList.remove(p);
		if (temp.getChildList().size() == 0) {
			temp.childList = null;
		}
	}

	/** Check Object has parent or not */
	public boolean hasParentInFo(People temp) {
		if (temp.getMomObj() == null && temp.getDadObj() == null) {
			return false;
		}
		if (temp.getMomObj() != null && temp.getDadObj() != null) {
			return true;
		}
		return false;
	}

	/** Show parent information */
	public void printParentInFo(Adults mom, Adults dad) {
		mom.showInFor();
		dad.showInFor();
	}

	/** Check object has friend or not */
	public boolean hasFriend(People temp) {
		if (temp instanceof Adults) {
			if (((Adults) temp).getFriendList() == null) {
				return false;
			} else
				return true;
		}
		if (temp instanceof Teenagers) {
			if (((Teenagers) temp).getFriendList() == null) {
				return false;
			} else
				return true;
		}
		return false;
	}

	/** Execute sub Menu and update normal information */
	public void controlUpdInFoMenu() {
		this.updInFoMeau();
		final int firstMenuNum = 1;
		final int lastMenuNum = 3;
		while (true) {
			choiceMenu = this.checkMenuNum(firstMenuNum, lastMenuNum);
			if (choiceMenu == 1) {
				System.out.println("Enter new status:");
				String newStatus = scan.next();
				p.setStatus(newStatus);
				System.out.println("---   UPDATE SUCCESFULLY   ---");
				System.out.println("---   DO YOU CONTINUE TO UPDATE(Yes or No)   ---");
				System.out.println("Please input_");
				choiceYorN = this.getYorN();
				if (choiceYorN.equalsIgnoreCase("Yes")) {
					this.controlUpdInFoMenu();
				}
				if (choiceYorN.equalsIgnoreCase("No"))
					this.controlMenu();
			}
			if (choiceMenu == 2) {
				System.out.println("Enter new age:");
				int newAge = this.checkAge();
				p.setAge(newAge);
				System.out.println("UPDATE SUCCESFULLY");
				System.out.println("DO YOU CONTINUE TO UPDATE(Yes or No)");
				choiceYorN = this.getYorN();
				if (choiceYorN.equalsIgnoreCase("Yes")) {
					this.controlUpdInFoMenu();
				}
				if (choiceYorN.equalsIgnoreCase("No"))
					this.controlModifMenu();
			}
			if (choiceMenu == 3) {
				this.controlModifMenu();
			}
		}

	}

	/** Update normal attributes menu */
	public void updInFoMeau() {
		System.out.println("1 User Status:");
		System.out.println("2 User Age:");
		System.out.println("3 Back to main meau:");
		System.out.println("Enter the number:");
	}

//	public static void main(String[] args) {
//		Driver d = new Driver();
//		d.controlMenu();
//	}

	/** Get valid integer number in the range of different menu */
	public int checkMenuNum(int minMenuNum, int maxMenuNum) {
		int num;
		do {
			String str = scan.next();
			if (this.isNumeric(str)) { // Check is number or not
				num = Integer.parseInt(str);
				if (this.isMenuRange(num, minMenuNum, maxMenuNum)) { // Check this number is current menu range
					break;
				} else {
					System.out.println("---    PLEASE ENTER NUMBER BETWEEN THE MENU   ---");
					System.out.print("Enter an option again_");
				}
			} else {
				System.out.println("---   PLEASE ENTER CORRECT INTEGER NUMBER   ---");
				System.out.print("Enter an option again_");
			}
		} while (true);
		return num;
	}

	/** Check input result is number or not */
	public boolean isNumeric(String str) {
		if (str == null) {
			System.out.println("---   CANNOT EMPTY ---");
			return false;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (!Character.isDigit(str.charAt(i))) {
					return false;
				}
			}
			return true;
		}
	}

	/** Check input result is in current menu range */
	public boolean isMenuRange(int num, int min, int max) {
		if (num >= min && num <= max) {
			return true;
		}
		return false;
	}

	/** Get a valid string */
	public String getValid() {
		String str;
		do {
			str = scan.next();
			if (str != null) {
				if (isString(str)) // Check only a-z or A-Z
					break;
				else
					System.out.println("---      INVAID INPUT      ---");
				System.out.print("PLEASE ENTER AGAIN-");
			} else {
				System.out.println("---   CANNOT EMPTY ---");
			}
		} while (true);
		return str;
	}

	/** Check input result is string */
	public boolean isString(String str) {
		if (str.matches("[a-zA-Z]+"))
			return true;
		else
			return false;
	}

	/** Get judgment signal */
	public String getYorN() {
		String validInput = null;
		do {
			validInput = this.getValid();
			if (validInput.equalsIgnoreCase("Yes") || validInput.equalsIgnoreCase("No")) {
				break;
			} else
				System.out.println("--- ONLY ENTER 'YES' OR 'NO' ---");
			System.out.print("ENTER AGAIN-");
		} while (true);
		return validInput;
	}

	/** Get people age */
	public int checkAge() {
		int num;
		do {
			String str = scan.next();
			if (this.isNumeric(str)) {
				num = Integer.parseInt(str);
				if (num <= 0) {
					System.out.println("---    AGE SHOULD BE POSTIVE NUMBER     ---");
					System.out.println("---   PLEASE ENTER CORRECT INTEGER NUMBER AGAIN   ---");
				} else if (num > 0 && num <= 150) {// People age is in 1-150
					break;
				} else {
					System.out.println("---   AGE IS VERY LARGE, IS BETWEEN 1-150   ---");
					System.out.print("PLEASE ENTER VALID NUMBER AGAIN_ ");

				}
			} else {
				System.out.print("PLEASE ENTER CORRECT INTEGER NUMBER_ ");
			}
		} while (true);
		return num;
	}

}
