package com.ipl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.entities.Player;
import com.ipl.service.PlayerService;

@RestController
@RequestMapping("api/player")

public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@GetMapping("hello")
	public String demoMethod() {

		return "Hello world";
	}

	@PostMapping("add")
	public Object addPlayer(@RequestBody Player player) {

		return playerService.addPlayer(player);
	}

	@GetMapping("allplayers")
	public List<Player> getAllPlayers() {

		return playerService.getAllPlayers();
	}

	@GetMapping("id/{id}")
	public Object getPlayerById(@PathVariable int id) {

		return playerService.getPlayerById(id);
	}

	@PutMapping("update/{id}")
	public Object updatePlayer(@PathVariable int id, @RequestBody Player player) {

		return playerService.updatePlayer(id, player);
	}

	@DeleteMapping("delete/{id}")
	public String deletePlayer(@PathVariable int id) {

		return playerService.deletePlayer(id);
	}

}
