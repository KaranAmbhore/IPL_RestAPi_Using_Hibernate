package com.ipl.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipl.dao.PlayerRepository;
import com.ipl.entities.Player;
import com.ipl.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Object addPlayer(Player player) {

		if (player.getPlayerId() != 0) {
			playerRepository.save(player);
			return "Player Added Successfully...";
		} else {
			return "Player Cannot be null....";
		}
	}

	@Override
	public List<Player> getAllPlayers() {

		return playerRepository.findAll();
	}

	@Override
	public Object getPlayerById(int id) {

		Optional<Player> player = playerRepository.findById(id);
		if (player.isPresent()) {
			return player;
		} else {
			return "Player with id " + id + " not found";
		}

	}

	@Override
	public Object updatePlayer(int id, Player updatedPlayer) {

		if (updatedPlayer.getPlayerId() == 0) {
			return "Player Cannot be null..";
		} else {

			Optional<Player> player2 = playerRepository.findById(id);
			if (player2.isPresent()) {
				playerRepository.deleteById(id);
				playerRepository.save(updatedPlayer);
				return "Player Updated Successfully...";
			} else

				return "Player Not Found to Update";

		}
	}

	@Override
	public String deletePlayer(int id) {

		Optional<Player> player = playerRepository.findById(id);
		if (player.isPresent()) {
			playerRepository.deleteById(id);
			return "Player Deleted Successfully..";
		} else {

			return "Player Not Exists..";
		}

	}

}
