package hb3.onetoonejoins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Dairy {
	
	


	@Id
	private int dairy_id;
	private String dairy;
	@OneToOne
	@JoinColumn(name="student_id")
	private Student03 student;
	
	public Dairy() {
		
	}


	public Dairy(int dairy_id, String dairy) {
		
		this.dairy_id = dairy_id;
		this.dairy = dairy;
	}
	
	public Student03 getStudent() {
		return student;
	}


	public void setStudent(Student03 student) {
		this.student = student;
	}


	public int getDairy_id() {
		return dairy_id;
	}


	public void setDairy_id(int dairy_id) {
		this.dairy_id = dairy_id;
	}


	public String getDairy() {
		return dairy;
	}


	public void setDairy(String dairy) {
		this.dairy = dairy;
	}


	@Override
	public String toString() {
		return "Dairy [dairy_id=" + dairy_id + ", dairy=" + dairy + ", student=" + student + "]";
	}


	
	
	
	
	
	

}