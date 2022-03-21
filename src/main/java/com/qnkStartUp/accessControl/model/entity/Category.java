package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long category_id;

    String category_name;

    String category_description;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    List<Option_Category> options;

}
