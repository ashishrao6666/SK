package com.sk.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "RECIPE")
public class Recipe {
    private int id;
    private String name;
    private String intr;
}
