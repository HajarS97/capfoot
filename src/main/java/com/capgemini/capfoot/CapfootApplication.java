package com.capgemini.capfoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.capfoot.entity.Championship;
import com.capgemini.capfoot.repository.ChampionshipRepo;
import com.capgemini.capfoot.service.ChampionshipService;

@SpringBootApplication
public class CapfootApplication implements CommandLineRunner {

	@Autowired
	ChampionshipService championshipService;

	@Autowired
	ChampionshipRepo championshipRepo;

	public static void main(String[] args) {
		SpringApplication.run(CapfootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
