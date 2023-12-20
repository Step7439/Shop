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
@NoArgsConstructor
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String warehouse;
    @OneToMany
    @JoinColumn(name = "warehouse_id")
    private List<Entrance> entranceList;

    public Warehouse(long id, String warehouse, List<Entrance> entranceList) {
        this.id = id;
        this.warehouse = warehouse;
        this.entranceList = entranceList;
    }
}
