package com.ipl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipl.entities.Matches;

public interface MatchRepository extends JpaRepository<Matches, Integer>{

}
