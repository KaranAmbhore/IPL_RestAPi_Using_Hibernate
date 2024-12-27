package com.ipl.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Matches {

	@Id
	private int match_id;
	private String team_one_name;
	private String team_two_name;
	private String date;
	private String venue;
	private String result;
	
	public Matches() {

	}

	public Matches(int match_id, String team_one_name, String team_two_name, String date, String venue, String result) {
		super();
		this.match_id = match_id;
		this.team_one_name = team_one_name;
		this.team_two_name = team_two_name;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public String getTeam_one_name() {
		return team_one_name;
	}

	public void setTeam_one_name(String team_one_name) {
		this.team_one_name = team_one_name;
	}

	public String getTeam_two_name() {
		return team_two_name;
	}

	public void setTeam_two_name(String team_two_name) {
		this.team_two_name = team_two_name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Matches [match_id=" + match_id + ", team_one_name=" + team_one_name + ", team_two_name=" + team_two_name
				+ ", date=" + date + ", venue=" + venue + ", result=" + result + "]";
	}

	
	
}
