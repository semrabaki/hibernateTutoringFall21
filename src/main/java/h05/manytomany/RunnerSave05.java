package h05.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;

public class RunnerSave05 {

	public static void main(String[] args) {
		
		
		Book05 b1= new Book05(10, "Math Book");
		Book05 b2= new Book05(10, "Science Book");
		Book05 b3= new Book05(10, "Java Book");
		Book05 b4= new Book05(10, "Art Book");
		
		List<Book05> bookList1= new ArrayList();
		bookList1.add(b1);
		bookList1.add(b2);
		bookList1.add(b4);
		
		List<Book05> bookList2= new ArrayList();
		bookList2.add(b2);
		bookList2.add(b3);
		bookList2.add(b4);
		
		Student05 std1= new Student05(101, "Daulet",10, bookList1);
		Student05 std2= new Student05(102, "Daren",10, bookList2);
		
		List<Student05>studentList= new ArrayList();
		studentList.add(std1);
		b1.setStudentList(studentList);
		
		
		List<Student05>studentList2= new ArrayList();
		studentList2.add(std1);
		studentList2.add(std2);
		b2.setStudentList(studentList2);
		
		
		List<Student05>studentList3= new ArrayList();
		studentList3.add(std2);
		b3.setStudentList(studentList3);
		
		List<Student05>studentList4= new ArrayList();
		studentList4.add(std1);
		studentList4.add(std2);
		b4.setStudentList(studentList4);
		
		System.out.println(std2);
		

	}

}
