package com.RenanCompany.Training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RenanCompany.Training.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
