package com.sk.service;

import com.sk.view.IngredientsView;
import com.sk.view.InventoryView;
import com.sk.view.request.InventoryRequestView;

import java.util.List;

public interface InventoryService {
    public List<InventoryView> getInventory();
    void createInventory(List<InventoryRequestView> inventoryRequestView);
}
