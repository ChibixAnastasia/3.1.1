package com.JAVAmentor311.repository;

import com.JAVAmentor311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@EnableJpaRepositories("com.JAVAmentor311.repository")
public interface UserRepository extends JpaRepository<User, Long> {
}
