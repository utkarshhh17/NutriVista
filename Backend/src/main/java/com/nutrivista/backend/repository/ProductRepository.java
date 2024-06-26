package com.nutrivista.backend.repository;

import com.nutrivista.backend.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
    @Query("{'fieldName': {$regex : ?0, $options: 'i'}}")
    List<String> findByNameStartingWith(String prefix);
}
