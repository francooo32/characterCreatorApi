package com.gameapis.charactercreator.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.gameapis.charactercreator.model.GameCharacter;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class GameCharacterDaoImpl implements GameCharacterDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	@SuppressWarnings("unchecked")
	public List<GameCharacter> getAllCharacters() {
		String query = "FROM GameCharacter";
		return entityManager.createQuery(query).getResultList();
		
	}

	@Override
	public GameCharacter getById(int id) {
		GameCharacter character = entityManager.find(GameCharacter.class, id);
		return character;
	}

	@Override
	public GameCharacter saveGameCharacter(GameCharacter character) {
		entityManager.merge(character);
		return character;
	}

	@Override
	public void deleteGameCharacter(int id) {
		GameCharacter character = entityManager.find(GameCharacter.class, id);
		entityManager.remove(character);
	}

}
