package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student04 {
	
	@Id
	private int std_id;
	private String name;
	private int grade;
	
	
	@OneToMany(mappedBy="student", orphanRemoval=true,cascade= CascadeType.REMOVE) // it allows removing parent class while there is child class
	private List<Book04> booklist = new ArrayList();  //one owner might have more than one book that is why we have list
	
	
	
	
	public Student04() {
		
	}
	


	Student04(int std_id, String name, int grade) {
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
		this.booklist = booklist;
	}



	public int getStudent_id() {
		return std_id;
	}

	public void setStudent_id(int student_id) {
		this.std_id = student_id;
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

	public List<Book04> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<Book04> booklist) {
		this.booklist = booklist;
	}



	@Override
	public String toString() {
		return "Student04 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + "]";
	}




	
	
	

}
