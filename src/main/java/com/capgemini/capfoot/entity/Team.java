package com.capgemini.capfoot.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	@Enumerated(EnumType.STRING)
	private Site site;

	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@ToString.Exclude
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private List<Player> players;
	private int nbPlayers;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
	@ToString.Exclude

	private List<GroupTeam> groupTeam;

	public Team(long id, String name, String site, List<Player> players) {
		this.id = id;
		this.name = name;
		this.players = players;
	}

	public Team(String teamName, Site site) {
		this.name = teamName;
		this.site = site;
	}
}
