package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.Bien;
import entities.User;

@Remote
public interface UserServicesRemote {
	Boolean addUser(User user);

	User findUserById(Integer id);

	Boolean assignBienToUser(Integer isUser, Bien bien);
	
	List<Bien>findBiensByUserId(Integer id);
	
	
}
