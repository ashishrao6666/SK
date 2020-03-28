package com.sk.service.impl;

import com.sk.service.RecipeService;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Override
    public String getRecipes() {
        return "cakes";
    }
}
