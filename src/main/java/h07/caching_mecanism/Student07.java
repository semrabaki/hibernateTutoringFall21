package h07.caching_mecanism;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Cacheable
@Cache(region="Student07", usage=CacheConcurrencyStrategy.READ_WRITE)
public class Student07 {
	@Id
	private int std_id;
	private String name;
	private int grade;
	
	@OneToMany(mappedBy="student")
	private List<Book07>bookList= new ArrayList();

	Student07() {
		
	}

	Student07(int std_id, String name, int grade, List<Book07> bookList) {
	
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

	public List<Book07> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book07> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Student06 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
	


}
