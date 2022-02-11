package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "options")
@Data
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long option_id;

    String option_name;

    String option_description;

    String path;

    int order;

    int level;

}
