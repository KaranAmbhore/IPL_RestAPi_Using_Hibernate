package com.ipl.service;

import java.util.List;

import com.ipl.entities.Team;

public interface TeamService {

	public Object addTeam(Team team);

	public List<Team> getAllTeams();

	public Object getTeamById(int id);

	public Object updateTeam(int id, Team team);

	public String deleteTeam(int id);

}
