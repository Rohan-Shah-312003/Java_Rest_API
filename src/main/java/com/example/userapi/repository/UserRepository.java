package com.example.userapi.repository;

import com.example.userapi.model.User;
import org.springframework.data.jpa.repository.JpaReposiitory;
import org.springframework.stereotype.*;

@Resository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
