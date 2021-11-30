package com.challenge.backendchallenge.configuration.seeder;

import com.challenge.backendchallenge.model.entity.Character;
import com.challenge.backendchallenge.repository.ICharacterRepository;
import java.sql.Timestamp;
import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CharacterSeeder implements CommandLineRunner {

    private static final String IMAGE = "https://foo.jpg";

    @Autowired
    private ICharacterRepository characterRepository;

    @Override
    public void run(String... args) throws Exception {
        loadCharacters();
    }

    private void loadCharacters() {
        if (characterRepository.count() == 0) {
            loadCharactersSeed();
        }
    }

    private void loadCharactersSeed() {
        characterRepository.save(
                buildCharacter(1L, "Mickey Mouse", 75, 25, "The Most Famous Mouse"));
        characterRepository.save(
                buildCharacter(2L, "Minnie Mouse", 70, 22, "The Girlfriend of Mickie Mouse"));
    }

    private Character buildCharacter(long id, String name, int age, float height,
            String biography) {
        return new Character(
                id,
                IMAGE,
                name,
                age,
                height,
                biography,
                Timestamp.from(Instant.now()),
                false
        );
    }
}
