package com.sadra.show.services.impl;

import com.sadra.show.dto.PartyDto;
import com.sadra.show.entity.Party;
import com.sadra.show.repository.PartyRepo;
import com.sadra.show.services.PartyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyServiceImpl implements PartyService {
    private final ModelMapper mapper;
    private final PartyRepo partyRepo;

    @Autowired
    public PartyServiceImpl(ModelMapper mapper, PartyRepo partyRepo) {
        this.mapper = mapper;
        this.partyRepo = partyRepo;
    }

    @Override
    public PartyDto insert(PartyDto partyDTO) {
        Party party = mapper.map(partyDTO, Party.class);
        partyRepo.save(party);
        return partyDTO;
    }
}
