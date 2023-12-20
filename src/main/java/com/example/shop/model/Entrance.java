package com.example.shop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

@Entity
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Entrance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private final long number;
    private final String nameProduct;

    @ManyToOne(cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "warehouse_id", insertable = false, updatable = false)
    private Warehouse warehouse;

    public Entrance(long number, String nameProduct, Warehouse warehouse) {
        this.number = number;
        this.nameProduct = nameProduct;
        this.warehouse = warehouse;
    }
}
