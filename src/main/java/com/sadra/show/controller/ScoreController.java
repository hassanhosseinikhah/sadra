package com.sadra.show.controller;

import com.sadra.show.dto.ScoreDto;
import com.sadra.show.services.ScoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/score")
public class ScoreController {


    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<?> score(@RequestBody ScoreDto scoreDto) {
        return new ResponseEntity<>(scoreService.insert(scoreDto), HttpStatus.OK);
    }
}
