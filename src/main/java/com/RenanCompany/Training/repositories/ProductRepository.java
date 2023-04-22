package com.RenanCompany.Training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RenanCompany.Training.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
