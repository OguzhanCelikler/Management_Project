package com.enti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Raw")
public class Raw {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int araw_id;
	private int braw_type;
	private String craw_name;
	private int draw_num;
	
	
	
	public Raw() {
		super();
	}
	
	public Raw(String craw_name) {
		super();
		this.craw_name = craw_name;
	}

	public Raw(int braw_type, String craw_name, int draw_num) {
		super();
		
		this.braw_type = braw_type;
		this.craw_name = craw_name;
		this.draw_num = draw_num;
	}
	public int getAraw_id() {
		return araw_id;
	}
	public void setAraw_id(int araw_id) {
		this.araw_id = araw_id;
	}
	public int getBraw_type() {
		return braw_type;
	}
	public void setBraw_type(int braw_type) {
		this.braw_type = braw_type;
	}
	public String getCraw_name() {
		return craw_name;
	}
	public void setCraw_name(String craw_name) {
		this.craw_name = craw_name;
	}
	public int getDraw_num() {
		return draw_num;
	}
	public void setDraw_num(int draw_num) {
		this.draw_num = draw_num;
	}
}
