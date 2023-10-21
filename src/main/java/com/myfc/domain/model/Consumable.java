package com.myfc.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "tb_consumable")
public class Consumable {
    @Id
    private Long id;
    private String name;
    private int quantity;
    private String description;
    private String image_url;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}