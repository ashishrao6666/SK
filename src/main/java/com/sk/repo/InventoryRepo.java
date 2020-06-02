package com.sk.repo;

import com.sk.jpa.entity.Inventory;
import com.sk.jpa.entity.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InventoryRepo extends CrudRepository<Inventory, Integer> {
    List<Inventory> findAll();
    Inventory findByInvNameIgnoreCase(String name);
}
