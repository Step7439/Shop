package com.example.shop.service;

import com.example.shop.model.Entrance;
import com.example.shop.model.Warehouse;
import com.example.shop.repo.RepoEntrance;
import com.example.shop.repo.RepoWarehouse;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceProduct {
    private RepoEntrance repoEntrance;
    private RepoWarehouse repoWarehouse;


    public List<Entrance> finds() {
        return repoEntrance.findAll();
    }

    public void addProduct(Entrance entrance) {
      //  if (repoEntrance.findByNameProduct(entrance.getNameProduct()).isEmpty()) {

            repoEntrance.save(entrance);

      //  }
    }
}
