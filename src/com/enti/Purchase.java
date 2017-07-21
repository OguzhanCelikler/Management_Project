package com.enti;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purc")
public class Purchase {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int apur_id;
	private int bpur_status;
	private String cpur_name;
	private int dpur_num;
	private double epur_cost;
	private double tpur_total;	
	private Date fpur_tarih;
	
	
	
	public Purchase() {
		super();
	}
	
	

	public Purchase(int bpur_status, String cpur_name, int dpur_num, double epur_cost, double tpur_total,
			Date fpur_tarih) {
		super();
		this.bpur_status = bpur_status;
		this.cpur_name = cpur_name;
		this.dpur_num = dpur_num;
		this.epur_cost = epur_cost;
		this.tpur_total = tpur_total;
		this.fpur_tarih = fpur_tarih;
	}



	public Purchase(int apur_id, int bpur_status, String cpur_name, int dpur_num, double epur_cost, double tpur_total,
			Date fpur_tarih) {
		super();
		this.apur_id = apur_id;
		this.bpur_status = bpur_status;
		this.cpur_name = cpur_name;
		this.dpur_num = dpur_num;
		this.epur_cost = epur_cost;
		this.tpur_total = tpur_total;
		this.fpur_tarih = fpur_tarih;
	}



	public double getTpur_total() {
		return tpur_total;
	}

	public void setTpur_total(int tpur_total) {
		this.tpur_total = tpur_total;
	}

	public int getApur_id() {
		return apur_id;
	}
	public void setApur_id(int apur_id) {
		this.apur_id = apur_id;
	}
	public int getBpur_status() {
		return bpur_status;
	}
	public void setBpur_status(int bpur_status) {
		this.bpur_status = bpur_status;
	}
	public String getCpur_name() {
		return cpur_name;
	}
	public void setCpur_name(String cpur_name) {
		this.cpur_name = cpur_name;
	}
	public int getDpur_num() {
		return dpur_num;
	}
	public void setDpur_num(int dpur_num) {
		this.dpur_num = dpur_num;
	}
	public double getEpur_cost() {
		return epur_cost;
	}
	public void setEpur_cost(int epur_cost) {
		this.epur_cost = epur_cost;
	}
	public Date getFpur_tarih() {
		return fpur_tarih;
	}
	public void setFpur_tarih(Date fpur_tarih) {
		this.fpur_tarih = fpur_tarih;
	}
	

}
