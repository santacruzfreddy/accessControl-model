package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "schemes")
@Data
public class Scheme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long scheme_id;

    String scheme_name;

    String scheme_description;

    @OneToOne
    Configuration configuration;

    @OneToMany
    List<Feature> features;
}
