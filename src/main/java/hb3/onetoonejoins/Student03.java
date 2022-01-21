package hb3.onetoonejoins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Student03 {
	
	@Id
	private int student_id;
	@Column(name="student_name")
	private String name;
	private int grade;
	
	@OneToOne(mappedBy="student")
	private Dairy dairy;
	
	
	public Student03() {
		
	}

	
	
	public Student03(int student_id, String name, int grade, Dairy dairy) {
	
		this.student_id = student_id;
		this.name = name;
		this.grade = grade;
		this.dairy = dairy;
	}





	public Dairy getDairy() {
		return dairy;
	}

	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student03 [student_id=" + student_id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
	
	

}