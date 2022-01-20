package hb3.ontoone_joins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class C32_Diary {
	
	@Id
	private int id;
	private String diaryName;
	
	@OneToOne
	@JoinColumn(name= "std_id") //how I am joining tables with std_id
	private C31_Students student;
	
	public C32_Diary (){
		
	}

	

	public C32_Diary(int id, String diaryName) {
	
		this.id = id;
		this.diaryName = diaryName;
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiaryName() {
		return diaryName;
	}

	public void setDiaryName(String diaryName) {
		this.diaryName = diaryName;
	}

	public C31_Students getStudent() {
		return student;
	}

	public void setStudent(C31_Students student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "C32_Diary [id=" + id + ", diaryName=" + diaryName + "]";
	}


	

}
