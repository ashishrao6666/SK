package com.sk.repo;

import com.sk.jpa.entity.Ingredients;
import com.sk.jpa.entity.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IngredientsRepo extends CrudRepository<Ingredients, Integer> {
    //Ingredients findById(int id);
    List <Ingredients> findAllById(int id);
}
