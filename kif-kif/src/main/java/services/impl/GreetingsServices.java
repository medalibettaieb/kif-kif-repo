package services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import services.interfaces.GreetingsServicesLocal;
import services.interfaces.GreetingsServicesRemote;
import services.interfaces.TowLocal;

/**
 * Session Bean implementation class GreetingsServices
 */
@Stateless
public class GreetingsServices implements GreetingsServicesRemote, GreetingsServicesLocal {
	@EJB
	TowLocal towLocal;

	/**
	 * Default constructor.
	 */
	public GreetingsServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tiSallem(String name) {
		towLocal.doSomething();
		System.out.println("ahla w sahla ya :" + name);

	}

}
