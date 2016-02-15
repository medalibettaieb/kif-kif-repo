package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.GreetingsServicesRemote;

public class TestGreetingsServices {
	public static void main(String[] args) throws NamingException {

		Context context = new InitialContext();
		GreetingsServicesRemote proxy = (GreetingsServicesRemote) context
				.lookup("/kif-kif/GreetingsServices!services.interfaces.GreetingsServicesRemote");

		proxy.tiSallem("fedi");

	}
}
