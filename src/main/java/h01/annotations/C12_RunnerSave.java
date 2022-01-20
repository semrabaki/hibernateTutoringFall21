package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class C12_RunnerSave {

	public static void main(String[] args) {
		
		
		C11_Student std1= new C11_Student(1001,"Orhan Tugra",6);
		
		C11_Student std2= new C11_Student();
		std2.setStudent_id(1002);
		std2.setName("Betul Sare");
		std2.setGrade(1);
		
		C11_Student std3= new C11_Student();
		std3.setStudent_id(1003);
		std3.setName("Kemal kala");
		std3.setGrade(6);
		
		
		Configuration con= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(C11_Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session =sf.openSession();
		
		
		Transaction tx=session.beginTransaction();
		
		//save() is using for saving our object or variables in database
		session.save(std1);	
		session.save(std2);
		session.save(std3);
		
		tx.commit();
		
		
		
	}

}
