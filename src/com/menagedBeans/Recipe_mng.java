package com.menagedBeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.enti.Personel;
import com.enti.Raw;
import com.enti.Recipe;

@ManagedBean(name="rec")
@SessionScoped
public class Recipe_mng {
	
	
	private int newrec_id;
	private int newrec_type;
	private String newrec_name;
	private String newrec_motherb;
	private String newrec_ram;
	private String newrec_case;
	private String newrec_monit;
	private String newrec_proc;
	private String newrec_graph;
	
	
	public int getNewrec_id() {
		return newrec_id;
	}
	public void setNewrec_id(int newrec_id) {
		this.newrec_id = newrec_id;
	}
	public int getNewrec_type() {
		return newrec_type;
	}
	public void setNewrec_type(int newrec_type) {
		this.newrec_type = newrec_type;
	}
	public String getNewrec_name() {
		return newrec_name;
	}
	public void setNewrec_name(String newrec_name) {
		this.newrec_name = newrec_name;
	}
	public String getNewrec_motherb() {
		return newrec_motherb;
	}
	public void setNewrec_motherb(String newrec_motherb) {
		this.newrec_motherb = newrec_motherb;
	}
	public String getNewrec_ram() {
		return newrec_ram;
	}
	public void setNewrec_ram(String newrec_ram) {
		this.newrec_ram = newrec_ram;
	}
	public String getNewrec_case() {
		return newrec_case;
	}
	public void setNewrec_case(String newrec_case) {
		this.newrec_case = newrec_case;
	}
	public String getNewrec_monit() {
		return newrec_monit;
	}
	public void setNewrec_monit(String newrec_monit) {
		this.newrec_monit = newrec_monit;
	}
	public String getNewrec_proc() {
		return newrec_proc;
	}
	public void setNewrec_proc(String newrec_proc) {
		this.newrec_proc = newrec_proc;
	}
	public String getNewrec_graph() {
		return newrec_graph;
	}
	public void setNewrec_graph(String newrec_graph) {
		this.newrec_graph = newrec_graph;
	}
	
public void add(){
    	
	
			Recipe re =new Recipe(this.newrec_type, this.newrec_name, this.newrec_motherb, this.newrec_ram, this.newrec_case, this.newrec_monit, this.newrec_proc, this.newrec_graph);
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session ss = sessionFactory.openSession();   
		    ss.beginTransaction();
		    ss.save(re);
		  
		    ss.getTransaction().commit();
		    newrec_type=0;
		    newrec_name=null;
		    newrec_motherb=null;
		    newrec_ram=null;
		    newrec_case=null;
		    newrec_monit=null;
		    newrec_proc=null;
		    newrec_graph=null;
		    sessionFactory.close();

	}

public List<Recipe> getAllOfThem(){
 	
 	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ss = sessionFactory.openSession();
		ss.beginTransaction();
		Criteria criteria=ss.createCriteria(Recipe.class);
				List<Recipe> rec=criteria.list();
			
				 ss.getTransaction().commit();
				 ss.close();
				 sessionFactory.close();
		return rec;

			}

}
