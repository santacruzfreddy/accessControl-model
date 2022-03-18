package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;

/*
 *This class allow to link options and schemes to know its relationship,
 * when We need to know witch options are available in each scheme
 */
@Entity
@Table(name = "options_schemes")
@Data
public class Option_Scheme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

}
