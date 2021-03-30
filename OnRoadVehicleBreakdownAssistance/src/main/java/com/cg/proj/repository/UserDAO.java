package com.cg.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.proj.entity.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

}
