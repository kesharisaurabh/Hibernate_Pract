package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.student;

public class Client 
{
	public static void main(String[] args) {
		student st=new student();
		st.setId(11);
		st.setName("saurabh");
		st.setEmail("keshari.saruabh@aol.com");
		st.setMarks(98);
		
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.save(st);
		s.beginTransaction().commit();
		s.evict(st);		
		
	}
}
