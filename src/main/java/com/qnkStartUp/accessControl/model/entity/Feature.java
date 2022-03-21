package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "features")
@Data
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long feature_id;

    String feature_name;

    String feature_description;

    @ManyToOne
    @JoinColumn(name = "scheme_id")
    private Scheme scheme;

}
