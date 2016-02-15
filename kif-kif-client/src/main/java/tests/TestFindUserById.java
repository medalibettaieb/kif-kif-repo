package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Citoyen;
import services.interfaces.UserServicesRemote;

public class TestFindUserById {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote userServicesRemote = (UserServicesRemote) context
				.lookup("/kif-kif/UserServices!services.interfaces.UserServicesRemote");

		Citoyen citoyenFound = (Citoyen) userServicesRemote.findUserById(1);

		System.out.println(citoyenFound.getAddress());
	}

}
