package pkgCore;

import static org.junit.Assert.*;

import java.util.HashMap;

import pkgEnum.eGameType;
import pkgCore.GamePlay;
import pkgCore.GamePlayBlackJack;



import org.junit.Test;

public class GamePlayTest {
	@Test
	public void TestTable() {

		//Create a new table
		Table t = new Table();


		// Create a new game
		GamePlayBlackJack game = new GamePlayBlackJack(pkgEnum.eGameType.BLACKJACK);

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

		// Add players as a HashList to the game
		game.AddPlayersToGame(t.getPlayersInTable());
		assertEquals(3, game.getGamePlayers().size());

		// Remove players from the game
		game.RemovePlayerFromGame(p3);
		assertEquals(2, game.getGamePlayers().size());

		// Add a single player to the game
		game.AddPlayersToGame(p3);
		assertEquals(3, game.getGamePlayers().size());

		// Get players to verify they are in the game
		assertEquals("Ashley Kleinhomer",game.GetPlayerInGame(p1).getPlayerName());
		assertEquals("John Dolbow",game.GetPlayerInGame(p3).getPlayerName());

		// Try adding a duplicate record & check the size of the HashMap to see if it increased
		game.AddPlayersToGame(p3);
		assertEquals(3, game.getGamePlayers().size());

}}