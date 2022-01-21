package hb3.onetoonejoins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch03 {

	public static void main(String[] args) {
		
		Student03 std = new Student03();
		Dairy dairy = new Dairy();
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student03.class).
				addAnnotatedClass(Dairy.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		
//		std = s.get(Student03.class, 101);
		
		dairy = s.get(Dairy.class, 12);
		dairy = s.get(Dairy.class, 12);
		
		tx.commit();
		

		System.out.println(dairy);
		
//		
//		String sqlQuery2 = "Select s.student_name, d.dairy, s.grade,  s.student_id "
//				+ "FROM Student03 s LEFT JOIN "
//				+ "Dairy d "
//				+ "ON s.student_id = d.student_id";
//		
//		List <Object[]> sqlList2 = s.createSQLQuery(sqlQuery2).getResultList();
//		
//		for(Object[] o : sqlList2) {
//			
//			System.out.println(Arrays.toString(o ));
//		}
		
		
		
//		String hqlQuery2 = "Select s.name, d.dairy, s.grade,  s.student_id "
//				+ "FROM Student03 s INNER JOIN "
//				+ "Dairy d "
//				+ "ON s.student_id = d.student";  //
//		
//		List<Object[]> hqlList2 = s.createQuery(hqlQuery2).getResultList();
//		
//		for(Object[] o : hqlList2) {
//			
//			System.out.println(Arrays.toString(o ));
//		}
		
		//SQL querries work with the table naming attributes.
		//HQL querrries work with class naming attributes (Java object names)
		
		
		//Fetch all the records getting name, id, grade, dairy, we need to use sql query and HQL query
		
		
//		String sqlQuery3 = "Select s.student_name, d.dairy_id, s.grade, d.dairy "
//				+ "FROM Student03 s FULL JOIN Dairy d "
//				+ "ON  s.student_id = d.student_id";
//		
//		List<Object[]> sqlList3 = s.createSQLQuery(sqlQuery3).getResultList();
//		
//		for(Object[] o :sqlList3 ) {
//			
//			System.out.println(Arrays.toString(o));
//			
//		}
		
		
		
		//When we use SQL query, we need to mention about createSQLQuery(), but when we use HQL query
		//we do not need to mention specifically about HQL as Hibernate works qith HQL by default so qwe just call
		//createQuery() method
		
		//SQL queries work only with Table names and Table column names
		//but HQL query only works with Object names and variable names
		
		
		
		
		
//		String hqlQuery3 = "Select s.name, d.dairy_id, s.grade, d.dairy "
//				+ "FROM Student03 s FULL JOIN Dairy d "
//				+ "ON  s.student_id = d.student";
//		
//		List<Object[]> hqlList3 = s.createQuery(hqlQuery3).getResultList();
//		
//		
//		
//	
//		for(Object[] o : hqlList3) {
//			
//			
//			System.out.println(Arrays.toString(o));
//			
//		}
		
		
		
		//Fetch all the records from both tables
		
//		String sqlQuery4 = "Select s.student_name, s.student_id, d.dairy_id, s.grade, d.dairy"
//				+ " FROM Student03 s FULL JOIN Dairy d ON s.student_id = d.student_id";
//		
//		List<Object[]> sqlList4 = s.createSQLQuery(sqlQuery4).getResultList();
//		
//		
//		for(Object[] o : sqlList4) {
//			
//			
//			System.out.println(Arrays.toString(o));
//			
//		}
		
		
		
//		String hqlQuery4 = "FROM Student03 s FULL JOIN Dairy d ON s.student_id = d.student";
//		
//		List<Object[]> hqlList4 = s.createQuery(hqlQuery4).getResultList();
//		
//		
//		for(Object[] o : hqlList4) {
//			
//			
//			System.out.println(Arrays.toString(o));
//			
//		}
		
	}}