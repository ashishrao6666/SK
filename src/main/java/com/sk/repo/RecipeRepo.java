package com.sk.repo;

import com.sk.jpa.entity.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RecipeRepo extends CrudRepository<Recipe, Integer> {
    Recipe findById(int id);
    List<Recipe> findAll();
    void deleteAll();
    void deleteById(int id);
    List<Recipe> save(Recipe recipe);
}

