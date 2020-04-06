package com.sk.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sk.jpa.entity.Recipe;
import com.sk.service.RecipeService;
import com.sk.view.RecipeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @ResponseBody
    public List<RecipeView> recipe() {
        return recipeService.getRecipes();
    }
    // Implement some more
}