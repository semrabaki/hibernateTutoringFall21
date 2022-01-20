package hb2.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class C24_RunnerFetch {

	public static void main(String[] args) {
	
		
		C21_Students readStd= new C21_Students();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(C21_Students.class);
		
		SessionFactory sf= con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		readStd=session.get(C21_Students.class, 102);
		
		System.out.println("Students from DB" + readStd);
		
		tx.commit();
		session.close();
		
		

	}

}
