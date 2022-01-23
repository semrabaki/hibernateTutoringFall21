package h08.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave08 {

	public static void main(String[] args) {
		
		
		Student08 std1= new Student08(101, "Daulet",10);
		Student08 std2= new Student08(102, "Daren",11);
		Student08 std3= new Student08(103, "Esma",12);
		Student08 std4= new Student08(104, "ALi Can",13);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student08.class);

			SessionFactory sf= con.buildSessionFactory();
			
			Session session= sf.openSession();
			
			Transaction tx= session.beginTransaction();
			
			session.save(std1);
			session.save(std2);
			session.save(std3);
			session.save(std4);
		
			
			tx.commit();

	}

}
