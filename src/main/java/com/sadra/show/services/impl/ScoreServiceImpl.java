package com.sadra.show.services.impl;

import com.sadra.show.dto.ScoreDto;
import com.sadra.show.entity.Score;
import com.sadra.show.repository.ScoreRepo;
import com.sadra.show.services.ScoreService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {
    private final ModelMapper mapper;
    private final ScoreRepo scoreRepo;

    @Autowired
    public ScoreServiceImpl(ModelMapper mapper, ScoreRepo scoreRepo) {
        this.mapper = mapper;
        this.scoreRepo = scoreRepo;
    }

    public ScoreDto insert(ScoreDto scoreDto) {
        Score score = mapper.map(scoreDto, Score.class);
        scoreRepo.save(score);
        return scoreDto;
    }
}
