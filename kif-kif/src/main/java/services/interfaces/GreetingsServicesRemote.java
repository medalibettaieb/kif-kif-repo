package services.interfaces;

import javax.ejb.Remote;

@Remote
public interface GreetingsServicesRemote {
	void tiSallem(String name);
}
