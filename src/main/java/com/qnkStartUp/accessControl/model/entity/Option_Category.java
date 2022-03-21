package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;

/***
 * This class allow to know witch options are available to each category
 */
@Entity
@Table(name = "options_categories")
@Data
public class Option_Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;
}
