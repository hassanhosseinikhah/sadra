package com.sadra.show.services.impl;

import com.sadra.show.dto.RoleDto;
import com.sadra.show.entity.Role;
import com.sadra.show.repository.RoleRepo;
import com.sadra.show.services.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final ModelMapper mapper;
    private final RoleRepo roleRepo;

    @Autowired
    public RoleServiceImpl(ModelMapper mapper, RoleRepo roleRepo) {
        this.mapper = mapper;
        this.roleRepo = roleRepo;
    }

    @Override
    public RoleDto insert(RoleDto roleDto) {
        Role role = mapper.map(roleDto, Role.class);
        roleRepo.save(role);
        return roleDto;
    }
}
