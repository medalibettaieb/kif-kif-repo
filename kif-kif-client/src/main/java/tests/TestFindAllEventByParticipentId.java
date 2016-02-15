package tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.manyToManyWithoutInfo.Event;
import services.interfaces.EventManagementRemote;

public class TestFindAllEventByParticipentId {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		EventManagementRemote eventManagementRemote = (EventManagementRemote) context
				.lookup("/kif-kif/EventManagement!services.interfaces.EventManagementRemote");
		
		List<Event> events=eventManagementRemote.findAllEventsByParticipentId(1);

	}

}
