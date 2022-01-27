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
//@Cacheable
//@Cache(region="Student07", usage=CacheConcurrencyStrategy.READ_WRITE) //Read_Write means that the data in the second cache mmeory can be read and updated
public class Student07 {
	@Id
	private int std_id;
	private String name;
	private int grade;
	
	@OneToMany(mappedBy="student")
	private List<Book07>bookList= new ArrayList();
	
	//Every database has a hit limit.once it reaches the limit it will be blocked. that is why we need to limit the number of hit.
		//that is why hibernate has cache memory and puts the data in cach and for already reached data hibernate used the cache memory so it does not hit
		//the database. It keeps the data inthe caching mechanism until the session closed.
		//Hibernate uses caching mechanism as default. hibernate alsa has the second level caching mechanism.
		//

	//Second level caching memory is like a second stogare when any session fetch the data it will be put inthe second caching memory. Whne the session closed 
	//the first caching memory is cleared but second caching memory wtill has the data. application first check the first caching and then second caching for data
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
