package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "user", cascade = CascadeType.MERGE)
	private List<Bien> biens;

	public User() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Bien> getBiens() {
		return biens;
	}

	public void setBiens(List<Bien> biens) {
		this.biens = biens;
	}

	public void linkBiensToThisUser(List<Bien> biens) {
		this.biens = biens;
		for (Bien b : biens) {
			b.setUser(this);
		}
	}
}
