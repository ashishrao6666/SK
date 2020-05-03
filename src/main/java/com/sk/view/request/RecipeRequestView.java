package com.sk.view.request;

import com.sk.view.IngredientsView;

import java.util.List;

public class RecipeRequestView {
    private int id;
    private String name;
    private String instructions;
    private List<IngredientsRequestView> ingredients;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<IngredientsRequestView> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientsRequestView> ingredients) {
        this.ingredients = ingredients;
    }
}
