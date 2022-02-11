package com.qnkStartUp.accessControl.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.Fetch;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long user_id;

    String user_name;

    @OneToMany(fetch = FetchType.LAZY)
    List<Password> passwords;
}
