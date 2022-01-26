package h05.manytomany;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Student05 {
	@Id
	private int std_id;
	@Column(name="student_name")
	private String name;
	private int grade;
	
	//@JoinTable  annotation is used for since there is extra connection table created in many to many. makes the relation bidirectional
	//in one to many we were using joincolumn since there is one connection column
	//with the jointable we are showing the path like first std id then book id than book table,
	//if i come from book table first I go to book id than std id then student tbale
	
	@ManyToMany(cascade = CascadeType.ALL)// when we make updates, deletes, creations we force them using cascadeType.ALL
	@JoinTable(name="STUDENT05_BOOK05", joinColumns = {@JoinColumn(name="std_id")},inverseJoinColumns = {@JoinColumn(name="book_id")} )
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
//
//	@Override
//	public String toString() {
//		return "Student05 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + ", booksList=" + booksList + "]";
//	}

	@Override
	public String toString() {
		return "Student05 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + "]";
	}

	
	

}
