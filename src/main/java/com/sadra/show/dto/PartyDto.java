package com.sadra.show.dto;

import com.sadra.show.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyDto {

    private Long id;
    private String name;
    private PartyDto mentor;
    private Role role;
}
