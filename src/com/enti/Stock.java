package com.enti;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ast_id;
	private int bst_status;
	private String cst_name;
	private int dst_num;
	private String est_to;
	private Date fst_tarih;
	
	
	public Stock() {
		super();
	}
	public Stock(int bst_status, String cst_name, int dst_num, String est_to, Date fst_tarih) {
		super();
		this.bst_status = bst_status;
		this.cst_name = cst_name;
		this.dst_num = dst_num;
		this.est_to = est_to;
		this.fst_tarih = fst_tarih;
	}
	public Stock(int ast_id, int bst_status, String cst_name, int dst_num, String est_to, Date fst_tarih) {
		super();
		this.ast_id = ast_id;
		this.bst_status = bst_status;
		this.cst_name = cst_name;
		this.dst_num = dst_num;
		this.est_to = est_to;
		this.fst_tarih = fst_tarih;
	}
	public int getAst_id() {
		return ast_id;
	}
	public void setAst_id(int ast_id) {
		this.ast_id = ast_id;
	}
	public int getBst_status() {
		return bst_status;
	}
	public void setBst_status(int bst_status) {
		this.bst_status = bst_status;
	}
	public String getCst_name() {
		return cst_name;
	}
	public void setCst_name(String cst_name) {
		this.cst_name = cst_name;
	}
	public int getDst_num() {
		return dst_num;
	}
	public void setDst_num(int dst_num) {
		this.dst_num = dst_num;
	}
	public String getEst_to() {
		return est_to;
	}
	public void setEst_to(String est_to) {
		this.est_to = est_to;
	}
	public Date getFst_tarih() {
		return fst_tarih;
	}
	public void setFst_tarih(Date fst_tarih) {
		this.fst_tarih = fst_tarih;
	}
}
