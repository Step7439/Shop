package com.example.shop.controller;

import com.example.shop.model.Entrance;
import com.example.shop.repo.RepoEntrance;
import com.example.shop.service.ServiceProduct;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class contProduct {

    ServiceProduct product;

    @GetMapping(value = "/findsAll")
    public List<Entrance> findsAll(){
        return product.finds();
    }

    @PostMapping(value = "/entrance")
    public void entrance(@RequestBody Entrance entrance) {
        product.addProduct(entrance);
    }
}
