package com.enti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admn")
public class Users {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	 	private int aadid;
	    private String badname;
	    private String cadsurname;
	    private String dadusername;
	    private String eadpassword;
	    private int fuadtype;
	    
	    
	    
	    
		public Users() {
			super();
		}
		public Users(String badname, String cadsurname, String dadusername, String eadpassword, int fuadtype) {
			super();
			this.badname = badname;
			this.cadsurname = cadsurname;
			this.dadusername = dadusername;
			this.eadpassword = eadpassword;
			this.fuadtype = fuadtype;
		}
		public Users(int aadid, String badname, String cadsurname, String dadusername, String eadpassword,
				int fuadtype) {
			super();
			this.aadid = aadid;
			this.badname = badname;
			this.cadsurname = cadsurname;
			this.dadusername = dadusername;
			this.eadpassword = eadpassword;
			this.fuadtype = fuadtype;
		}
		public int getAadid() {
			return aadid;
		}
		public void setAadid(int aadid) {
			this.aadid = aadid;
		}
		public String getBadname() {
			return badname;
		}
		public void setBadname(String badname) {
			this.badname = badname;
		}
		public String getCadsurname() {
			return cadsurname;
		}
		public void setCadsurname(String cadsurname) {
			this.cadsurname = cadsurname;
		}
		public String getDadusername() {
			return dadusername;
		}
		public void setDadusername(String dadusername) {
			this.dadusername = dadusername;
		}
		public String getEadpassword() {
			return eadpassword;
		}
		public void setEadpassword(String eadpassword) {
			this.eadpassword = eadpassword;
		}
		public int getFuadtype() {
			return fuadtype;
		}
		public void setFuadtype(int fuadtype) {
			this.fuadtype = fuadtype;
		}
	    
			
	

}
