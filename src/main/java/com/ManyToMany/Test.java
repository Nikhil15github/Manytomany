package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test 
{

	public static void main(String[] args) 
	{
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		
		Employees e1 = new Employees();
		e1.setEmployee("nikhil");
		
		Employees e2 = new Employees();
		e2.setEmployee("shubham");
		
		Employees e3 = new Employees();
		e3.setEmployee("omkar");
		
		Projects p1 = new Projects();
		p1.setProject("insurance");
		
		Projects p2 = new Projects();
		p2.setProject("education");
		
		Projects p3 = new Projects();
		p3.setProject("medical");
		
		List<Employees> List1= new ArrayList<Employees>();
		List1.add(e1);
		List1.add(e2);
		
		
		List<Employees> List2= new ArrayList<Employees>();
		List2.add(e1);
		List2.add(e3);
		
		List<Employees> List3= new ArrayList<Employees>();
		List3.add(e2);
		List3.add(e3);
		
		p1.setEmployee(List1);
		p2.setEmployee(List2);
		p3.setEmployee(List3);
		
		List<Projects> List4= new ArrayList<Projects>();
		List4.add(p1);
		List4.add(p2);
		
		
		List<Projects> List5= new ArrayList<Projects>();
		List5.add(p1);
		List5.add(p3);
		
		List<Projects> List6= new ArrayList<Projects>();
		List6.add(p2);
		List6.add(p3);
		
		e3.setProject(List6);
		e1.setProject(List4);
		e2.setProject(List5);
		
		session.save(e1);
		session.save(p1);
		
		transaction.commit();
		session.close();
		
		
		
	}
}
