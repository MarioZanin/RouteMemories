package com.fatec.routememories.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cemetery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String street;
    private String number;
    private String neighborhood;
    private String city;
    private String state;
    private String mapLocation;
    private String otherInformation;

    // Getters e setters
}
