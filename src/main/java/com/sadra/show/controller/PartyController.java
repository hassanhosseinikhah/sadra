package com.sadra.show.controller;

import com.sadra.show.dto.PartyDto;
import com.sadra.show.services.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/party")
public class PartyController {
    private final PartyService partyService;

    @Autowired
    public PartyController(PartyService partyService) {
        this.partyService = partyService;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<?> insert(@RequestBody PartyDto partyDTO) {
        return new ResponseEntity<>(partyService.insert(partyDTO), HttpStatus.OK);
    }

}
