package com.sk.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INVENTORY")
public class Inventory implements Serializable {
    @Id
    @Column(name = "inv_id")
    private int inv_id;
    @Column(name = "inv_name")
    private String inv_name;
    @Column(name = "inv_quantity")
    private int inv_quantity;

    public int getInv_id() {
        return inv_id;
    }

    public void setInv_id(int inv_id) {
        this.inv_id = inv_id;
    }

    public String getInv_name() {
        return inv_name;
    }

    public void setInv_name(String inv_name) {
        this.inv_name = inv_name;
    }

    public int getInv_quantity() {
        return inv_quantity;
    }

    public void setInv_quantity(int inv_quantity) {
        this.inv_quantity = inv_quantity;
    }
}
