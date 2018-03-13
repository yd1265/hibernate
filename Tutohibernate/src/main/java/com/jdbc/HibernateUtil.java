package com.jdbc;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionfactory;
	
	
	static{
		try{
			sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

			
		}catch (Exception e){
			System.err.println("connetion failed");
			  e.printStackTrace();
		}
		
	}
	
	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	
}
