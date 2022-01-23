package h06.lazy_fetch_eger_fetch;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h05.manytomany.Book05;
import h05.manytomany.Student05;

public class RunnerSave06 {

	public static void main(String[] args) {
		
		
		Book06 b1= new Book06 (10, "Math Book");
		Book06 b2= new Book06 (11, "Science Book");
		Book06 b3= new Book06 (12, "Java Book");

		List<Book06>bookList=new ArrayList();
		bookList.add(b1);
		bookList.add(b2);
		
		Student06 std= new Student06(101, "Deulet",12, bookList);
		
		b1.setStudent(std);
		b2.setStudent(std);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student06.class).
				addAnnotatedClass(Book06.class);

		SessionFactory sf= con.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		
		session.save(std);
		
		tx.commit();
	}

}
