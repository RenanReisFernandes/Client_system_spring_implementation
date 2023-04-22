package com.RenanCompany.Training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RenanCompany.Training.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
