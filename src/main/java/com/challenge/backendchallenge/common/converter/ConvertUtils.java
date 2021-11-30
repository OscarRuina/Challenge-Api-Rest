package com.challenge.backendchallenge.common.converter;

import com.challenge.backendchallenge.model.entity.Character;
import com.challenge.backendchallenge.model.response.DetailsCharacterResponse;
import com.challenge.backendchallenge.model.response.ListDetailsCharacterResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component("convertUtils")
public class ConvertUtils {

    public DetailsCharacterResponse toResponse(Character character) {
        DetailsCharacterResponse detailsCharacterResponse = new DetailsCharacterResponse();
        detailsCharacterResponse.setImage(character.getImage());
        detailsCharacterResponse.setName(character.getName());
        return detailsCharacterResponse;
    }

    public ListDetailsCharacterResponse toResponseList(List<Character> characters) {
        List<DetailsCharacterResponse> detailsCharacterResponses = new ArrayList<>();
        characters.forEach(character -> {
            detailsCharacterResponses.add(toResponse(character));
        });
        return new ListDetailsCharacterResponse(detailsCharacterResponses);
    }

}
