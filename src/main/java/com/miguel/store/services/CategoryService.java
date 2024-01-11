package com.miguel.store.services;

import com.miguel.store.entities.Category;
import com.miguel.store.entities.User;
import com.miguel.store.repositories.CategoryRepository;
import com.miguel.store.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
      Optional<Category> obj = repository.findById(id);
      return obj.get();
    }

}
