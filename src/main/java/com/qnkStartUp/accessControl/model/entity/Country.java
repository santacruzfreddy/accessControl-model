package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
@Data
public class Country {

    Long country_id;

    String country_name;

    String country_code;

}
