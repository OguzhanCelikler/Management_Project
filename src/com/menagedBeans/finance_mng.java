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
import org.hibernate.criterion.Restrictions;

import com.enti.Ord_list;
import com.enti.Personel;
import com.enti.Purchase;
import com.enti.Raw;

@ManagedBean(name="fin")
@SessionScoped
public class finance_mng {
	
	private int newpur_id;
	private int newpur_status;
	private String newpur_name;
	private int newpur_num;
	private double newpur_cost;
	private Date newpur_tarih;
	private boolean bool_save;
	
	
	
	public boolean isBool_save() {
		return bool_save;
	}
	public void setBool_save(boolean bool_save) {
		this.bool_save = bool_save;
	}
	public int getNewpur_id() {
		return newpur_id;
	}
	public void setNewpur_id(int newpur_id) {
		this.newpur_id = newpur_id;
	}
	public int getNewpur_status() {
		return newpur_status;
	}
	public void setNewpur_status(int newpur_status) {
		this.newpur_status = newpur_status;
	}
	public String getNewpur_name() {
		return newpur_name;
	}
	public void setNewpur_name(String newpur_name) {
		this.newpur_name = newpur_name;
	}
	public int getNewpur_num() {
		return newpur_num;
	}
	public void setNewpur_num(int newpur_num) {
		this.newpur_num = newpur_num;
	}
	public double getNewpur_cost() {
		return newpur_cost;
	}
	public void setNewpur_cost(double newpur_cost) {
		this.newpur_cost = newpur_cost;
	}
	public Date getNewpur_tarih() {
		return newpur_tarih;
	}
	public void setNewpur_tarih(Date newpur_tarih) {
		this.newpur_tarih = newpur_tarih;
	}
//***************************************************************************************
	public void add_pur() throws ParseException{
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		String dateInString = new java.text.SimpleDateFormat(" dd-MM-yyyy").format(cal.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat(" dd-MM-yyyy");
		Date parsedDate = formatter.parse(dateInString);

	double total=getNewpur_num()*getNewpur_cost();
				
				Purchase pur =new Purchase(1, this.newpur_name, this.newpur_num, this.newpur_cost, total, parsedDate);
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    ss.save(pur);
			  
			    ss.getTransaction().commit();
				 ss.close();
				 sessionFactory.close();
			    newpur_num=0;
			    newpur_name=null;
			    newpur_cost=0;
	}
//***************************************************************************************
public List<Purchase> getAllOfThem(){
	 	
	 	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session ss = sessionFactory.openSession();
			ss.beginTransaction();
			Criteria criteria=ss.createCriteria(Purchase.class);
			List<Purchase> raw=criteria.add( Restrictions.eq("bpur_status",1) ).list();				
					 ss.getTransaction().commit();
					 ss.close();
					 sessionFactory.close();
			return raw;

				}
//***************************************************************************************
public void save_to_raw(Purchase p){
	
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session ss = sessionFactory.openSession();
	ss.beginTransaction();
	Criteria criteria=ss.createCriteria(Raw.class);
			List<Raw> rw=criteria.add( Restrictions.eq("craw_name",p.getCpur_name()) ).list();
		
		   
			String s = null;
			int a=0;
			for (Raw r : rw) {
				
			
				a=r.getDraw_num();
			}
			
			int z=p.getApur_id();
			int x =p.getBpur_status();
			String v=p.getCpur_name();
			int c =p.getDpur_num();
		int toplam=a+c;
				
		 
		    Raw ra = (Raw )
		   
		  	ss.createCriteria(Raw.class).add(Restrictions.eq("craw_name", p.getCpur_name())).uniqueResult();
	//	Raw raw= new Raw(2, v, toplam);
		
		     ra.setDraw_num(toplam);
		     
		    		
		     
			 ss.update(ra);
			 ss.getTransaction().commit();
			 ss.close();
			 sessionFactory.close();			
	

		}
//***************************************************************************************
public void up_to(Purchase p){
	
	
	  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session ss = sessionFactory.openSession();   
	    ss.beginTransaction();
	    
	    Purchase prr = (Purchase )
	   
	  	ss.createCriteria(Purchase.class).add(Restrictions.eq("apur_id", p.getApur_id())).uniqueResult();
	   
	  
	    prr.setBpur_status(2);
	    
	    ss.update(prr);
	    ss.getTransaction().commit();
		 ss.close();
		 sessionFactory.close();
	

		}
//***************************************************************************************
}
