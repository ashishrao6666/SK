package com.sk.service;

import com.sk.jpa.entity.Recipe;
import com.sk.view.RecipeView;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RecipeService {
    public List<RecipeView> getRecipes();
}
