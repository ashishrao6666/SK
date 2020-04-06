package com.sk.view;

import java.util.List;

public class RecipeView {
      private int id;
      private String name;
      private String instructions;
      private  List <IngredientsView> ingredients;

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

    public List<IngredientsView> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientsView> ingredients) {
        this.ingredients = ingredients;
    }
}
