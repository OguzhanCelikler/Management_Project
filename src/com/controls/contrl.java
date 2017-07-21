package com.controls;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.jpa.HibernateEntityManager;
import org.hibernate.query.QueryProducer;

import com.enti.Personel;
import com.enti.Users;
import com.menagedBeans.example_1;



public class contrl {

	
	public static void main(String[] args) {
		
		 Users us= new Users("Sabit", "Yah�i", "Sabit123", "sabit", 3);
		 
		  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session ss = sessionFactory.openSession();   
		    ss.beginTransaction();
		    ss.save(us);
		    ss.getTransaction().commit();

		
	/*	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ss = sessionFactory.openSession();
		ss.beginTransaction();
		Criteria criteria=ss.createCriteria(Personel.class);
		List<Personel> person=criteria.list();
		for(Personel p: person){
			   System.out.println(p.getBusname()+" "+p.getCussurname()+" "+p.getCussurname()
			   +" "+p.getDusername()+" "+p.getEuspassword());
			  int a=1;
			   if (a==p.getFustype()){
				   
				   System.out.println("BAÅ�ARILI GÄ°RÄ°Å�------------");
				   
			   }
			   else
				   System.out.println("GÄ°RÄ°Å� YAPAMAZSINIZ  xxxxxxxxxxxxxx");

			}
	    ss.getTransaction().commit();
		*/
		/*
		EntityManager em = null;
		Query qu =em.createNamedQuery("ilk");
		List<?> list = qu.getResultList();
			
			System.out.println(list.size());
			
		}*/
		
		
		
/*		 
		   
	    
		    Query query = session.getNamedQuery("ilk");
			List<Personel> personel = query.getResultList();
			for (Personel p : personel) {
				System.out.println("List of Employees::" + p.getAusid() + ","
						+ p.getBusname());  */
		}
	}

