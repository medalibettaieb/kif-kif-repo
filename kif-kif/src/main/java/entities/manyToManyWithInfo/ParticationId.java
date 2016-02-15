package entities.manyToManyWithInfo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class ParticationId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPlayer;
	private Integer idTeam;
	private Date startDate;

	public ParticationId() {
	}

	public ParticationId(Integer idPlayer, Integer idTeam) {
		super();
		this.idPlayer = idPlayer;
		this.idTeam = idTeam;
		this.startDate = new Date();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPlayer == null) ? 0 : idPlayer.hashCode());
		result = prime * result + ((idTeam == null) ? 0 : idTeam.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParticationId other = (ParticationId) obj;
		if (idPlayer == null) {
			if (other.idPlayer != null)
				return false;
		} else if (!idPlayer.equals(other.idPlayer))
			return false;
		if (idTeam == null) {
			if (other.idTeam != null)
				return false;
		} else if (!idTeam.equals(other.idTeam))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	public Integer getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(Integer idPlayer) {
		this.idPlayer = idPlayer;
	}

	public Integer getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(Integer idTeam) {
		this.idTeam = idTeam;
	}

}
