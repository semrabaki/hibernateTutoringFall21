package onetomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerDelete04 {

	public static void main(String[] args) {
	
		
		Student04 std= new Student04();
		Book04 book= new Book04();
		
		Configuration con= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class).
				addAnnotatedClass(Book04.class);

		SessionFactory sf= con.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
//        String sqlQuery="DELETE FROM Book04";
//        
//       int numberOfRowsDeleted= session.createSQLQuery(sqlQuery).executeUpdate();
//       
//       System.out.println(numberOfRowsDeleted + " many records have been deleted");
       
//       String sqlQuery="DELETE FROM Student04";
//        int numberOfRowsDeleted= session.createSQLQuery(sqlQuery).executeUpdate();
//       
//       System.out.println(numberOfRowsDeleted + " many records have been deleted");
		
//		std= session.get(Student04.class, 102);
//		
//		session.delete(std);
	
		
        book= session.get(Book04.class, 11);
		
		//session.delete(book);
		
		//session.delete("Book04",book);
		
		
		
		//How to get specific field values from a table
//		int max=Integer.MAX_VALUE;
//		String hqlQuery="From Student04 WHERE std_id<"+max;
//		List<Student04> resultList=session.createQuery(hqlQuery).getResultList();
//		for(Student04 w:resultList)
//		{
//			System.out.println(w.getStd_id());
//		}
		
		/////c)wihouttouching Child table delete records from Parent table and from child table
    	int max=Integer.MAX_VALUE;
		String hqlQuery="From Student04 WHERE std_id<"+max;
		List<Student04> resultList=session.createQuery(hqlQuery).getResultList();
		for(Student04 w:resultList)
		{
			std=session.get(Student04.class,w.getStudent_id());
			session.delete(std);
		}
		
		
		tx.commit();
		session.close();
		
		
		
	}

}
