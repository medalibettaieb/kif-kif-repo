package services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Bien;
import entities.User;
import services.interfaces.UserServicesLocal;
import services.interfaces.UserServicesRemote;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addUser(User user) {
		Boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
			System.err.println("problem ...");
		}
		return b;
	}

	@Override
	public User findUserById(Integer id) {
		return entityManager.find(User.class, id);
	}

	@Override
	public Boolean assignBienToUser(Integer isUser, Bien bien) {
		Boolean b = false;
		try {
			User userFound = findUserById(isUser);
			List<Bien> oldBiens = new ArrayList<Bien>();
			oldBiens.add(bien);

			userFound.linkBiensToThisUser(oldBiens);

			entityManager.merge(userFound);
			b = true;
		} catch (Exception e) {
			System.err.println("problem ...");
		}
		return b;
	}

	@Override
	public List<Bien> findBiensByUserId(Integer id) {
		List<Bien> biens = new ArrayList<>();
		Query query = entityManager.createNativeQuery("select b from Bien b where b.user=:param");
		query.setParameter("param", id);
		biens = query.getResultList();
		return biens;
	}

}
