package com.example.shop.repo;

import com.example.shop.model.Entrance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepoEntrance extends JpaRepository<Entrance, Long> {

    Optional<Entrance> findByNameProduct (String nameProduct);
}
