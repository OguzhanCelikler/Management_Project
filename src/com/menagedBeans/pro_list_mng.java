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

import com.enti.Pro_list;
import com.enti.Purchase;
import com.enti.Raw;
import com.enti.Stock;


@ManagedBean(name="pro")
@SessionScoped
public class pro_list_mng {
	
	private int newpro_id;
	private int newpro_status;
	private String newpro_name;
	private int newpro_num;
	private String newpro_to;
	private Date newpro_tarih;
	
	private int newst_id;
	private int newst_status;
	private String newst_name;
	private int newst_num;
	private String newst_to;
	private Date newst_tarih;
	
	
public int getNewst_id() {
		return newst_id;
	}
	public void setNewst_id(int newst_id) {
		this.newst_id = newst_id;
	}
	public int getNewst_status() {
		return newst_status;
	}
	public void setNewst_status(int newst_status) {
		this.newst_status = newst_status;
	}
	public String getNewst_name() {
		return newst_name;
	}
	public void setNewst_name(String newst_name) {
		this.newst_name = newst_name;
	}
	public int getNewst_num() {
		return newst_num;
	}
	public void setNewst_num(int newst_num) {
		this.newst_num = newst_num;
	}
	public String getNewst_to() {
		return newst_to;
	}
	public void setNewst_to(String newst_to) {
		this.newst_to = newst_to;
	}
	public Date getNewst_tarih() {
		return newst_tarih;
	}
	public void setNewst_tarih(Date newst_tarih) {
		this.newst_tarih = newst_tarih;
	}
public int getNewpro_id() {
		return newpro_id;
	}
	public void setNewpro_id(int newpro_id) {
		this.newpro_id = newpro_id;
	}
	public int getNewpro_status() {
		return newpro_status;
	}
	public void setNewpro_status(int newpro_status) {
		this.newpro_status = newpro_status;
	}
	public String getNewpro_name() {
		return newpro_name;
	}
	public void setNewpro_name(String newpro_name) {
		this.newpro_name = newpro_name;
	}
	public int getNewpro_num() {
		return newpro_num;
	}
	public void setNewpro_num(int newpro_num) {
		this.newpro_num = newpro_num;
	}
	public String getNewpro_to() {
		return newpro_to;
	}
	public void setNewpro_to(String newpro_to) {
		this.newpro_to = newpro_to;
	}
	public Date getNewpro_tarih() {
		return newpro_tarih;
	}
	public void setNewpro_tarih(Date newpro_tarih) {
		this.newpro_tarih = newpro_tarih;
	}
//*************************************************************************************
public List<Pro_list> getAllOfThem(){
	 	
	 	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session ss = sessionFactory.openSession();
			ss.beginTransaction();
			Criteria criteria=ss.createCriteria(Pro_list.class);
			List<Pro_list> p=criteria.add( Restrictions.eq("bpro_status",1) ).list();	//ilk gelen sipari�ler			
			ss.getTransaction().commit();
			 ss.close();
			 sessionFactory.close();
			return p;

				}
//*************************************************************************************
public void save_to_stock(Pro_list p){
	
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session ss = sessionFactory.openSession();
	ss.beginTransaction();
	Criteria criteria=ss.createCriteria(Stock.class);
			List<Stock> st=criteria.add( Restrictions.eq("cst_name",p.getCpro_name().trim())).list();
		
		   
			String s = null;
			int a=0;
			for (Stock stt : st) {
				
			
				a=stt.getDst_num();
			}
			

			int c =p.getDpro_num();
		int toplam=a+c;
				
		 
		    Stock sss = (Stock )
		   
		  	ss.createCriteria(Stock.class).add(Restrictions.eq("cst_name",p.getCpro_name().trim())).uniqueResult();
	//	Raw raw= new Raw(2, v, toplam);
		
		     sss.setDst_num(toplam);
		     
		    		
		     
			 ss.update(sss);
			 ss.getTransaction().commit();
			 ss.close();
			 sessionFactory.close();		
	

		}
//*************************************************************************************
//***************************************************************************************
	public void add_stk() throws ParseException{
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		String dateInString = new java.text.SimpleDateFormat(" dd-MM-yyyy").format(cal.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat(" dd-MM-yyyy");
		Date parsedDate = formatter.parse(dateInString);

			Stock st = new Stock(1, this.newst_name, this.newst_num, newst_to, parsedDate);
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    ss.save(st);
			  
			    ss.getTransaction().commit();
				 ss.close();
				 sessionFactory.close();
			    newst_to=null;
			    newst_name=null;
			    newst_num=0;
	}
//***************************************************************************************
	//***************************************************************************************
	public List<Stock> getAllStok(){
		 	
		 	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session ss = sessionFactory.openSession();
				ss.beginTransaction();
				Criteria criteria=ss.createCriteria(Stock.class);
				List<Stock> st=criteria.add( Restrictions.eq("bst_status",1) ).list();				
				ss.getTransaction().commit();
				 ss.close();
				 sessionFactory.close();
				return st;

					}
	//***************************************************************************************
	//***************************************************************************************
	public void up_to(Pro_list p){
		
		
		  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session ss = sessionFactory.openSession();   
		    ss.beginTransaction();
		    
		    Pro_list prr = (Pro_list )
		   
		  	ss.createCriteria(Pro_list.class).add(Restrictions.eq("apro_id", p.getApro_id())).uniqueResult();
		   
		  
		    prr.setBpro_status(2);
		    
		    ss.update(prr);
		    ss.getTransaction().commit();
			 ss.close();
			 sessionFactory.close();
		

			}
	//***************************************************************************************
}
