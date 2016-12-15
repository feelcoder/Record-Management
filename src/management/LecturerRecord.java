package management;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LecturerRecord extends StudLectRecord{
	private List<String> courses =new  ArrayList<>();
	public LecturerRecord(List<String> courses,String firstName, String lastName, String matNumber, String university, Date dob) {
		super(firstName, lastName, matNumber, university, dob);
		this.setCourses(courses);
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public void createRecord(String data) {
		// TODO Auto-generated method stub
		
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
