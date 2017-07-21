package com.menagedBeans;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Criteria;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;

import com.enti.Ord_list;
import com.enti.Personel;
import com.enti.Pro_list;
import com.enti.Purchase;
import com.enti.Raw;
import com.enti.Recipe;

@ManagedBean(name="raw")
@SessionScoped
public class Raw_mng {
	private int newraw_id;
	private int newraw_type;
	private String newraw_name;
	private int newraw_num;
	private int siparis;
	private String urun;
	private int selectmenu_sonuc;
	int sayac=0;
	
	private String newor_name;
	private int newor_num;
	private String newor_tarih;
	
	private boolean bool_rawlist;
	private boolean bool_send_pro;
		
	private String firstTime="yyyy-mm-dd";
	private String lastTime="yyyy-mm-dd";
	
	private int upd;
	private String tarih1;

	
	public String getTarih1() {
		return tarih1;
	}
	public void setTarih1(String tarih1) {
		this.tarih1 = tarih1;
	}
	private int newpro_id;
	private int newpro_status;
	private String newpro_name;
	private int newpro_num;
	private String newpro_to;
	private Date newpro_tarih;
	
	
	
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
	public int getUpd() {
		return upd;
	}
	public void setUpd(int upd) {
		this.upd = upd;
	}
	Date d=null;
	Date f=null;
	
public String getFirstTime() {
		return firstTime;
	}
	public void setFirstTime(String firstTime) {
		this.firstTime = firstTime;
	}
	public String getLastTime() {
		return lastTime;
	}
	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}
public boolean isBool_send_pro() {
		return bool_send_pro;
	}
	public void setBool_send_pro(boolean bool_send_pro) {
		this.bool_send_pro = bool_send_pro;
	}
public boolean isBool_rawlist() {
		return bool_rawlist;
	}
	public void setBool_rawlist(boolean bool_rawlist) {
		this.bool_rawlist = bool_rawlist;
	}
public String getNewor_tarih() {
		return newor_tarih;
	}
	public void setNewor_tarih(String newor_tarih) {
		this.newor_tarih = newor_tarih;
	}
	//***********************************************************************	
	public String getNewor_name() {
		return newor_name;
	}
	public void setNewor_name(String newor_name) {
		this.newor_name = newor_name;
	}
	public int getNewor_num() {
		return newor_num;
	}
	public void setNewor_num(int newor_num) {
		this.newor_num = newor_num;
	}
	
//****************************************************************************
	public int getSelectmenu_sonuc() {
		return selectmenu_sonuc;
	}
	public void setSelectmenu_sonuc(int selectmenu_sonuc) {
		this.selectmenu_sonuc = selectmenu_sonuc;
	}
	public String getUrun() {
		return urun;
	}
	public void setUrun(String urun) {
		this.urun = urun;
	}
	public int getSiparis() {
		return siparis;
	}
	public void setSiparis(int siparis) {
		this.siparis = siparis;
	}
//****************************************************************************************
	public int getNewraw_id() {
		return newraw_id;
	}
	public void setNewraw_id(int newraw_id) {
		this.newraw_id = newraw_id;
	}
	public int getNewraw_type() {
		return newraw_type;
	}
	public void setNewraw_type(int newraw_type) {
		this.newraw_type = newraw_type;
	}
	public String getNewraw_name() {
		return newraw_name;
	}
	public void setNewraw_name(String newraw_name) {
		this.newraw_name = newraw_name;
	}
	public int getNewraw_num() {
		return newraw_num;
	}
	public void setNewraw_num(int newraw_num) {
		this.newraw_num = newraw_num;
	}
//********************************************************************************************
	
	public void submitt(){
		
	
		 		getTimeZone();
	}
	
	public static Map<String, Object> getSecenek2Degeri() {
		return secenek2Degeri;
	}
	public static void setSecenek2Degeri(Map<String, Object> secenek2Degeri) {
		Raw_mng.secenek2Degeri = secenek2Degeri;
	}
	/*public boolean bool_chance(){
		if(sayac==0)
		setBool_send_pro(true);
			
			return true;
	}*/
	
	public void sec(){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ss = sessionFactory.openSession();
		ss.beginTransaction();
		Criteria criteria=ss.createCriteria(Raw.class);
		List<Raw> raw=criteria.add( Restrictions.eq("braw_type",getSelectmenu_sonuc()) ).list();				
		int sonuc=0;
		for (Raw r : raw) {
			
			if(r.getDraw_num()< this.siparis){
				 sayac=sayac+1;
			}
		if(sayac==0){
		setBool_send_pro(true);}
		else{
			setBool_send_pro(false);}
		setBool_rawlist(true);
			}
			
		sayac=0;
		ss.getTransaction().commit();
		 ss.close();
		 sessionFactory.close();
	}
//*******************************************************************************	
	 private static Map<String, Object> secenek2Degeri;

	    static {
	        secenek2Degeri = new LinkedHashMap<String, Object>();
	        secenek2Degeri.put("-- COMPUTERS --", 0); //label, value
	        secenek2Degeri.put("X_COMP", 1); //label, value
	        secenek2Degeri.put("Z_COMP",2);// etiketi, de�eri
	        

	       
	    }

	    public Map<String, Object> getSecenek2DegerleriniAl() {
	        return secenek2Degeri;
	    }
//	****************************************************************************
	public void add(){
    	
		Raw rw = new Raw(this.newraw_type, this.newraw_name, this.newraw_num);
		  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session ss = sessionFactory.openSession();   
		    ss.beginTransaction();
		    ss.save(rw);
		  
		    ss.getTransaction().commit();
			 ss.close();
			 sessionFactory.close();
		    newraw_type=0;
		    newraw_name=null;
		    newraw_num=0;
		    
	}
//***********************************************************************************
public void add_or() throws ParseException{
	
	java.util.Calendar cal = java.util.Calendar.getInstance();
	String dateInString = new java.text.SimpleDateFormat(" dd-MM-yyyy").format(cal.getTime());
	SimpleDateFormat formatter = new SimpleDateFormat(" dd-MM-yyyy");
	Date parsedDate = formatter.parse(dateInString);

			
			Ord_list or= new Ord_list(1, this.newor_name, this.newor_num, parsedDate);
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session ss = sessionFactory.openSession();   
		    ss.beginTransaction();
		    ss.save(or);
		  
		    ss.getTransaction().commit();
			 ss.close();
			 sessionFactory.close();
		    newor_num=0;
		    newor_name=null;
		    newor_tarih=null;
}
	
//********************************************************************************
public void add_or_param(String b,int c) throws ParseException{
	
	java.util.Calendar cal = java.util.Calendar.getInstance();
	String dateInString = new java.text.SimpleDateFormat("dd-MM-yyyy").format(cal.getTime());
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	Date parsedDate = formatter.parse(dateInString);
	
	
/*	Date now = new Date();
	String pattern = "dd-MM-yyyy";
	SimpleDateFormat formatter = new SimpleDateFormat(pattern);
	String mysqlDateString = formatter.format(now);
	System.out.println("Mysql's Default Date Format: " + mysqlDateString);*/

			Ord_list or = new Ord_list(1, b, c, parsedDate);
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session ss = sessionFactory.openSession();   
		    ss.beginTransaction();
		    ss.save(or);
		  
		    ss.getTransaction().commit();
			 ss.close();
			 sessionFactory.close();
		    newor_num=0;
		    newor_name=null;
		    newor_tarih=null;
}
	
//********************************************************************************
	public List<Raw> getAllOfThem(){
	 	
	 	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session ss = sessionFactory.openSession();
			ss.beginTransaction();
			Criteria criteria=ss.createCriteria(Raw.class);
			List<Raw> raw=criteria.add( Restrictions.eq("braw_type",getSelectmenu_sonuc()) ).list();				
			ss.getTransaction().commit();
			 ss.close();
			 sessionFactory.close();
			return raw;

				}
	
//**********************************************************************************	
	 public List<Raw> getRes(){
	    	
	    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session ss = sessionFactory.openSession();
			ss.beginTransaction();
			Criteria criteria=ss.createCriteria(Raw.class).setProjection(Projections.projectionList()
				      .add(Projections.property("craw_name"), "craw_name")
				      )
				    .setResultTransformer(Transformers.aliasToBean(Raw.class));

					List<Raw> rw=criteria.list();
						
					
					ss.getTransaction().commit();
					 ss.close();
					 sessionFactory.close();
			return rw;

	 }
//*********************************************************************************************
	 public void orderSave(){
		 	
		 	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session ss = sessionFactory.openSession();
				ss.beginTransaction();
				Criteria criteria=ss.createCriteria(Raw.class);
				List<Raw> raw=criteria.add( Restrictions.eq("braw_type",getSelectmenu_sonuc()) ).list();				
				int sonuc=0;
				String son=null;
				for (Raw r : raw) {
					if(r.getDraw_num()< this.siparis){
						String raww=r.getCraw_name();
						 sonuc=this.siparis-r.getDraw_num();
						 try {
							add_or_param(raww,sonuc);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						son="ba�ar�l�";
					}else{}	}
				ss.getTransaction().commit();
				 ss.close();
				 sessionFactory.close(); }
//**************************************************************************************************
//********************************************************************************
		public List<Ord_list>getTimeZone(){
			
			
			try {
						
				d = new SimpleDateFormat("yyyy-MM-dd").parse(getFirstTime());
				f =  new SimpleDateFormat("yyyy-MM-dd").parse(getLastTime());
			
			} catch (ParseException e) {
				// TODO Auto-generated catch block
			}
			

			
		 	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session ss = sessionFactory.openSession();
				ss.beginTransaction();
				Criteria criteria=ss.createCriteria(Ord_list.class);
				
				List<Ord_list> or=criteria.add( Restrictions.between("eord_tarih",d,f)).list();				
				ss.getTransaction().commit();
				 ss.close();
				 sessionFactory.close();
					 
						 return or;
}
	
//**********************************************************************************	
	public String rowDel(Ord_list ol){
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session ss = sessionFactory.openSession();   
	    ss.beginTransaction();
	    
	    //------------SiLME-------------
	    
	   
	    ss.delete(ol);
	    ss.getTransaction().commit();
		 ss.close();
		 sessionFactory.close();
		
		
		return null;
		
	}
	//**********************************************************************************	
public String rowUp(Ord_list ol){
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session ss = sessionFactory.openSession();   
	    ss.beginTransaction();
	    
	  int a= ol.getAord_id();
	  int b= ol.getBord_status();
	  String c= ol.getCord_name();
	  int d= ol.getDord_num();
	  Date e= ol.getEord_tarih();
	    
	  
	  Ord_list or= new Ord_list(a, 2, c, d, e);
		
	    ss.save(or);
	  
	    ss.getTransaction().commit();
		 ss.close();
		 sessionFactory.close();
		
		
		return null;
		
	}
//*********************************************************************************************
public List<Purchase> getAccept(){
	
	
	
	
	 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session ss = sessionFactory.openSession();   
	    ss.beginTransaction();
	    
	   
		Criteria criteria=ss.createCriteria(Purchase.class);

		List<Purchase> p=criteria.add( Restrictions.eq("bpur_status",2) ).list();				

		
		ss.getTransaction().commit();
		 ss.close();
		 sessionFactory.close();
	

	
	
	return p;
	
	
}
//*************************************************************************************
public int add_pro(String z,int y,String x) throws ParseException{
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		String dateInString = new java.text.SimpleDateFormat(" dd-MM-yyyy").format(cal.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat(" dd-MM-yyyy");
		Date parsedDate = formatter.parse(dateInString);
		

				Pro_list pl = new Pro_list(1, z, y, x, parsedDate);
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    
			    ss.save(pl);

			   
			    
			    
			    ss.getTransaction().commit();
				 ss.close();
				 sessionFactory.close();
			    newpro_to=null;
			    newpro_name=null;
			    return pl.getApro_id();
	}
//*************************************************************************************
public void up_pro() throws ParseException{
	
	add_pro(this.newpro_name, this.siparis, this.newpro_to);
	
	
	  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session ss = sessionFactory.openSession();   
	    ss.beginTransaction();
	    
        Criteria crit = ss.createCriteria(Raw.class);
        crit.add(Restrictions.eq("braw_type",getSelectmenu_sonuc()));

        ScrollableResults items = crit.scroll();
        while ( items.next() ) {
            Raw r = (Raw)items.get(0);
            r.setDraw_num(r.getDraw_num()-this.siparis);
            
            ss.update(r);
			}
		
		
	    
        ss.getTransaction().commit();
		 ss.close();
		 sessionFactory.close();

	

		}
//*************************************************************************************
}
