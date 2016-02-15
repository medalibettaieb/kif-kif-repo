package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Bien
 *
 */
@Entity

public class Bien implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ref;
	private String address;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private User user;

	public Bien() {
		super();
	}

	public Integer getRef() {
		return this.ref;
	}

	public void setRef(Integer ref) {
		this.ref = ref;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
