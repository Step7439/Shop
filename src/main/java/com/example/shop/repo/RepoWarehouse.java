package com.example.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shop.model.Warehouse;

@Repository
public interface RepoWarehouse extends JpaRepository<Warehouse, Long>{
}
