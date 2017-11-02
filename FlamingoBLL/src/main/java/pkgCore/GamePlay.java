package pkgCore;

import java.util.HashMap;
import java.util.UUID;

import pkgEnum.eGameType;

public abstract class GamePlay {

	private eGameType eGameType;
	private HashMap<UUID, Player> GamePlayers = new HashMap<UUID, Player>();

	public GamePlay(eGameType eGameType)
	{
		super();
		this.eGameType = eGameType;
	}

	// implemented overloaded AddPlayersToGame methods - this method adds a HashMap of Players to the game
	protected void AddPlayersToGame(HashMap<UUID, Player> Players)
	{
		GamePlayers.putAll(Players);
		}

	// implemented overloaded AddPlayersToGame methods - this method adds a single player to the game
	protected void AddPlayersToGame(Player p)
	{
		GamePlayers.put(p.getPlayerID(),p);
		}


	public HashMap<UUID, Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(HashMap<UUID, Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}

	protected void RemovePlayerFromGame(Player p)
	{
		GamePlayers.remove(p.getPlayerID());
	}

	protected Player GetPlayerInGame(Player p)
	{
		return GamePlayers.get(p.getPlayerID());
	}
}
