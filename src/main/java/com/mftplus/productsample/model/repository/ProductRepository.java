package com.mftplus.productsample.model.repository;

import com.mftplus.productsample.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameLike(String name);
    List<Product> findByBrandLike(String brand);
    List<Product> findBySerialNumber(Long serialNumber);
}
