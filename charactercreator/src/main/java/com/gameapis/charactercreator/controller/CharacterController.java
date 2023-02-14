package com.gameapis.charactercreator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gameapis.charactercreator.dao.GameCharacterDao;
import com.gameapis.charactercreator.model.GameCharacter;

@RestController
public class CharacterController {
	
	@Autowired
	private GameCharacterDao gameCharacterDao;
	
	@RequestMapping(value = "character")
	public GameCharacter getCharacter() {
		GameCharacter userCharacter = new GameCharacter("Juanito", "Human", "Mage", "yes");
		return userCharacter;
	}
	
	@RequestMapping(value = "character/{id}")
	public GameCharacter getCharacterById(@PathVariable int id) {
		return gameCharacterDao.getById(id);
	}
	
	@RequestMapping(value = "characters")
	public List<GameCharacter> getCharactersList() {
		return gameCharacterDao.getAllCharacters();
	}
	
	@RequestMapping(value = "character/save", method = RequestMethod.POST)
	public GameCharacter saveCharacter(@RequestBody GameCharacter character) {
		return gameCharacterDao.saveGameCharacter(character);
	}
	
	@RequestMapping(value = "character/delete/{id}")
	public String deleteCharacter(@PathVariable int id) {
		 gameCharacterDao.deleteGameCharacter(id);
		 return "El personaje con id " + id + " se borro satisfactoriamente";
	}
}
