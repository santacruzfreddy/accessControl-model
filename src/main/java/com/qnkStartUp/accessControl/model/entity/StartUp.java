package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "startups")
@Data
public class StartUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long startup_id;

    String startup_name;

    String startup_description;

    @OneToMany(mappedBy = "startup" , fetch = FetchType.LAZY)
    private List<App> apps;

}
