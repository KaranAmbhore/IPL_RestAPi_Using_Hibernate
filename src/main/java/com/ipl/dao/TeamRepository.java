package com.ipl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipl.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Integer>{

}
