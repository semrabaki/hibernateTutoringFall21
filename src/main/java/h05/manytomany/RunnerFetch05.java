package h05.manytomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch05 {

	public static void main(String[] args) {
	
		Student05 std= new Student05();
		
		Book05 book= new Book05();
		
		
		
		        Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student05.class).
				addAnnotatedClass(Book05.class);

				SessionFactory sf= con.buildSessionFactory();
				
				Session session= sf.openSession();
				
				Transaction tx= session.beginTransaction();
				
				//1)Fetch the stuent whose ids 101 by using get()
			   //	std=session.get(Student05.class, 101);
				//System.out.println(std);
				
				//2)Fetch the book whose is is 11 by using get ()
				book=session.get(Book05.class, 11);
				System.out.println(book);
				
				
				//3)Fetch the book whose name is ArtBook. I want to see the owners as wll
				
                String hqlQuery="FROM Book05 where book_name='Art Book'";
				
				List<Object>bookList= session.createQuery(hqlQuery).getResultList();
				
				for(Object each: bookList)
					System.out.println(each);
				
				//2.way of getting data as asignle data
//				Object book2= session.createQuery(hqlQuery).getSingleResult();
//				
//				System.out.println(book2);
				
//				Book05 book3= (Book05)session.createQuery(hqlQuery).getSingleResult();
//				System.out.println(book3);
				
				//Fetch the students name
				
//				String hql4="SELECT s.name FROM Student05 s";
//				List<String>rs4=session.createQuery(hql4).getResultList();
//				System.out.println(rs4);
					
				//Fetch the book names
//				String hql5="SELECT b.book_name FROM Book05 b";
//				List<Object>rs5=session.createQuery(hql5).getResultList();
//				System.out.println(rs5);
				
				//6)Fetch the book names whose id is 11
//				String hql6="SELECT b.book_name FROM Book05 b WHERE book_id=11";
//				String rs6=(String) session.createQuery(hql6).getSingleResult();
//				System.out.println(rs6);
				
				
				//7)Fetch the student name, book name whose student id is 101
				String hql7="SELECT s.name, b.book_name FROM Student05 s INNER JOIN Book05 b ON s.std_id=101";
				List<Object[]>rs7= session.createQuery(hql7).getResultList();
				
				for(Object[] w:rs7)
				{System.out.println(Arrays.toString(w));}
				
				
				//How to print the " Java Book " on the console
				
				System.out.println("================>" +rs7.get(2)[1]);
				
				tx.commit();
				session.close();
				
		

	}

}
