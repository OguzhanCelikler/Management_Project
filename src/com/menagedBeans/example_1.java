package com.menagedBeans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.persistence.NamedQuery;
import javax.persistence.Query;

import com.enti.Personel;

@ManagedBean(name="dene")
@SessionScoped
public class example_1{

	private int newid;
	private String newname;
	private String newsurname;
	private String newsusername;
	private String newpassword;
	private int newtype;
	
	private int upid;
	private String upname;
	private String upsurname;
	private String upsusername;
	private String uppassword;
	private int uptype;
	private String sonuc;
	private String sonuc2;
	



	private boolean panel_deneme;
	
	
	public boolean isPanel_deneme() {
		return panel_deneme;
	}
	public void setPanel_deneme(boolean panel_deneme) {
		this.panel_deneme = panel_deneme;
	}
	public int getUpid() {
		return upid;
	}
	public void setUpid(int upid) {
		this.upid = upid;
	}
	public String getUpname() {
		return upname;
	}
	public void setUpname(String upname) {
		this.upname = upname;
	}
	public String getUpsurname() {
		return upsurname;
	}
	public void setUpsurname(String upsurname) {
		this.upsurname = upsurname;
	}
	public String getUpsusername() {
		return upsusername;
	}
	public void setUpsusername(String upsusername) {
		this.upsusername = upsusername;
	}
	public String getUppassword() {
		return uppassword;
	}
	public void setUppassword(String uppassword) {
		this.uppassword = uppassword;
	}
	public int getUptype() {
		return uptype;
	}
	public void setUptype(int uptype) {
		this.uptype = uptype;
	}


	


	private static List<Personel> personeller ;
	
	public example_1() {
		super();
	}
	public example_1(String newname, String newsurname, String newsusername, String newpassword, int newtype) {
		super();
		this.newname = newname;
		this.newsurname = newsurname;
		this.newsusername = newsusername;
		this.newpassword = newpassword;
		this.newtype = newtype;
		
	
	}
	public int getNewid() {
		return newid;
	}
	public void setNewid(int newid) {
		this.newid = newid;
	}
	public String getNewname() {
		return newname;
	}
	public void setNewname(String newname) {
		this.newname = newname;
	}
	public String getNewsurname() {
		return newsurname;
	}
	public void setNewsurname(String newsurname) {
		this.newsurname = newsurname;
	}
	public String getNewsusername() {
		return newsusername;
	}
	public void setNewsusername(String newsusername) {
		this.newsusername = newsusername;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public int getNewtype() {
		return newtype;
	}
	public void setNewtype(int newtype) {
		this.newtype = newtype;
	}
	
	
	public void sonuc(){
		
		
		System.out.println(getNewname());
		
	}
	public void add(){
    	
		 Personel pers= new Personel(this.newname, this.newsurname, this.newsusername,this.newpassword,this.newtype);
		 
		  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session ss = sessionFactory.openSession();   
		    ss.beginTransaction();
		    ss.save(pers);
		    
		    //------------SİLLME-------------
		/*    Personel pr = (Personel )
		   
		  	ss.createCriteria(Personel.class).add(Restrictions.eq("ausid", this.getNewid())).uniqueResult();
		    ss.delete(pr); */
		    ss.getTransaction().commit();
		    newname=null;
		    newsurname=null;
		    newsusername=null;
		    newpassword=null;
		    newtype=0;
	}
	
    public String yaz(){
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ss = sessionFactory.openSession();
		ss.beginTransaction();
	   Personel per = (Personel)ss.get(Personel.class,1);
		
	    ss.getTransaction().commit();
    	String sonuc =per.getBusname();
    	return sonuc;
    }
	
    public int submit(){
    	
    	int ac=getNewtype();
    	newtype=0;
    	return ac;
    }
    public List<Personel> getRes(){
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ss = sessionFactory.openSession();
		ss.beginTransaction();
		Criteria criteria=ss.createCriteria(Personel.class);
				List<Personel> personeller=criteria.add( Restrictions.eq("ausid",31) ).list();
			
			   
				String s = null;
				int a=0;
				for (Personel personel : personeller) {
					
				
					s=personel.getBusname();
					a=personel.getFustype();
				}
				
				if (a==3){
				System.out.println( s +"  "+"giris yapabilir");
				}
				else
					System.out.println(" giris yapılamaz");
				//setPanel_deneme(false);
					
				 ss.getTransaction().commit();
			     ss.close();				
		return personeller;
		

			}
    		
    	public int getPanel_kontrol(){
    		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    		Session ss = sessionFactory.openSession();
    		ss.beginTransaction();
    		Criteria criteria=ss.createCriteria(Personel.class);
    				List<Personel> personeller=criteria.add( Restrictions.eq("ausid",31) ).list();
    			
    			   
    				String s = null;
    				int a=0;
    				for (Personel personel : personeller) {
    					
    					s=personel.getBusname();
    					a=personel.getFustype();
    				}
    				
    				if (a==3){
    				System.out.println( s +"  "+"giris yapabilir");
    				}
    				else
    					System.out.println(" giris yapılamaz");
    				//setPanel_deneme(false);
    					
    				 ss.getTransaction().commit();
    			     ss.close();
    		return a;
    			
    			
    		}
    /*		public String getPanel_deger1(){
    				
				if(getPanel_kontrol()==3){
					sonuc="true";
				}
				if(getPanel_kontrol()==2){
					sonuc="false";	
				}
				if(getPanel_kontrol()==1){
					sonuc="true";
				}

    			return sonuc;
    		}
    		public String getPanel_deger2(){
				
				if(getPanel_kontrol()==3){
					sonuc2="false";
				}
				if(getPanel_kontrol()==2){
					sonuc2="false";	
				}
				if(getPanel_kontrol()==1){
					sonuc2="true";
				}

    			return sonuc2;
    		}
    	
    	*/
    	public void del(){
    	
		 
		  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session ss = sessionFactory.openSession();   
		    ss.beginTransaction();
		    
		    //------------SiLME-------------
		    Personel peer = (Personel )
		   
		  	ss.createCriteria(Personel.class).add(Restrictions.eq("ausid", this.getNewid())).uniqueResult();
		    ss.delete(peer);
		    ss.getTransaction().commit();
		    ss.close();
	}		
     	public void updt(){
        	
   		 
  		  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
  		    Session ss = sessionFactory.openSession();   
  		    ss.beginTransaction();
  		    
  		    Personel prrr = (Personel )
  		   
  		  	ss.createCriteria(Personel.class).add(Restrictions.eq("ausid", this.getUpid())).uniqueResult();
  		   
  		  
  		    prrr.setBusname(this.upname);
  		    prrr.setCussurname(this.upsurname);
  		    
  		    ss.update(prrr);
  		    ss.getTransaction().commit();

  	}
     			
     		
     	 public List<Personel> getAllOfThem(){
         	
         	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
     		Session ss = sessionFactory.openSession();
     		ss.beginTransaction();
     		Criteria criteria=ss.createCriteria(Personel.class);
     				List<Personel> personeller=criteria.list();
     			
     				 ss.getTransaction().commit();
     				 ss.close();
     		return personeller;

     			}
     	 
     	 	
			}
    
  
	
	

