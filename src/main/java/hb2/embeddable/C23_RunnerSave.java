package hb2.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class C23_RunnerSave {

	public static void main(String[] args) {
		
		C22_Courses course1= new C22_Courses("Art","Math");
		
		C22_Courses course2= new C22_Courses("PE","IT");
		
		
		C21_Students std1= new C21_Students(101,"OrhanTugra",6, course1);
		//C21_Students std2= new C21_Students(101,"OrhanTugra",6, new C22_Courses("music","science"));
		C21_Students std2= new C21_Students();
		
		std2.setStd_id(102);
		std2.setName("Betul Sare");
		std2.setGrade(1);
		std2.setCourses(course2);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(C21_Students.class);
		
		SessionFactory sf= con.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(std1);
		session.save(std2);
		
		
		tx.commit();
		
	}

}
