package com.sk.repo;

import com.sk.jpa.entity.Ingredients;
import com.sk.jpa.entity.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IngredientsRepo extends CrudRepository<Ingredients, Integer> {
    //Ingredients findById(int id);
    List <Ingredients> findById(int id);
    void deleteAll();
}
