package management;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Management {

	public static void main(String[] args) {
		String firstName = null;
		String lastName = null;
		String matNumber = null;
		String university = null;
		Date dob = new Date();
		Map<String, Float> grades = new HashMap<>();
		List<String> courses = new  ArrayList<>();
		
		StudentRecord record = new StudentRecord(grades,firstName,lastName,matNumber, university,dob);
		
		
		firstName = "Lea";
		record.setDob(dob);
		record.setFirstName(firstName);
		System.out.println(record.toString());
		record.createRecord(record.toString());

	}

}
