package com.menagedBeans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = setSessionFactory();


	private static SessionFactory setSessionFactory() {
		
		try {
			Configuration configuration = new Configuration().configure("hibernate-oracle.cfg.xml");
	//		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
	//		registry.applySettings(configuration.getProperties());
	//		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
	//		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			return sessionFactory;
			 
		} catch (Throwable e) {
			System.out.println("SessionFactory oluşturulamadı. " + e);
			throw new ExceptionInInitializerError(e);
		}	
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
	public static Session openSessionFactory() {
		return getSessionFactory().openSession();
	}
	
	

}
