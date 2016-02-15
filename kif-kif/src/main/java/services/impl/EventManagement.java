package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.manyToManyWithInfo.Participation;
import entities.manyToManyWithInfo.Player;
import entities.manyToManyWithInfo.Team;
import entities.manyToManyWithoutInfo.Event;
import entities.manyToManyWithoutInfo.Participent;
import services.interfaces.EventManagementRemote;

/**
 * Session Bean implementation class EventManagement
 */
@Stateless
public class EventManagement implements EventManagementRemote {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public EventManagement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Event> findAllEventsByParticipentId(Integer id) {
		Participent participentFound = entityManager.find(Participent.class, id);

		return participentFound.getEvents();
	}

	@Override
	public Participent findParticipentById(Integer id) {
		return entityManager.find(Participent.class, id);
	}

	@Override
	public Boolean assignePlayerToTeam(Integer idPlayer, Integer idTeam) {
		Boolean b = false;
		try {

			Player player = entityManager.find(Player.class, idPlayer);
			Team team = entityManager.find(Team.class, idTeam);
			Participation participation = new Participation(player, team);
			entityManager.persist(participation);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

}
