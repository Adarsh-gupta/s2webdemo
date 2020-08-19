package com.sheryians.s2webdemo.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.logging.Logger;

@Entity
@Data

public class User {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String name;
    private String email;
    private int age;



    public User() {

    }
}
