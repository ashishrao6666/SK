package com.sk.service;

import com.sk.view.IngredientsView;
import com.sk.view.InventoryView;

import java.util.List;

public interface InventoryService {
    public List<InventoryView> getInventory();
    public IngredientsView getInventoryById(int id);
}
