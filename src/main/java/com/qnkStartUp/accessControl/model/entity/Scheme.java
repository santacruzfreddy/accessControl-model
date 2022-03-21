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

    @OneToMany(mappedBy = "scheme", fetch = FetchType.LAZY)
    List<Feature> features;

    @ManyToOne
    @JoinColumn(name = "app_id")
    private App app;

    @OneToMany(mappedBy = "scheme", fetch = FetchType.LAZY)
    private List<Option_Scheme> options;
}
