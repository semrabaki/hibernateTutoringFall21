package hb3.ontoone_joins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class C31_Students {

	   @Id
	   private int std_id;
	   @Column(name="std_name")
	   private String name;
	   private int grade;
	   
	   
	   @OneToOne(mappedBy= "student")  //this student mapping with diary
	   private C32_Diary dairy;
	   
	   public C31_Students() {
		   
	   }

	

	public C31_Students(int std_id, String name, int grade, C32_Diary dairy) {
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
		this.dairy = dairy;
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

	public C32_Diary getDairy() {
		return dairy;
	}

	public void setDairy(C32_Diary dairy) {
		this.dairy = dairy;
	}

	@Override
	public String toString() {
		return "C31_Students [std_id=" + std_id + ", name=" + name + ", grade=" + grade + "]";
	}
	   
	   

}
