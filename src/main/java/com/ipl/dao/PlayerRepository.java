package com.ipl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipl.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
