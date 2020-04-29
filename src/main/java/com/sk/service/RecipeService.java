package com.sk.service;

import com.sk.jpa.entity.Recipe;
import com.sk.view.RecipeView;

import java.util.List;

public interface RecipeService {
    public List<RecipeView> getRecipes();
    public RecipeView getRecipeById(int id);
    public void deleteAll();
    void deleteById(int id);
    <recipe> void createRecipes(Recipe recipe);
}


