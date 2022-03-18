package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "countries")
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long country_id;

    String country_name;

    String country_code;

}
