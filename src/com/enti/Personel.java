package com.enti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="admins")
public class Personel {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	 	private int ausid;
	    private String busname;
	    private String cussurname;
	    private String dusername;
	    private String euspassword;
	    private int fustype;
	    
		
		
	    
	    public Personel(String usname, String ussurname, String username, String uspassword, int ustype) {
			super();
			this.busname = usname;
			this.cussurname = ussurname;
			this.dusername = username;
			this.euspassword = uspassword;
			this.fustype = ustype;
		}
	    
		public Personel() {
		}

		public int getAusid() {
			return ausid;
		}

		public void setAusid(int ausid) {
			this.ausid = ausid;
		}

		public String getBusname() {
			return busname;
		}

		public void setBusname(String busname) {
			this.busname = busname;
		}

		public String getCussurname() {
			return cussurname;
		}

		public void setCussurname(String cussurname) {
			this.cussurname = cussurname;
		}

		public String getDusername() {
			return dusername;
		}

		public void setDusername(String dusername) {
			this.dusername = dusername;
		}

		public String getEuspassword() {
			return euspassword;
		}

		public void setEuspassword(String euspassword) {
			this.euspassword = euspassword;
		}

		public int getFustype() {
			return fustype;
		}

		public void setFustype(int fustype) {
			this.fustype = fustype;
		}
	    
		
	
	
}
