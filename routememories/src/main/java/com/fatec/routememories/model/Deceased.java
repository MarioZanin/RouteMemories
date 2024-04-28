package com.fatec.routememories.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Deceased {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String dateOfBirth;
    private String fatherName;
    private String motherName;
    private String dateOfDeath;
    private String burialLocation;
    private String otherInformation;

    // Getters e setters
}

