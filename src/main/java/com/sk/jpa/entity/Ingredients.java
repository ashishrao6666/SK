package com.sk.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INGREDIENTS")
public class Ingredients implements Serializable {
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "i_id")
    private Recipe recipe;


    private int recipeId;
    @Id
    @Column(name = "r_id")
    private int id;
    private String name;
    private int quantity;

    public Ingredients(Recipe recipe) {
        this.recipe = recipe;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
