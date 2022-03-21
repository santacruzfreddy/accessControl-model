package com.qnkStartUp.accessControl.model.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "passwords")
public class Password {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long password_id;

    String password;

    Boolean state_active;

    LocalDateTime time_active;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
