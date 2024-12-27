package com.ipl.service;

import java.util.List;

import com.ipl.entities.Player;

public interface PlayerService {

	Object addPlayer(Player player);

	List<Player> getAllPlayers();

	Object getPlayerById(int id);

	Object updatePlayer(int id, Player player);

	String deletePlayer(int id);

}
