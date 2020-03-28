package com.sk.web.controller;

import com.sk.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private RecipeService recipeService;

    @CrossOrigin(origins = "https://serverless-kitchen.3rik.se")
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/recipes")
    public String recipe() {
        return recipeService.getRecipes();
    }
    // Implement some more
}