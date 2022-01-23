package h08.update;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerUpdate {

	public static void main(String[] args) {
		
Student08 std = new Student08();

		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student08.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Transaction tx = session.beginTransaction();
		
		
//		String hqlQuery  = "UPDATE Student08 s SET s.name = 'Veli Han' WHERE s.student_id = 104";
//		
//		int rowsUpdated = session.createQuery(hqlQuery).executeUpdate();
//		
//		
//		System.out.println(rowsUpdated +" row(s) updated");
		
		std = session.get(Student08.class, 103);
		
		std.setGrade(14);
		
		std.setName("Ayse");
		
//		List<Student08> list = new ArrayList();
//		
//		
//		for(int i=101; i<105; i++) {
//			Student08 std2 = new Student08();
//			std2 = session.get(Student08.class, i);
//			std2.setName("Osman Tan");
//			
//			
//			list.add(std2);
//			
//		}
		
//		for(int i=101; i<list.size(); i++) {
//			
//			std  = list.get(i);
//			
//			std.setName("Ali Han");
//			
//			
//			
//		}
		
//		String hqlQuery2 = "UPDATE Student08 s SET s.name = 'Osman Can' WHERE s.grade >11";
//		
//		int rowsUpdated = session.createQuery(hqlQuery2).executeUpdate();
//		
//		System.out.println(rowsUpdated + "rows are updated");
		
		
		tx.commit();


	}

}
