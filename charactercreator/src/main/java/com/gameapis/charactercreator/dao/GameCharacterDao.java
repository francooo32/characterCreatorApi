package com.gameapis.charactercreator.dao;

import java.util.List;

import com.gameapis.charactercreator.model.GameCharacter;

public interface GameCharacterDao {

	List<GameCharacter> getAllCharacters();
	
	GameCharacter getById(int id);
	
	GameCharacter saveGameCharacter(GameCharacter character);
	
	void deleteGameCharacter(int id);
}
