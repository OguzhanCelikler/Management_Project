package com.enti;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="expenses")
public class Expenses {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aexid;
    private String bexname;
    private double cexcost;
	private Date dex_tarih;
    private int fextype;
    
    
    
    
	public Expenses() {
		super();
	}
	public Expenses(String bexname, double cexcost, Date dex_tarih, int fextype) {
		super();
		this.bexname = bexname;
		this.cexcost = cexcost;
		this.dex_tarih = dex_tarih;
		this.fextype = fextype;
	}
	public Expenses(int aexid, String bexname, double cexcost, Date dex_tarih, int fextype) {
		super();
		this.aexid = aexid;
		this.bexname = bexname;
		this.cexcost = cexcost;
		this.dex_tarih = dex_tarih;
		this.fextype = fextype;
	}
	public int getAexid() {
		return aexid;
	}
	public void setAexid(int aexid) {
		this.aexid = aexid;
	}
	public String getBexname() {
		return bexname;
	}
	public void setBexname(String bexname) {
		this.bexname = bexname;
	}
	public double getCexcost() {
		return cexcost;
	}
	public void setCexcost(double cexcost) {
		this.cexcost = cexcost;
	}
	public Date getDex_tarih() {
		return dex_tarih;
	}
	public void setDex_tarih(Date dex_tarih) {
		this.dex_tarih = dex_tarih;
	}
	public int getFextype() {
		return fextype;
	}
	public void setFextype(int fextype) {
		this.fextype = fextype;
	}
    
	
	
	
}
