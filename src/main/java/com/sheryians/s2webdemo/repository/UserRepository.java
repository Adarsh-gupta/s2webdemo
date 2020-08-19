package com.sheryians.s2webdemo.repository;

import com.sheryians.s2webdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
