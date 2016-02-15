package entities.manyToManyWithInfo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Participation
 *
 */
@Entity

public class Participation implements Serializable {

	@EmbeddedId
	private ParticationId particationId;
	private Integer yearsPlayed;
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idPlayer", referencedColumnName = "id", insertable = false, updatable = false)
	private Player player;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idTeam", referencedColumnName = "id", insertable = false, updatable = false)
	private Team team;

	public Participation() {
		super();
	}

	public Participation(Player player, Team team) {
		super();
		this.particationId = new ParticationId(player.getId(), team.getId());
		this.player = player;
		this.team = team;
	}

	public Integer getYearsPlayed() {
		return this.yearsPlayed;
	}

	public void setYearsPlayed(Integer yearsPlayed) {
		this.yearsPlayed = yearsPlayed;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
