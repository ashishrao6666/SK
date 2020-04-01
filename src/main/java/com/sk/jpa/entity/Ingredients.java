package com.sk.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "INGREDIENTS")
public class Ingredients {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    private Recipe recipe;
    private String name;
    private String quantity;
}
