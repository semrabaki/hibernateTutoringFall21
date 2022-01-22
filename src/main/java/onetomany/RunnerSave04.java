package onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave04 {

	public static void main(String[] args) {
		
		
		Book04 b1= new Book04 (10,"Math Book");
		Book04 b2= new Book04 (11,"Java Book");
		Book04 b3= new Book04 (12,"Science Book");
		Book04 b4= new Book04 (13,"English Book");
		
		
		List<Book04> bookList1= new ArrayList();
		
		Student04 std1= new Student04(101, "Esma",11);
		Student04 std2= new Student04(102, "Deulet",12);
		
		Student04 std3= new Student04(103, "Daren",13);
		
		std1.getBooklist().add(b1);
		
		std1.getBooklist().add(b2);
		
		std2.getBooklist().add(b3);
		
		std2.getBooklist().add(b4);
      
		std2.setBooklist(std2.getBooklist());
		
        b1.setStudent(std1);
		b2.setStudent(std1);
		
		b3.setStudent(std2);
		b4.setStudent(std2);
		
		System.out.println(b3);
		
		
		
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Book04.class).
				addAnnotatedClass(Student04.class);
		
		
		
		SessionFactory sf= con.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
		
		session.save(std1);
		session.save(std2);
		
		session.save(std3);
		
		tx.commit();
		
		
	}
	
	

}
