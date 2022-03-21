package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "apps")
@Data
public class App {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long app_id;

    String app_name;

    String app_description;

    Boolean use_scheme;

    @OneToMany(mappedBy = "app", fetch = FetchType.LAZY)
    List<Scheme> schemes;

    @ManyToOne
    @JoinColumn(name = "startUp_id")
    private StartUp startup;
}
