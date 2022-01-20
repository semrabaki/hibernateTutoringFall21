package h01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//Entity create a table in our database and class instance will be our raws in table
//Entity with name="" it will change table name in java and in database.
@Entity
@Table(name="student_table")  //you can see only on database
public class C11_Student {
	
	
	//@Id annotation for using to create primary key in our table
	@Id
	private int student_id;
	
	//@Column(name="std_name") with it we can give the name our column in database
	@Column(name="std_name")
	private String name;
	
	//@Transient annotation is used for not add in our database as a column
	//@Transient
	private int grade;
	
    public C11_Student() {
        
    }
    public C11_Student(int student_id, String name, int grade) {
        
        this.student_id = student_id;
        this.name = name;
        this.grade = grade;
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
        return "Student01 [student_id=" + student_id + ", name=" + name + ", grade=" + grade + "]";
    }

}
