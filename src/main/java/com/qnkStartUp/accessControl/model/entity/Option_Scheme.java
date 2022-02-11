package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/*
 *This class allow to link options and schemes to know its relationship,
 * when We need to know witch options are available in each scheme
 */
@Entity
@Table(name = "options_schemes")
@Data
public class Option_Scheme {

}
