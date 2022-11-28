package studio9;

import java.util.HashMap;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final HashMap<String,Student> map = new HashMap <String, Student>();
	public void addStudent(String accountName, Student student) {
		map.put(accountName, student);
		// TODO
	}

	public int getStudentCount() {
		// TODO
		int count = 0;
		for (String i : map.keySet()) {
			count++;
		}
		return count;
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		Student person = map.get(accountName);
		if (person != null) {
			return person.getFullName();
		} else {
			return null;
		}
		
	}

	public double getTotalBearBucks() {
		// TODO
		double count = 0;
		for (String i : map.keySet()) {
			Student person = map.get(i);
			count+= person.getBearBucksBalance();
		}
		return count;
	}
}
