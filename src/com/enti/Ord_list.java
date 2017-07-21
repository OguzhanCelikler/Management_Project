package com.enti;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ord")
public class Ord_list {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aord_id;
	private int bord_status;
	private String cord_name;
	private int dord_num;
	private Date eord_tarih;
	
	
	
	public Ord_list() {
		super();
	}




	public Ord_list(int aord_id, int bord_status, String cord_name, int dord_num, Date eord_tarih) {
		super();
		this.aord_id = aord_id;
		this.bord_status = bord_status;
		this.cord_name = cord_name;
		this.dord_num = dord_num;
		this.eord_tarih = eord_tarih;
	}




	public Ord_list(int bord_status, String cord_name, int dord_num, Date eord_tarih) {
		super();
		this.bord_status = bord_status;
		this.cord_name = cord_name;
		this.dord_num = dord_num;
		this.eord_tarih = eord_tarih;
	}





	public int getAord_id() {
		return aord_id;
	}

	public void setAord_id(int aord_id) {
		this.aord_id = aord_id;
	}

	public int getBord_status() {
		return bord_status;
	}

	public void setBord_status(int bord_status) {
		this.bord_status = bord_status;
	}

	public String getCord_name() {
		return cord_name;
	}

	public void setCord_name(String cord_name) {
		this.cord_name = cord_name;
	}

	public int getDord_num() {
		return dord_num;
	}

	public void setDord_num(int dord_num) {
		this.dord_num = dord_num;
	}


	public Date getEord_tarih() {
		return eord_tarih;
	}


	public void setEord_tarih(Date eord_tarih) {
		this.eord_tarih = eord_tarih;
	}

	
	
	
}
