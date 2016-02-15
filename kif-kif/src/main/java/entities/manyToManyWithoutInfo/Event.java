package entities.manyToManyWithoutInfo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity

public class Event implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Participent> participents;

	public Event() {
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

	public List<Participent> getParticipents() {
		return participents;
	}

	public void setParticipents(List<Participent> participents) {
		this.participents = participents;
	}

	public Event(String name) {
		super();
		this.name = name;
	}

}
