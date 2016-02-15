package entities;

import entities.User;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Citoyen
 *
 */
@Entity

public class Citoyen extends User implements Serializable {

	
	private String address;
	private static final long serialVersionUID = 1L;

	public Citoyen() {
		super();
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
   
}
