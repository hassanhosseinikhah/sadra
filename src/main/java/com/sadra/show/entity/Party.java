package com.sadra.show.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "party")
public class Party {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private Party mentor;
    @ManyToOne
    private Role role;
}
