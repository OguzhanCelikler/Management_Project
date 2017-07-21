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

import com.enti.Purchase;
import com.enti.Recipe;
import com.enti.Staff;
import com.enti.Users;

@ManagedBean(name="stf")
@SessionScoped
public class staff_mng {
	
	private int newstid;
    private String newstname;
    private String newstsurname;
    private float newsrsalary;
    private String newstmail;
    private Date newstdate;
    private int newststatus;
    private String newstdepartment;
    private boolean satff_bool;
    
	public boolean isSatff_bool() {
		return satff_bool;
	}
	public void setSatff_bool(boolean satff_bool) {
		this.satff_bool = satff_bool;
	}
	public String getNewstdepartment() {
		return newstdepartment;
	}
	public void setNewstdepartment(String newstdepartment) {
		this.newstdepartment = newstdepartment;
	}
	public int getNewstid() {
		return newstid;
	}
	public void setNewstid(int newstid) {
		this.newstid = newstid;
	}
	public String getNewstname() {
		return newstname;
	}
	public void setNewstname(String newstname) {
		this.newstname = newstname;
	}
	public String getNewstsurname() {
		return newstsurname;
	}
	public void setNewstsurname(String newstsurname) {
		this.newstsurname = newstsurname;
	}
	public float getNewsrsalary() {
		return newsrsalary;
	}
	public void setNewsrsalary(float newsrsalary) {
		this.newsrsalary = newsrsalary;
	}
	public String getNewstmail() {
		return newstmail;
	}
	public void setNewstmail(String newstmail) {
		this.newstmail = newstmail;
	}
	public Date getNewstdate() {
		return newstdate;
	}
	public void setNewstdate(Date newstdate) {
		this.newstdate = newstdate;
	}
	public int getNewststatus() {
		return newststatus;
	}
	public void setNewststatus(int newststatus) {
		this.newststatus = newststatus;
	}

//************************************************************************************************
public void add_staff() throws ParseException{
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		String dateInString = new java.text.SimpleDateFormat(" dd-MM-yyyy").format(cal.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat(" dd-MM-yyyy");
		Date parsedDate = formatter.parse(dateInString);

				Staff staff = new Staff(this.newstname, this.newstsurname, this.newsrsalary,this.newstmail,parsedDate,this.newstdepartment, 1);
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    
			    ss.save(staff);
			  
			    ss.getTransaction().commit();
				 ss.close();
				 sessionFactory.close();
				 newstsurname=null;
			    newstname=null;
			    newsrsalary=0;
			    newstmail=null;
			    newstdepartment=null;
	}
//************************************************************************************************
public List<Staff> getAllOfStaff(){
 	
 	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ss = sessionFactory.openSession();
		ss.beginTransaction();
		Criteria criteria=ss.createCriteria(Staff.class);
				List<Staff> s=criteria.list();
			
				ss.getTransaction().commit();
				 ss.close();
				 sessionFactory.close();
		return s;

			}
 

}
