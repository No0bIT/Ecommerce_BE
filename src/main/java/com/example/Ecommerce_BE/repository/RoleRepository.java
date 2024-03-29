package com.example.Ecommerce_BE.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Ecommerce_BE.model.entity.ERole;
import com.example.Ecommerce_BE.model.entity.Roles;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer>{
	Optional<Roles> findByRoleName(ERole roleName);
}
