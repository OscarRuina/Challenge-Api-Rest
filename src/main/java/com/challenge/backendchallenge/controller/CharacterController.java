package com.challenge.backendchallenge.controller;

import com.challenge.backendchallenge.model.response.ListDetailsCharacterResponse;
import com.challenge.backendchallenge.service.interfaces.IListCharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @Autowired
    private IListCharactersService listCharactersService;

    @GetMapping(value = "/characters", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ListDetailsCharacterResponse> list() {
        return new ResponseEntity<>(listCharactersService.characters(), HttpStatus.OK);
    }

}
