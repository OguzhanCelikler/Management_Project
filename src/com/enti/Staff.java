package com.enti;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff2")
public class Staff {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int astid;
    private String bstname;
    private String cstsurname;
    private float dsrsalary;
    private String estmail;
    private Date fstdate;
    private String hstdepartment;
    private int gststatus;
    
    
    
    public Staff() {
		super();
	}
	
    
	public Staff(String bstname, String cstsurname, float dsrsalary, String estmail, Date fstdate,
			String hstdepartment, int gststatus) {
		super();
		this.bstname = bstname;
		this.cstsurname = cstsurname;
		this.dsrsalary = dsrsalary;
		this.estmail = estmail;
		this.fstdate = fstdate;
		this.hstdepartment = hstdepartment;
		this.gststatus = gststatus;
	}


	public Staff(int astid, String bstname, String cstsurname, float dsrsalary, String estmail, Date fstdate,
			String hstdepartment, int gststatus) {
		super();
		this.astid = astid;
		this.bstname = bstname;
		this.cstsurname = cstsurname;
		this.dsrsalary = dsrsalary;
		this.estmail = estmail;
		this.fstdate = fstdate;
		this.hstdepartment = hstdepartment;
		this.gststatus = gststatus;
	}


	public String getHstdepartment() {
		return hstdepartment;
	}
	public void setHstdepartment(String hstdepartment) {
		this.hstdepartment = hstdepartment;
	}
	public int getAstid() {
		return astid;
	}
	public void setAstid(int astid) {
		this.astid = astid;
	}
	public String getBstname() {
		return bstname;
	}
	public void setBstname(String bstname) {
		this.bstname = bstname;
	}
	public String getCstsurname() {
		return cstsurname;
	}
	public void setCstsurname(String cstsurname) {
		this.cstsurname = cstsurname;
	}
	public float getDsrsalary() {
		return dsrsalary;
	}
	public void setDsrsalary(float dsrsalary) {
		this.dsrsalary = dsrsalary;
	}
	public String getEstmail() {
		return estmail;
	}
	public void setEstmail(String estmail) {
		this.estmail = estmail;
	}
	public Date getFstdate() {
		return fstdate;
	}
	public void setFstdate(Date fstdate) {
		this.fstdate = fstdate;
	}
	public int getGststatus() {
		return gststatus;
	}
	public void setGststatus(int gststatus) {
		this.gststatus = gststatus;
	}

}
