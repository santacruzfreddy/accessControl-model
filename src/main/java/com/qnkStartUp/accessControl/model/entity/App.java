package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

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

    @OneToMany
    List<Scheme> schemes;
}
