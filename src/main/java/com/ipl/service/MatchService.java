package com.ipl.service;

import java.util.List;

import com.ipl.entities.Matches;

public interface MatchService {

	Object addMatch(Matches match);

	List<Matches> getAllMatches();

	Object getMatchById(int id);

	Object updateMatch(int id, Matches match);

	String deleteMatch(int id);

}
