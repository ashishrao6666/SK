package com.sk.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "recipe_id")
    private List<Ingredients> ingredients;

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

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}
