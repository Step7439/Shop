package com.example.shop.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

@Entity
@Data
@NoArgsConstructor
public class Entrance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long number;
    private String nameProduct;

    @ManyToOne(cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

    public Entrance(long number, String nameProduct, Warehouse warehouse) {
        this.number = number;
        this.nameProduct = nameProduct;
        this.warehouse = warehouse;
    }
}
