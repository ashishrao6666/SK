package com.sk.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "INGREDIENTS")
public class Ingredients {
   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Recipe recipe; */

   //@Column(name = "recipe_id")
   // private int recipeId;
    @Id
    private int id;
    private String name;
    private int quantity;

   /* public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }*/

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
