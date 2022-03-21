package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    Integer number_order;

    Integer level;

    @OneToMany(mappedBy = "option")
    private List<Option_Scheme> schemes;

    @OneToMany(mappedBy = "option", fetch = FetchType.LAZY)
    private  List<Option_Category> categories;
}
