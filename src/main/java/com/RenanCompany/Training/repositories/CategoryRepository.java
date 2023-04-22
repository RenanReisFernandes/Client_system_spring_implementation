package com.RenanCompany.Training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RenanCompany.Training.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
