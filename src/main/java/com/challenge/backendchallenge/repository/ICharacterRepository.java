package com.challenge.backendchallenge.repository;

import com.challenge.backendchallenge.model.entity.Character;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICharacterRepository extends JpaRepository<Character, Long> {

    List<Character> findBySoftDeleteIsFalse();

}
