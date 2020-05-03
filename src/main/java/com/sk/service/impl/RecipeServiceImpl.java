package com.sk.service.impl;

import com.sk.jpa.entity.Ingredients;
import com.sk.jpa.entity.Recipe;
import com.sk.repo.IngredientsRepo;
import com.sk.repo.RecipeRepo;
import com.sk.service.RecipeService;
import com.sk.view.IngredientsView;
import com.sk.view.RecipeView;
import com.sk.view.request.RecipeRequestView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepo recipeRepo;

    @Autowired
    private IngredientsRepo ingredientsRepo;

    @Override
    public List<RecipeView> getRecipes() {
        List<Recipe> recipeList = recipeRepo.findAll();
        List<RecipeView> recipeViewList = new ArrayList<>();
        for (Recipe recipe : recipeList) {
            RecipeView recipeView = getRecipeView(recipe);
            recipeViewList.add(recipeView);
        }
        return recipeViewList;
    }

    @Override
    public RecipeView getRecipeById(int id) {
        final Recipe recipe = recipeRepo.findById(id);
        if (recipe != null) {
            return getRecipeView(recipe);
        }
        return null;
    }

    @Override
    public void deleteAll() {
        ingredientsRepo.deleteAll();
        recipeRepo.deleteAll();
    }

    @Override
    public void deleteById(int id) {
        ingredientsRepo.deleteById(id);
        recipeRepo.deleteById(id);
    }

    @Override
    public void createRecipes(RecipeRequestView recipeRequestView) {
        Recipe recipe = new Recipe();
        recipe.setIntr(recipeRequestView.getInstructions());
        recipe.setName(recipeRequestView.getName());
        recipeRepo.save(recipe);
        System.out.println("Resasdsd" + recipe.getId());
    }


    private RecipeView getRecipeView(Recipe recipe) {
        RecipeView recipeView = new RecipeView();
        recipeView.setId(recipe.getId());
        recipeView.setName(recipe.getName());
        recipeView.setInstructions(recipe.getIntr());
        List<Ingredients> ingredientsList = recipe.getIngredients();
        List <IngredientsView> ingredientsViews = new ArrayList<>();
        for (Ingredients ingredients : ingredientsList) {
            IngredientsView ingredientsView = new IngredientsView();
            ingredientsView.setName(ingredients.getName());
            ingredientsView.setQuantity(ingredients.getQuantity());
            ingredientsViews.add(ingredientsView);
        }
        recipeView.setIngredients(ingredientsViews);
        return recipeView;
    }
}
