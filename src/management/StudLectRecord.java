package management;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public abstract class StudLectRecord  implements Record {
	private String firstName;
	private String lastName;
	private String matNumber;
	private String university;
	private Date dob;
	
	public StudLectRecord(String firstName, String lastName, String matNumber, String university, Date dob){
		this.firstName = firstName;
		this.lastName = lastName;
		this.matNumber = matNumber;
		this.university = university;
		this.dob = dob;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setMatNumber(String matNumber){
		this.matNumber = matNumber;
	}
	
	public String getMatNumber(){
		return matNumber;
	}
	
	public void setUniversity(String university){
		this.university = university;
	}
	
	public String getUniversity(){
		return university;
	}
	
	public void setDob(Date dob){
		this.dob = dob;
	}
	
	public Date getDob(){
		return dob;
	}
	
	@Override
	public String toString(){
		
		return String.format("Your information include Name: %s %s%n Date of Birth: %s%nMtriculation Number: %s%nUniversity: %s%n", getFirstName(),getLastName(),getDob(),getMatNumber(),getUniversity());
		
	}
	
	public static void createOrAppendFile(String fileName, String data){
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			File file = new File(fileName);

			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write(data);

			System.out.println("Finished writing");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}
}
