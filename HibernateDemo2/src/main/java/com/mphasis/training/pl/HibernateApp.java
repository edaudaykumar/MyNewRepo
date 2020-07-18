package com.mphasis.training.pl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.entities.Laptop;
import com.mphasis.training.entities.Orders;
import com.mphasis.training.entities.Person;
import com.mphasis.training.entities.Product;
import com.mphasis.training.entities.Student;



public class HibernateApp {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Orders.class).addAnnotatedClass(Product.class);
		StandardServiceRegistryBuilder builder=
				new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory sessionFactory=con.buildSessionFactory(builder.build());
		
//		Student st = new Student();
//		st.setName("uday");
//		st.getEmail().add("uday@gmail.com");
//		st.getEmail().add("uday@mph.com");
//		st.getLp().setLpcode("LP123");
//		st.getLp().setBrand("HP");
//		st.getLp().setHddsize(1);
//		st.getLp().setRamsize(20);
//		st.getLp().setProcessor("Mrediatek");
		
		
		
		
		
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(st);
//		session.getTransaction().commit();
	}
}
