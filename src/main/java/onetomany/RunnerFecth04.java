package onetomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFecth04 {

	public static void main(String[] args) {
		
		
		Student04 std= new Student04();
			
		Book04 book= new Book04();
		
		Configuration con= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class).
				addAnnotatedClass(Book04.class);

		SessionFactory sf= con.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
	//	std= session.get(Student04.class, 101);
		
		book=session.get(Book04.class,12);
		tx.commit();
		
//		List<Book04>bookList=std.getBooklist();
//		
//		for(Book04 eachBook:bookList) {
//			System.out.println(eachBook);
//			
//		}
		
		//System.out.println(std);
		
//		System.out.println(book);
		
		String sqlQuery = "Select s.name, s.std_id, b.book_name "
				+ "FROM Student04 s "
				+ "INNER JOIN Book04 b "
				+ "ON s.std_id = b.std_id";
		
//		List<Object[]> sqlList1=session.createSQLQuery(sqlQuery).getResultList();
//		
//		for(Object[]each:sqlList1)
//		{
//			System.out.println(Arrays.toString(each));
//		}
		
//		for(Object[]each:sqlList1)
//		{
//			for(Object each0: each)
//			{
//				System.out.println(each0);
//			}
//		}
		
		
		String hqlQuery="Select s.name, s.std_id, b.book_name "
				+ "FROM Student04 s "
				+ "INNER JOIN Book04 b "
				+ "ON s.std_id = b.student";
		
		  List<Object[]> hqlList1=session.createQuery(hqlQuery).getResultList();
		  for(Object[] each: hqlList1)
		  {
			  System.out.println(Arrays.toString(each));
		  }
		
		
		
	}

}
