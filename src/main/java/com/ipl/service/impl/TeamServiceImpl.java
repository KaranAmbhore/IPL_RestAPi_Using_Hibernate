package com.ipl.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipl.dao.TeamRepository;
import com.ipl.entities.Team;
import com.ipl.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepository;

	@Override
	public Object addTeam(Team team) {
//		System.out.println(team.getTeamId());
//		System.out.println(team.getName());
//		System.out.println(team.getCity());
		System.out.println(team);
		if (team.getTeamId() == 0) {
			return "Cannot add null user...";

		} else {

			return teamRepository.save(team);

		}
	}

	@Override
	public List<Team> getAllTeams() {

		return teamRepository.findAll();
	}

	@Override
	public Object getTeamById(int id) {

		if (id == 0) {
			return "Id Cannot be zero....";
		}
		Optional<Team> team = teamRepository.findById(id);
		if (team.isPresent()) {
			return team;
		} else {
			return "Team with id " + id + " not found...";
		}

		// return teamRepository.findById(id);
	}

	@Override
	public Object updateTeam(int id, Team team) {

		Optional<Team> optionalTeam = teamRepository.findById(id);
		if (optionalTeam.isPresent()) {
			Team existingTeam = optionalTeam.get();

			existingTeam.setName(team.getName());
			existingTeam.setCity(team.getCity());
			existingTeam.setCoach(team.getCoach());
			teamRepository.save(existingTeam);
			return "Team Updated Successfully...";

		} else {

			return "Team with id " + id + " not found...";
		}
	}

	@Override
	public String deleteTeam(int id) {

		if(id==0) {
			return "Invalid Id. Id cannot be zero..";
		}
		
		Optional<Team> team = teamRepository.findById(id);
		
		if(team.isPresent()) {
			
			teamRepository.deleteById(id);
			return "Team Deleted Successfully....";
		}else {
		
		return "Team with id "+id+" not found..";
		}
	}
}
