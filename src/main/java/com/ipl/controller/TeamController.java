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

import com.ipl.entities.Team;
import com.ipl.service.TeamService;


@RestController
@RequestMapping("api/team")
public class TeamController {

	
	@Autowired
	private TeamService teamService;
	
	
	@GetMapping("hello")
	public String demoMethod() {
		
		return "Hello world";
	}
	
	
	@PostMapping("add")
	public Object addTeam(@RequestBody Team team) {
		
		return teamService.addTeam(team);
	}
	
		
	@GetMapping("allteams")
	public List<Team> getAllTeams(){
		
		return teamService.getAllTeams();
	}
	
	
	@GetMapping("id/{id}")
	public Object getTeamById(@PathVariable int id) {
		
		
		return teamService.getTeamById(id);
	}
	
	
	@PutMapping("update/{id}")
	public Object updateTeam(@PathVariable int id,@RequestBody Team team) {
			
		
		return teamService.updateTeam(id,team);
	}
	
	
	@DeleteMapping("delete/{id}")
	public String deleteTeam(@PathVariable int id) {
		
		
		return teamService.deleteTeam(id);
	}
	
	
}
