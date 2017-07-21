package com.menagedBeans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.enti.Expenses;
import com.enti.Staff;

@ManagedBean(name="exp")
@SessionScoped
public class expenses_mng {

	private int newexid;
    private String newexname;
    private double newexcost;
	private Date newex_tarih;
    private int newextype;
    
	public int getNewexid() {
		return newexid;
	}
	public void setNewexid(int newexid) {
		this.newexid = newexid;
	}
	public String getNewexname() {
		return newexname;
	}
	public void setNewexname(String newexname) {
		this.newexname = newexname;
	}
	public double getNewexcost() {
		return newexcost;
	}
	public void setNewexcost(double newexcost) {
		this.newexcost = newexcost;
	}
	public Date getNewex_tarih() {
		return newex_tarih;
	}
	public void setNewex_tarih(Date newex_tarih) {
		this.newex_tarih = newex_tarih;
	}
	public int getNewextype() {
		return newextype;
	}
	public void setNewextype(int newextype) {
		this.newextype = newextype;
	}
//********************************************************************************************
public void add_exp() throws ParseException{
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		String dateInString = new java.text.SimpleDateFormat(" dd-MM-yyyy").format(cal.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat(" dd-MM-yyyy");
		Date parsedDate = formatter.parse(dateInString);

				Expenses expense = new Expenses(this.newexname, this.newexcost, parsedDate, 1);	
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			    Session ss = sessionFactory.openSession();   
			    ss.beginTransaction();
			    
			    ss.save(expense);
			  
			    ss.getTransaction().commit();
			    sessionFactory.close();
			    newexname=null;
			    newexcost=0.0;
	}
//********************************************************************************************
}
