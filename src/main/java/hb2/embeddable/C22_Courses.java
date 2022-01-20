package hb2.embeddable;

import javax.persistence.Embeddable;
//@Embeddable is using for inserting as table in another table - your class will be part of an other table
@Embeddable
public class C22_Courses {
	
	
	private String elective;
	private String mendatory;
	
	public C22_Courses() {
	
	}
	public C22_Courses(String elective, String mendatory) {
	
		this.elective = elective;
		this.mendatory = mendatory;
	}
	public String getElective() {
		return elective;
	}
	public void setElective(String elective) {
		this.elective = elective;
	}
	public String getMendatory() {
		return mendatory;
	}
	public void setMendatory(String mendatory) {
		this.mendatory = mendatory;
	}
	@Override
	public String toString() {
		return "elective=" + elective + ", mendatory=" + mendatory;
	}
	
	
	

}
