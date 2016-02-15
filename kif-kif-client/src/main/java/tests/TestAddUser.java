package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Citoyen;
import services.interfaces.UserServicesRemote;

public class TestAddUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote userServicesRemote = (UserServicesRemote) context
				.lookup("/kif-kif/UserServices!services.interfaces.UserServicesRemote");

		Citoyen citoyen = new Citoyen();
		citoyen.setName("sala7");
		citoyen.setAddress("gafsa");

		userServicesRemote.addUser(citoyen);
	}

}
