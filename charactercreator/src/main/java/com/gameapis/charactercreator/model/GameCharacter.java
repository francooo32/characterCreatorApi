package com.gameapis.charactercreator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gamecharacter")
public class GameCharacter {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "race")
	private String race;
	@Column(name = "characterclass")
	private String characterClass;
	@Column(name = "cancastmagic")
	private String canCastMagic;
	
	public GameCharacter(String name, String race, String characterClass, String canCastMagic){
		this.name = name;
		this.race = race;
		this.characterClass = characterClass;
	    this.canCastMagic = canCastMagic;
	}
	
	public GameCharacter(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}

	public String isCanCastMagic() {
		return canCastMagic;
	}

	public void setCanCastMagic(String canCastMagic) {
		this.canCastMagic = canCastMagic;
	}

	@Override
	public String toString() {
		return "GameCharacter [id=" + id + ", name=" + name + ", race=" + race + ", characterClass=" + characterClass
				+ ", canCastMagic=" + canCastMagic + "]";
	}
	
	

}
