package com.mftplus.productsample.model.entity;

import jakarta.persistence.*;

@Entity(name = "productEntity")
@Table(name = "product_tbll")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private Long serialNumber;
    private Float buyPrice;

    public Product() {}

    public Product(Long id, String name, String brand, Long serialNumber, Float buyPrice) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.buyPrice = buyPrice;
    }

    public Product(String name, String brand, Long serialNumber, Float buyPrice) {
        this.name = name;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.buyPrice = buyPrice;
    }

    public Long getId() {
        return id;
    }

    public Product setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Product setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public Product setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public Float getBuyPrice() {
        return buyPrice;
    }

    public Product setBuyPrice(Float buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }
}
