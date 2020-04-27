package com.sk.service.impl;

import com.sk.jpa.entity.Inventory;
import com.sk.repo.InventoryRepo;
import com.sk.service.InventoryService;
import com.sk.view.InventoryView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class InventoryServiceImpl implements InventoryService
{
    @Autowired
    private InventoryRepo inventoryRepo;

    @Override
    public List<InventoryView> getInventory() {
        List<Inventory> inventoryList = inventoryRepo.findAll();
        List<InventoryView> inventoryViewList = new ArrayList<>();
        for (Inventory inventory : inventoryList) {
            InventoryView inventoryView = getInventoryView(inventory);
            inventoryViewList.add(inventoryView);
        }
        return inventoryViewList;
    }

    private InventoryView getInventoryView(Inventory inventory) {
        InventoryView inventoryView = new InventoryView();
        inventoryView.setQuantity(inventory.getInv_quantity());
        inventoryView.getName(inventory.getInv_name());
        return inventoryView;
    }

}
