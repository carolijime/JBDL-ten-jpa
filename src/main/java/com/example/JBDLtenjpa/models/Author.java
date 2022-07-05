package com.example.JBDLtenjpa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {

    @Id
    private int id;

    //Homework: below, why this change (colum unique) does not trigger the update of the table in the DB?
    @Column(unique = true)
    private String name;

    private int age;
}
