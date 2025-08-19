package com.pedrosouza.springLearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedrosouza.springLearning.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
