package com.challenge.backendchallenge.service.implementation;

import com.challenge.backendchallenge.common.converter.ConvertUtils;
import com.challenge.backendchallenge.model.response.ListDetailsCharacterResponse;
import com.challenge.backendchallenge.repository.ICharacterRepository;
import com.challenge.backendchallenge.service.interfaces.IListCharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CharacterServiceImpl implements IListCharactersService {

    @Autowired
    private ICharacterRepository characterRepository;

    @Autowired
    private ConvertUtils convertUtils;

    @Override
    @Transactional(readOnly = true)
    public ListDetailsCharacterResponse characters() {
        ListDetailsCharacterResponse listDetailsCharacterResponse = convertUtils.toResponseList(
                characterRepository.findBySoftDeleteIsFalse());
        return listDetailsCharacterResponse;
    }
}
