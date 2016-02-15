package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.EventManagementRemote;

public class TestAddParticipation {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		EventManagementRemote eventManagementRemote = (EventManagementRemote) context
				.lookup("/kif-kif/EventManagement!services.interfaces.EventManagementRemote");

		System.out.println(eventManagementRemote.assignePlayerToTeam(1, 1));

	}

}
