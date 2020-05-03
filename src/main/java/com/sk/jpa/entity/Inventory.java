package com.sk.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INVENTORY")
public class Inventory implements Serializable {
    @Id
    @Column(name = "inv_id")
    private int invId;
    @Column(name = "inv_name")
    private String invName;
    @Column(name = "inv_quantity")
    private int invQuantity;

    public int getInvId() {
        return invId;
    }

    public void setInvId(int invId) {
        this.invId = invId;
    }

    public String getInvName() {
        return invName;
    }

    public void setInvName(String invName) {
        this.invName = invName;
    }

    public int getInvQuantity() {
        return invQuantity;
    }

    public void setInvQuantity(int invQuantity) {
        this.invQuantity = invQuantity;
    }
}
