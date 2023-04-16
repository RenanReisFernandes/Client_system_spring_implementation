package com.RenanCompany.Training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RenanCompany.Training.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
