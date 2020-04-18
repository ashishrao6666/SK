package com.sk.service;

import com.sk.view.RecipeView;

import java.util.List;

public interface RecipeService {
    public List<RecipeView> getRecipes();
    public RecipeView getRecipeById(int id);
}


