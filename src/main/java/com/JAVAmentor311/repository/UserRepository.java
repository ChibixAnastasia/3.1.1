package com.JAVAmentor311.repository;

import com.JAVAmentor311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
    @Modifying
    @Query(value = "update users set name = :name , age = :age where id = :id",nativeQuery = true)
    void updateUser(@Param("id") Long id, @Param("name") String name, @Param("age") int age);
}