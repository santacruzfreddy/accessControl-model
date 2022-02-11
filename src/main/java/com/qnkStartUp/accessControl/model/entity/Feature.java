package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "features")
@Data
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long feature_id;

    String feature_name;

}
