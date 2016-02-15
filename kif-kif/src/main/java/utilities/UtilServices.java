package utilities;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Bien;
import entities.Citoyen;
import entities.manyToManyWithInfo.Player;
import entities.manyToManyWithInfo.Team;
import entities.manyToManyWithoutInfo.Event;
import entities.manyToManyWithoutInfo.Participent;

/**
 * Session Bean implementation class UtilServices
 */
@Singleton
@LocalBean
@Startup
public class UtilServices {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UtilServices() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initDb() {
		Participent participent = new Participent("sami");
		Participent participent2 = new Participent("samia");

		Event event = new Event("festival");

		List<Participent> participents = new ArrayList<>();
		participents.add(participent);
		participents.add(participent2);

		event.setParticipents(participents);

		entityManager.persist(event);

		Player player = new Player("slatan");

		Team team = new Team("juventus");

		entityManager.persist(team);

		entityManager.persist(player);

		Citoyen citoyen = new Citoyen();
		citoyen.setName("sala7");

		Bien bien = new Bien();
		bien.setAddress("sfax");

		List<Bien> biens = new ArrayList<>();
		biens.add(bien);

		//citoyen.setBiens(biens);

		entityManager.persist(citoyen);

	}

}
