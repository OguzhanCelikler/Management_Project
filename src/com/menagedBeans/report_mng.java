package com.menagedBeans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.enti.Expenses;
import com.enti.Purchase;
import com.enti.Staff;

@ManagedBean(name="rep")
@SessionScoped
public class report_mng {
	
	private String firstTime="";
	private String SeconTime="";
	 Date d;
	 Date f;
	 Date r;
	 Date t;
	 Date v;
	 Date b;
	
	public String getFirstTime() {
		return firstTime;
	}
	public void setFirstTime(String firstTime) {
		this.firstTime = firstTime;
	}
	public String getSeconTime() {
		return SeconTime;
	}
	public void setSeconTime(String seconTime) {
		SeconTime = seconTime;
	}
//***********************************************************************************************
	
	public void sub(){
		
		
		getstaff();
		
	}
	
	//*********************************************************************************************
	
	
	public List<Purchase> getpurchase(){
		
		
		try {
			
			v = new SimpleDateFormat("yyyy-MM-dd").parse(getFirstTime());
			b =  new SimpleDateFormat("yyyy-MM-dd").parse(getSeconTime());
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
		}
		
		
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session ss = sessionFactory.openSession();   
		    ss.beginTransaction();
		    
		   
			Criteria criteria=ss.createCriteria(Purchase.class);

			List<Purchase> p=criteria.add( Restrictions.eq("bpur_status",2) ).add( Restrictions.between("fpur_tarih",r,t)).list();				

			
		    ss.getTransaction().commit();
		    ss.close();
		    sessionFactory.close();

		
		
		return p;
		
		
	}
	//*************************************************************************************
public double getPurchaseCost(){
		
		
		try {
			
			v = new SimpleDateFormat("yyyy-MM-dd").parse(getFirstTime());
			b =  new SimpleDateFormat("yyyy-MM-dd").parse(getSeconTime());
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
		}
		
		
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session ss = sessionFactory.openSession();   
		    ss.beginTransaction();
		    
		   double kl=0.0;
			Criteria criteria=ss.createCriteria(Purchase.class);

			List<Purchase> p=criteria.add( Restrictions.eq("bpur_status",2) ).add( Restrictions.between("fpur_tarih",r,t)).list();				

			for (Purchase purchase : p) {
				kl=purchase.getTpur_total()+kl;
			}
		    ss.getTransaction().commit();
		    ss.close();
		    sessionFactory.close();

		

		
		
		return kl;
		
		
	}
	//*********************************************************************************************
		public List<Staff> getstaff(){
			
			
			try {
				
				d = new SimpleDateFormat("yyyy-MM-dd").parse(getFirstTime());
				f =  new SimpleDateFormat("yyyy-MM-dd").parse(getSeconTime());
			
			} catch (ParseException e) {
				// TODO Auto-generated catch block
			}
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    
			   
				Criteria criteria=ss.createCriteria(Staff.class);

				List<Staff> S=criteria.add( Restrictions.eq("gststatus",1) ).add( Restrictions.lt("fstdate",f)).list();				

				
			    ss.getTransaction().commit();
			    ss.close();
			    sessionFactory.close();

			

			
			
			return S;
			
			
		}
		//*************************************************************************************
		public double getStaffTotalSalary(){
			

			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    
			   
				Criteria criteria=ss.createCriteria(Staff.class);
				
				double salaryTotal= (Double) ss.createCriteria(Staff.class)
				        .setProjection(Projections.sum("dsrsalary"))
				        .add(Restrictions.in("gststatus", 1))
				        .uniqueResult();
			
			
			System.out.println(salaryTotal);
			
			 ss.getTransaction().commit();
			    ss.close();
			    sessionFactory.close();
			return salaryTotal;
		}
//*************************************************************************************************
		public double getPurchTotalSalary(){
			

			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    
			   
				Criteria criteria=ss.createCriteria(Purchase.class);
				
				double purcTotal= (Double) ss.createCriteria(Purchase.class)
				        .setProjection(Projections.sum("tpur_total"))
				        .add(Restrictions.in("bpur_status", 2))
				        .uniqueResult();
			
				 ss.getTransaction().commit();
				    ss.close();
				    sessionFactory.close();
			
			
			return purcTotal;
		}
		
//************************************************************************************************
		public double getExpenTotalSalary(){
			

			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    
			   
				Criteria criteria=ss.createCriteria(Expenses.class);
				
				double expenTotal= (Double) ss.createCriteria(Expenses.class)
				        .setProjection(Projections.sum("cexcost"))
				        .add(Restrictions.in("fextype",1))
				        .uniqueResult();
			
				 ss.getTransaction().commit();
				    ss.close();
				    sessionFactory.close();
			
			
			return expenTotal;
		}
//************************************************************************************************
		public List<Expenses> getExpense(){
			
try {
				
				r = new SimpleDateFormat("yyyy-MM-dd").parse(getFirstTime());
				t =  new SimpleDateFormat("yyyy-MM-dd").parse(getSeconTime());
			
			} catch (ParseException e) {
				// TODO Auto-generated catch block
			}
			
			
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    
			   
				Criteria criteria=ss.createCriteria(Expenses.class);

				List<Expenses> ex=criteria.add( Restrictions.eq("fextype",1) ).add( Restrictions.between("dex_tarih",r,t)).list();				

				
				 ss.getTransaction().commit();
				    ss.close();
				    sessionFactory.close();
			

			
			
			return ex;
			
			
		}
		//*************************************************************************************
public double getStaffCostL(){
			
			
			try {
				
				d = new SimpleDateFormat("yyyy-MM-dd").parse(getFirstTime());
				f =  new SimpleDateFormat("yyyy-MM-dd").parse(getSeconTime());
			
			} catch (ParseException e) {
				// TODO Auto-generated catch block
			}
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    
			    double nm=0.0;
			   
				Criteria criteria=ss.createCriteria(Staff.class);

				List<Staff> S=criteria.add( Restrictions.eq("gststatus",1) ).add( Restrictions.lt("fstdate",f)).list();				
				
				for (Staff staff : S) {
					
				nm=staff.getDsrsalary()+nm;
					
				}
				
				 ss.getTransaction().commit();
				    ss.close();
				    sessionFactory.close();
			

			
			
			return nm;
			
			
		}
//******************************************************************************************************
public double getExpenCostL(){
	
	
	try {
		
		r = new SimpleDateFormat("yyyy-MM-dd").parse(getFirstTime());
		t =  new SimpleDateFormat("yyyy-MM-dd").parse(getSeconTime());
	
	} catch (ParseException e) {
		// TODO Auto-generated catch block
	}
	
	 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session ss = sessionFactory.openSession();   
	    ss.beginTransaction();
	    
	    double nm2=0.0;
	    Criteria criteria=ss.createCriteria(Expenses.class);

		List<Expenses> ex=criteria.add( Restrictions.eq("fextype",1) ).add( Restrictions.between("dex_tarih",r,t)).list();			
		
		for (Expenses expenses : ex) {
			
			nm2=expenses.getCexcost()+nm2;
		}
		
		 ss.getTransaction().commit();
		    ss.close();
		    sessionFactory.close();
	

	
	
	return nm2;
	
	
}
//******************************************************************************************************
public double getTotal(){
	
	
double result=	getExpenCostL()+getPurchaseCost()+getStaffCostL();
	
	
	return result;
	
	
}
//******************************************************************************************************
}
