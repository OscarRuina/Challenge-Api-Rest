package com.challenge.backendchallenge.service.interfaces;

import com.challenge.backendchallenge.model.entity.Character;
import com.challenge.backendchallenge.model.response.ListDetailsCharacterResponse;
import java.util.List;

public interface IListCharactersService {

    ListDetailsCharacterResponse characters();

}
