package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int idNum;
	private double grade;
	private int credits;
	private double cumulativeGrade;
	private double GPA;
	private double BBBalance;
	private int totalCredits;
	private int passingCredits;
	
	public Student(String FN,String LN, int ID) {//constructor
		firstName= FN;
		lastName= LN;
		idNum= ID;
	}
	public String getFullName() {
		return firstName + " " + lastName;
	}

	public int getId() {
		return idNum;
	}
	public void depositBearBucks(double amount) { //Mutator method
		BBBalance = BBBalance + amount;
	}

	public void deductBearBucks(double amount) {//Mutator method
		BBBalance = BBBalance - amount;
	}

	public double getBearBucksBalance() {
		return BBBalance;
	}
}
