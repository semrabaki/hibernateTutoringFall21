package hb3.ontoone_joins;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class C34_RunnerFecth {

	public static void main(String[] args) {
		
		
		C31_Students std= new C31_Students ();
		
		C32_Diary diary= new C32_Diary ();
		
		
		Configuration con = new Configuration ().configure("hibernate.cfg.xml").
				addAnnotatedClass(C31_Students.class).addAnnotatedClass(C32_Diary.class);
		
		SessionFactory sf= con.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx= s.beginTransaction();
		
	//	std=s.get(C31_Students.class, 1003);
		
		diary=s.get(C32_Diary.class,13);
		
		
		
		
		tx.commit();

		System.out.println(std);
	}

}
