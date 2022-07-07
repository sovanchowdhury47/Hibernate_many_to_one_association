package org.jsp.manytooneApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class Dao 
{
	public static void main(String[] args) 
	{
		Person person=new Person();
		person.setPerson_name("Sovan");
		
		Car c1=new Car();
		c1.setCar_name("Lamorgini");
		c1.setCar_model("urus");
		c1.setPerson(person);
		
		Car c2=new Car();
		c2.setCar_name("Audi");
		c2.setCar_model("Q7");
		c2.setPerson(person);
		
		Car c3=new Car();
		c1.setCar_name("Tata");
		c1.setCar_model("Nexon");
		c1.setPerson(person);
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.beginTransaction();
		ses.save(c1);
		ses.save(c2);
		ses.save(c3);
		tran.commit();
		ses.close();
		
	}

}
