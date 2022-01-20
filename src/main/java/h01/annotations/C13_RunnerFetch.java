package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class C13_RunnerFetch {

	public static void main(String[] args) {
		
		
		C11_Student readStd= new C11_Student();
		
		Configuration con= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(C11_Student.class);
		
		SessionFactory sf= con.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		readStd= session.get(C11_Student.class,1002);
		
		System.out.println("From database:" +readStd);
		
		tx.commit();
		
	
	}

}
