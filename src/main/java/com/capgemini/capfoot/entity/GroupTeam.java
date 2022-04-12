package com.capgemini.capfoot.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GroupTeam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int nbDrawMatch;
	private int nbWonMatch;
	private int nbLossMatch;
	private int cumulPoint;

	@ManyToOne
	private Groupe group;

	@ManyToOne
	private Team team;
}
