package com.sk.web.controller;

import com.sk.jpa.entity.Recipe;
import com.sk.service.InventoryService;
import com.sk.service.RecipeService;
import com.sk.view.InventoryView;
import com.sk.view.RecipeView;
import com.sk.view.request.InventoryRequestView;
import com.sk.view.request.RecipeRequestView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private RecipeService recipeService;

    @Autowired
    private InventoryService inventoryService;


    @CrossOrigin(origins = "https://serverless-kitchen.3rik.se")
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/recipes")
    @ResponseBody
    public List<RecipeView> getAllRecipes() {
        return recipeService.getRecipes();
    }

    @GetMapping("/recipes/{id}")
    @ResponseBody
    public RecipeView getRecipeById(@PathVariable int id) {
        return recipeService.getRecipeById(id);
    }

    @GetMapping("/clear")
    @ResponseBody
    public String deleted() {
        recipeService.deleteAll();
        return "Database is cleared";
    }

    @GetMapping ("/clear/{id}")
    @ResponseBody
    public String deleteId(@PathVariable int id) {
        recipeService.deleteById(id);
        return "recipe id number " +id +" deleted";
    }

    @PostMapping("recipes/create")
    @ResponseBody
    public void createRecipes(@RequestBody RecipeRequestView recipe) {

        recipeService.createRecipes(recipe);
    }

    @PatchMapping("/recipes/{id}")
    @ResponseBody
    public void patchRecipeById(@PathVariable int id, @RequestBody RecipeRequestView recipeRequestView) {
        recipeService.patchRecipeById(id,recipeRequestView);
    }

    @GetMapping("/inventory")
    @ResponseBody
    public List<InventoryView> getAllInventories() {
        return inventoryService.getInventory();
    }

    @PostMapping("/inventory/fill")
    @ResponseBody
    public void createInventory(@RequestBody InventoryRequestView inventory) {
        inventoryService.createInventory(inventory);
    }
}