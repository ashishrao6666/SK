package com.sk.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INGREDIENTS")
public class Ingredients implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ingredients_seq_gen")
    @SequenceGenerator(name="ingredients_seq_gen", sequenceName="INGREDIENTS_SEQ", allocationSize = 1)
    @Column(name = "i_id")
    private int id;
    @Column(name = "i_name")
    private String name;
    @Column(name = "i_quantity")
    private int quantity;

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
