package hb3.onetoonejoins;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave03 {

	public static void main(String[] args) {
	
		
		Dairy dairy = new Dairy(10, "First Day");
		Dairy dairy2 = new Dairy(11, "Second Day");
		Dairy dairy3 = new Dairy(12, "Third Day");

		
		Student03 std1 = new Student03(101, "Darren", 12, dairy);
		Student03 std2 = new Student03(102, "Daulet", 13, dairy2);
		Student03 std3 = new Student03(103, "Esma", 14, dairy3);

		
		dairy.setStudent(std1);
		dairy2.setStudent(std2);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student03.class).
				addAnnotatedClass(Dairy.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		
		s.save(dairy);
		s.save(dairy2);
		s.save(dairy3);
		s.save(std1);
		s.save(std2);
		s.save(std3);
		
		tx.commit();
		
		
		
		
		
		
	}

}