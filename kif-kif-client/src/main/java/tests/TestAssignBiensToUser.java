package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Bien;
import services.interfaces.UserServicesRemote;

public class TestAssignBiensToUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote userServicesRemote = (UserServicesRemote) context
				.lookup("/kif-kif/UserServices!services.interfaces.UserServicesRemote");

		Bien bien = new Bien();
		bien.setAddress("sfax");
		
		System.out.println(userServicesRemote.assignBienToUser(1, bien));
	}

}
