package com.miguel.store.services;

import com.miguel.store.entities.Category;
import com.miguel.store.entities.Product;
import com.miguel.store.repositories.CategoryRepository;
import com.miguel.store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
      Optional<Product> obj = repository.findById(id);
      return obj.get();
    }

}
