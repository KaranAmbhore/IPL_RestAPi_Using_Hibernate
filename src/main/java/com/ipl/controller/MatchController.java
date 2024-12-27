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

import com.ipl.entities.Matches;
import com.ipl.service.MatchService;

@RestController
@RequestMapping("api/match")

public class MatchController {

	@Autowired
	private MatchService matchService;

	@GetMapping("hello")
	public String demoMethod() {

		return "Hello world";
	}

	@PostMapping("add")
	public Object addMatch(@RequestBody Matches match) {

		return matchService.addMatch(match);
	}

	@GetMapping("allmatches")
	public List<Matches> getAllMatches() {

		return matchService.getAllMatches();
	}

	@GetMapping("id/{id}")
	public Object getMatchById(@PathVariable int id) {

		return matchService.getMatchById(id);
	}

	@PutMapping("update/{id}")
	public Object updateMatch(@PathVariable int id, @RequestBody Matches match) {

		return matchService.updateMatch(id, match);
	}

	@DeleteMapping("delete/{id}")
	public String deleteMatch(@PathVariable int id) {

		return matchService.deleteMatch(id);
	}

}
