package h07.caching_mecanism;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class RunnerFetch07 {

	public static void main(String[] args) {

		Student07 std= new Student07();
		Book07 book=new Book07();
		
		
		//Lazy Fetch will only fetch neccassary data
		//It will not occupy database with unneccessary data
		//When you make a lazy fetch you will not consume more storage on your local
		
	
		//Eager fetch is just good when you need more data manipulation even related to child tables
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student07.class).
				addAnnotatedClass(Book07.class);

		SessionFactory sf= con.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
//		std=session.get(Student07.class, 101);
//		

		std=session.get(Student07.class, 101);
//		
		book=session.get(Book07.class, 10);
		book=session.get(Book07.class, 11);
		book=session.get(Book07.class, 10);
		book=session.get(Book07.class, 11);
		
		tx.commit();
		//session.close();

	//	System.out.println(std);
	System.out.println(book);
	
	Session session2= sf.openSession();
	Transaction tx2=session2.beginTransaction();
	
	Book07 b2=session2.get(Book07.class,10);
	
	//When you fetch a new data, your code should hit database, but if you want to get same data
	//again again hibenrate will not git the database again and again. It will use cache memeory to fect data
	b2=session2.get(Book07.class,12); //1.hit
	b2=session2.get(Book07.class,12); //cache
	tx2.commit();
	
	System.out.println(b2);
	}

}
