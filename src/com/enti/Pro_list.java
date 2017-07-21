package com.enti;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prod")
public class Pro_list {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int apro_id;
	private int bpro_status;
	private String cpro_name;
	private int dpro_num;
	private String epro_to;
	private Date fpro_tarih;
	
	public Pro_list() {
		super();
		
	}
	public Pro_list(int apro_id, int bpro_status, String cpro_name, int dpro_num, String epro_to, Date fpro_tarih) {
		super();
		this.apro_id = apro_id;
		this.bpro_status = bpro_status;
		this.cpro_name = cpro_name;
		this.dpro_num = dpro_num;
		this.epro_to = epro_to;
		this.fpro_tarih = fpro_tarih;
	}
	public Pro_list(int bpro_status, String cpro_name, int dpro_num, String epro_to, Date fpro_tarih) {
		super();
		this.bpro_status = bpro_status;
		this.cpro_name = cpro_name;
		this.dpro_num = dpro_num;
		this.epro_to = epro_to;
		this.fpro_tarih = fpro_tarih;
	}
	public int getApro_id() {
		return apro_id;
	}
	public void setApro_id(int apro_id) {
		this.apro_id = apro_id;
	}
	public int getBpro_status() {
		return bpro_status;
	}
	public void setBpro_status(int bpro_status) {
		this.bpro_status = bpro_status;
	}
	public String getCpro_name() {
		return cpro_name;
	}
	public void setCpro_name(String cpro_name) {
		this.cpro_name = cpro_name;
	}
	public int getDpro_num() {
		return dpro_num;
	}
	public void setDpro_num(int dpro_num) {
		this.dpro_num = dpro_num;
	}
	public String getEpro_to() {
		return epro_to;
	}
	public void setEpro_to(String epro_to) {
		this.epro_to = epro_to;
	}
	public Date getFpro_tarih() {
		return fpro_tarih;
	}
	public void setFpro_tarih(Date fpro_tarih) {
		this.fpro_tarih = fpro_tarih;
	}
	

}
