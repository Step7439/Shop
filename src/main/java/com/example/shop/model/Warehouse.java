package com.example.shop.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private final String warehouse;
    @OneToMany
    @JoinColumn(name = "warehouse_id")
    private List<Entrance> entranceList = new ArrayList<>();

    public Warehouse(String warehouse) {
        this.warehouse = warehouse;
    }
}
