package management;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class StudentRecord extends StudLectRecord{
	
	
	private Map<String, Float> grades = new HashMap<>();
	private static String file = "student.txt";
	
	public StudentRecord(Map<String, Float> grades,String firstName, String lastName, String matNumber, String university, Date dob) {
		super(firstName, lastName, matNumber, university, dob);
		this.setGrades(grades);
	}
	

	public Map<String, Float> getGrades() {
		return grades;
	}


	public void setGrades(Map<String, Float> grades) {
		this.grades = grades;
	}


	@Override
	public void createRecord(String data) {
		createOrAppendFile(file, data);
		
	}

	@Override
	public void saveRecord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRecord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRecord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchRecord() {
		// TODO Auto-generated method stub
		
	}

}
