package com.ayouris.keykoak.models;

import javax.persistence.*;

@Entity
@Table(name = "affectation_role")

public class AffectationRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
}
