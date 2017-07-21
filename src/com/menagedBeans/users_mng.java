package com.menagedBeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.enti.Ord_list;
import com.enti.Raw;
import com.enti.Recipe;
import com.enti.Users;

@ManagedBean(name="us")
@SessionScoped
public class users_mng {
	
	private int anewid;
    private String bnewname;
    private String cnewsurname;
    private String dnewusername;
    private String enewpassword;
    private int fnewtype;
    
	private int aanewid;
    private String bbnewname;
    private String ccnewsurname;
    private String ddnewusername;
    private String eenewpassword;
    private int ffnewtype;
    
	public int getAanewid() {
		return aanewid;
	}
	public void setAanewid(int aanewid) {
		this.aanewid = aanewid;
	}
	public String getBbnewname() {
		return bbnewname;
	}
	public void setBbnewname(String bbnewname) {
		this.bbnewname = bbnewname;
	}
	public String getCcnewsurname() {
		return ccnewsurname;
	}
	public void setCcnewsurname(String ccnewsurname) {
		this.ccnewsurname = ccnewsurname;
	}
	public String getDdnewusername() {
		return ddnewusername;
	}
	public void setDdnewusername(String ddnewusername) {
		this.ddnewusername = ddnewusername;
	}
	public String getEenewpassword() {
		return eenewpassword;
	}
	public void setEenewpassword(String eenewpassword) {
		this.eenewpassword = eenewpassword;
	}
	public int getFfnewtype() {
		return ffnewtype;
	}
	public void setFfnewtype(int ffnewtype) {
		this.ffnewtype = ffnewtype;
	}
	public int getAnewid() {
		return anewid;
	}
	public void setAnewid(int anewid) {
		this.anewid = anewid;
	}
	public String getBnewname() {
		return bnewname;
	}
	public void setBnewname(String bnewname) {
		this.bnewname = bnewname;
	}
	public String getCnewsurname() {
		return cnewsurname;
	}
	public void setCnewsurname(String cnewsurname) {
		this.cnewsurname = cnewsurname;
	}
	public String getDnewusername() {
		return dnewusername;
	}
	public void setDnewusername(String dnewusername) {
		this.dnewusername = dnewusername;
	}
	public String getEnewpassword() {
		return enewpassword;
	}
	public void setEnewpassword(String enewpassword) {
		this.enewpassword = enewpassword;
	}
	public int getFnewtype() {
		return fnewtype;
	}
	public void setFnewtype(int fnewtype) {
		this.fnewtype = fnewtype;
	}
	//********************************************
	
	public void control_(){
		
		
	}

//**********************************************************************************************

	public String controlUser(){
		
		String sonuc=null;
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ss = sessionFactory.openSession();
		ss.beginTransaction();
		Criteria criteria=ss.createCriteria(Users.class);
		List<Users> user=criteria.add( Restrictions.eq("dadusername",this.dnewusername) )
								 .add( Restrictions.eq("eadpassword",this.enewpassword) ).list();	
		
	
		if(!user.isEmpty()){
			
			for (Users us : user) {
				
				setBnewname(us.getBadname());
				setCnewsurname(us.getCadsurname());
				setFnewtype(us.getFuadtype());
				
				
				if(us.getFuadtype()==1){
				
					sonuc="a";
				}
				if(us.getFuadtype()==4){
					
					sonuc="z";
				}
				if(us.getFuadtype()==2){
					
					sonuc="b";
				}
				if(us.getFuadtype()==3){

					sonuc="c";
					}
					}
				}else
					sonuc="d";
		
		System.out.println(sonuc);
	return sonuc;
	
	
				}
	public String uyeCikisiniDenetle(){
	    
	      FacesContext context = FacesContext.getCurrentInstance(); 
	      ExternalContext ec = context.getExternalContext(); 
	      final HttpServletRequest request = (HttpServletRequest)ec.getRequest(); 
	      request.getSession( false ).invalidate(); 
	//FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

	     System.out.println("Tebrikler  işlem başarılı");
	     return "index?faces-redirect=false";
	  }
//***************************************************************************************
	 public String getBool_staf(){
	    	
	    	String as=null;
	    	
	    	int a=getFnewtype();
	    	if(a==3 || a==4){
	    		
	    	as="true";
	    		
	    	}else{
	    		as="false";
	    	}
	    	System.out.println(as);
	    	return as;
	    	
	    }
	//***************************************************************************************
		 public String getBool_staf2(){
		    	
		    	String as=null;
		    	
		    	int a=getFnewtype();
		    	if(a==1 || a==4){
		    		
		    	as="true";
		    		
		    	}else{
		    		as="false";
		    	}
		    	System.out.println(as);
		    	return as;
		    	
		    }
		//***************************************************************************************
		 public String getBool_staf3(){
		    	
		    	String as=null;
		    	
		    	int a=getFnewtype();
		    	if(a==2 || a==4){
		    		
		    	as="true";
		    		
		    	}else{
		    		as="false";
		    	}
		    	System.out.println(as);
		    	return as;
		    	
		    }
		//***************************************************************************************
		 public String getBool_staf4(){
		    	
		    	String as=null;
		    	
		    	int a=getFnewtype();
		    	if(a==4){
		    		
		    	as="true";
		    		
		    	}else{
		    		as="false";
		    	}
		    	System.out.println(as);
		    	return as;
		    	
		    }
		//***************************************************************************************
		 public List<Users> getUser(){
			 	
			 	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
					Session ss = sessionFactory.openSession();
					ss.beginTransaction();
					Criteria criteria=ss.createCriteria(Users.class);
							List<Users> us=criteria.list();
						
							 ss.getTransaction().commit();
							 ss.close();
							 sessionFactory.close();
					return us;

						}
		//*************************************************************************************** 
			public String rowDel(Users U){
				
				
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    
			    //------------SiLME-------------
			    
			   
			    ss.delete(U);
			    ss.getTransaction().commit();
				 ss.close();
				 sessionFactory.close();
				
				
				return null;
				
			}
//			****************************************************************************
			public void add_user(){
		    	
					Users us = new Users(this.bbnewname, this.ccnewsurname,this.ddnewusername, this.eenewpassword,this.ffnewtype);
					SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				    Session ss = sessionFactory.openSession();   
				    ss.beginTransaction();
				    ss.save(us);
				  
				    ss.getTransaction().commit();
					 ss.close();
					 sessionFactory.close();
				    bnewname=null;
				    cnewsurname=null;
				    dnewusername=null;
				    enewpassword=null;
				    fnewtype=0;
				    
			}	
		//***********************************************************************************
		 
}