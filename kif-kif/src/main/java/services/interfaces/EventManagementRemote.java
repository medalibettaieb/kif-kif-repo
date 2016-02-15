package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.manyToManyWithoutInfo.Event;
import entities.manyToManyWithoutInfo.Participent;

@Remote
public interface EventManagementRemote {
	List<Event> findAllEventsByParticipentId(Integer id);

	Participent findParticipentById(Integer id);

	Boolean assignePlayerToTeam(Integer idPlayer, Integer idTeam);

}
