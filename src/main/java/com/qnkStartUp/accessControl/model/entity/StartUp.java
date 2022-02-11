package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "startups")
@Data
public class StartUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long startUp_id;

    String startUp_name;

    String startUp_description;
}
