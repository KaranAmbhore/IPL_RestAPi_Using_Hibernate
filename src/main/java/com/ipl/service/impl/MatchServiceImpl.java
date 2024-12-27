package com.ipl.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipl.dao.MatchRepository;
import com.ipl.entities.Matches;
import com.ipl.service.MatchService;

@Service
public class MatchServiceImpl implements MatchService {

	@Autowired
	private MatchRepository matchRepository;

	@Override
	public Object addMatch(Matches match) {

		if (match.getMatch_id() != 0) {
			matchRepository.save(match);
			return "Match Added Successfully...";
		} else {
			return "Cannot Add Match..Match is Null...";
		}
	}

	@Override
	public List<Matches> getAllMatches() {

		return matchRepository.findAll();
	}

	@Override
	public Object getMatchById(int id) {

		Optional<Matches> match = matchRepository.findById(id);
		if (match.isPresent()) {
			return match;
		} else {

			return "Match Not Found....";
		}
	}

	@Override
	public Object updateMatch(int id, Matches updatedMatch) {

		Optional<Matches> match = matchRepository.findById(id);

		if (updatedMatch.getMatch_id() == 0) {
			return "Match Cannot be Null...";
		} else if (match.isPresent()) {
			matchRepository.deleteById(id);
			matchRepository.save(updatedMatch);
			return "Match Updated Successfully...";
		} else {

			return "Match Doesn't Exists..";

		}
	}

	@Override
	public String deleteMatch(int id) {

		Optional<Matches> match = matchRepository.findById(id);
		if (match.isPresent()) {
			matchRepository.deleteById(id);
			return "Match Deleted Successfully...";
		} else {

			return "Match Doesn't Exists...";
		}

	}

}
