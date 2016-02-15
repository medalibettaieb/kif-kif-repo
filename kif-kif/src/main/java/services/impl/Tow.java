package services.impl;

import javax.ejb.Asynchronous;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import services.interfaces.TowLocal;
import services.interfaces.TowRemote;

/**
 * Session Bean implementation class Tow
 */
@Stateless
@LocalBean
@Asynchronous
public class Tow implements TowRemote, TowLocal {

    /**
     * Default constructor. 
     */
    public Tow() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}

}
