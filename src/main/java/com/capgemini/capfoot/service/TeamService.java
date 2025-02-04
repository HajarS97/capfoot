package com.capgemini.capfoot.service;

import com.capgemini.capfoot.entity.Team;

import java.util.List;

public interface TeamService {

	Team addTeam(Team team);

	Team getTeamByName(String name);

	List<Team> gatAllTeam();

	Team updateTeam(Team team);

	Boolean deleteTeam(Team team);

	Boolean deleteTeamById(Long id);

	Team inscription(Team team);

	List<Team> getAllTeamsByChampionat(Long idChamp);

}
