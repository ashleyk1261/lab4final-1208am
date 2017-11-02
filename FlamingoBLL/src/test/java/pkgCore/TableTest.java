package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {
	@Test
	public void TestTable() {

		// Create a new table
		Table t = new Table();

		// Create players
		Player p1 = new Player("Ashley Kleinhomer", 26);
		Player p2 = new Player("Sue Smith", 17);
		Player p3 = new Player("John Dolbow", 39);

		// Add players to the table & check that they are at the table
		t.AddPlayerToTable(p1);
		assertEquals(1, t.getPlayersInTable().size());
		t.AddPlayerToTable(p2);
		assertEquals(2, t.getPlayersInTable().size());
		t.AddPlayerToTable(p3);
		assertEquals(3, t.getPlayersInTable().size());

		// Get players from the the table & verify they are correct
		assertEquals("Ashley Kleinhomer", t.GetPlayerFromTable(p1).getPlayerName());
		assertEquals("Sue Smith", t.GetPlayerFromTable(p2).getPlayerName());
		assertEquals("John Dolbow", t.GetPlayerFromTable(p3).getPlayerName());

		// Remove players from the table & check that they are no longer at the
		// table
		t.RemovePlayerFromTable(p1);
		assertEquals(2, t.getPlayersInTable().size());
		t.RemovePlayerFromTable(p2);
		assertEquals(1, t.getPlayersInTable().size());
		t.RemovePlayerFromTable(p3);
		assertEquals(0, t.getPlayersInTable().size());
	}
	}


