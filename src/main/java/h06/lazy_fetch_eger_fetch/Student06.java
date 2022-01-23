package h06.lazy_fetch_eger_fetch;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student06 {
	
	@Id
	private int std_id;
	private String name;
	private int grade;
	
	@OneToMany(mappedBy="student", fetch=FetchType.EAGER)
	private List<Book06>bookList= new ArrayList();

	Student06() {
		
	}

	Student06(int std_id, String name, int grade, List<Book06> bookList) {
	
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
		this.bookList = bookList;
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

	public List<Book06> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book06> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Student06 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
	
	

}
