package com.sk.service.impl;

import com.sk.jpa.entity.Inventory;
import com.sk.repo.InventoryRepo;
import com.sk.service.InventoryService;
import com.sk.view.InventoryView;
import com.sk.view.request.InventoryRequestView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
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

    @Override
    public void createInventory(InventoryRequestView inventoryRequestView) {
        Inventory inventory = new Inventory();
        inventory.setInvName(inventoryRequestView.getName());
        inventory.setInvQuantity(inventoryRequestView.getQuantity());
        inventoryRepo.save(inventory);
    }

    private InventoryView getInventoryView(Inventory inventory) {
        InventoryView inventoryView = new InventoryView();
        inventoryView.setQuantity(inventory.getInvQuantity());
        inventoryView.setName(inventory.getInvName());
        return inventoryView;
    }

}
