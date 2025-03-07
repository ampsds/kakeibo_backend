package com.ampsds.kakeibo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ampsds.kakeibo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}