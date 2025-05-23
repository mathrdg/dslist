package com.mathrss.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mathrss.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long > {

}
