package com.sk.service;

import com.sk.view.RecipeView;
import com.sk.view.request.RecipeRequestView;

import java.util.List;

public interface RecipeService {
    public List<RecipeView> getRecipes();
    public RecipeView getRecipeById(int id);
    public void deleteAll();
    void deleteById(int id);
    void createRecipes(RecipeRequestView recipeRequestView);
}


