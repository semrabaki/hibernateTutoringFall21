package hb3.ontoone_joins;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hb2.embeddable.C21_Students;

public class C33_RunnerSave {

	public static void main(String[] args) {
		
		
		C32_Diary d1= new C32_Diary (12,"diary1");
		C32_Diary d2= new C32_Diary();
		
		
		d2.setId(13);
		d2.setDiaryName("diary two");
		
		C31_Students std1= new C31_Students(1003,"Orhan Tugra",6,d2);
		
		C31_Students std2= new C31_Students();
		
		std2.setStd_id(1004);
		std2.setName("Betul Sare");
		
		std2.setGrade(1);
		std2.setDairy(d1);
		
		d1.setStudent(std1);
		d2.setStudent(std2);
Configuration con = new Configuration().configure("hibernate.cfg.xml")
       .addAnnotatedClass(C31_Students.class).addAnnotatedClass(C32_Diary.class);
		
		SessionFactory sf= con.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.save(d1);
		session.save(d2);
		session.save(std1);
		session.save(std2);
		
		
		tx.commit();

	}

}
