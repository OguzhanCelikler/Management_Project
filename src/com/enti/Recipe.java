package com.enti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rec")
public class Recipe {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int arec_id;
	private int brec_type;
	private String crec_name;
	private String drec_motherb;
	private String erec_ram;
	private String frec_case;
	private String grec_monit;
	private String hrec_proc;
	private String irec_graph;
	
	
	
	
	public Recipe() {
		super();
	}
	public Recipe(int brec_type, String crec_name, String drec_motherb, String erec_ram, String frec_case,
			String grec_monit, String hrec_proc, String irec_graph) {
		super();
		this.brec_type = brec_type;
		this.crec_name = crec_name;
		this.drec_motherb = drec_motherb;
		this.erec_ram = erec_ram;
		this.frec_case = frec_case;
		this.grec_monit = grec_monit;
		this.hrec_proc = hrec_proc;
		this.irec_graph = irec_graph;
	}
	public int getArec_id() {
		return arec_id;
	}
	public void setArec_id(int arec_id) {
		this.arec_id = arec_id;
	}
	public int getBrec_type() {
		return brec_type;
	}
	public void setBrec_type(int brec_type) {
		this.brec_type = brec_type;
	}
	public String getCrec_name() {
		return crec_name;
	}
	public void setCrec_name(String crec_name) {
		this.crec_name = crec_name;
	}
	public String getDrec_motherb() {
		return drec_motherb;
	}
	public void setDrec_motherb(String drec_motherb) {
		this.drec_motherb = drec_motherb;
	}
	public String getErec_ram() {
		return erec_ram;
	}
	public void setErec_ram(String erec_ram) {
		this.erec_ram = erec_ram;
	}
	public String getFrec_case() {
		return frec_case;
	}
	public void setFrec_case(String frec_case) {
		this.frec_case = frec_case;
	}
	public String getGrec_monit() {
		return grec_monit;
	}
	public void setGrec_monit(String grec_monit) {
		this.grec_monit = grec_monit;
	}
	public String getHrec_proc() {
		return hrec_proc;
	}
	public void setHrec_proc(String hrec_proc) {
		this.hrec_proc = hrec_proc;
	}
	public String getIrec_graph() {
		return irec_graph;
	}
	public void setIrec_graph(String irec_graph) {
		this.irec_graph = irec_graph;
	}
	
}
