package h05.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student05 {
	@Id
	private int std_id;
	private String name;
	private int grade;
	
	@ManyToMany(cascade=CascadeType.ALL)//When we make updates, deletes, creations we force them using cascaseType.ALL
	private List<Book05> booksList= new ArrayList();
	
	Student05() {
	
	}
	
	Student05(int std_id, String name, int grade, List<Book05> booksList) {

		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
		this.booksList = booksList;
	}

	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
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
	
	
	public List<Book05> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book05> booksList) {
		this.booksList = booksList;
	}

	@Override
	public String toString() {
		return "Student05 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + ", booksList=" + booksList + "]";
	}

	
	

}
