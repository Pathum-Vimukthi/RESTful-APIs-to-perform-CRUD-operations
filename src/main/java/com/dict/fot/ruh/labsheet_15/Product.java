package com.dict.fot.ruh.labsheet_15;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    private Integer id;
    private String pname;
    private float price;

    public Product() {
    }

    public Product(Integer id, String pname, float price) {
        this.id = id;
        this.pname = pname;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return pname;
    }

    public void setName(String pname) {
        this.pname = pname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
