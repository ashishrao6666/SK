package com.sk.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "RECIPE")
public class Recipe implements Serializable {
    @Id
    @Column(name = "r_id")
    private int id;
    @Column(name = "r_name")
    private String name;
    @Column(name = "r_intr")
    private String intr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntr() {
        return intr;
    }

    public void setIntr(String intr) {
        this.intr = intr;
    }
}
