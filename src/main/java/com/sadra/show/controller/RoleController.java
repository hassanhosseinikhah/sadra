package com.sadra.show.controller;

import com.sadra.show.dto.RoleDto;
import com.sadra.show.services.RoleService;
import com.sadra.show.services.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/role")
public class RoleController {
    private final RoleService roleService;

    @Autowired
    public RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<?> insert(@RequestBody RoleDto roleDto) {
        return new ResponseEntity<>(roleService.insert(roleDto), HttpStatus.OK);
    }
}
