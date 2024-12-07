package com.zam.reactive.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class UserEntity {

    @Id
    private Integer id;
    private String username;
    private String email;
    private String password;

}
