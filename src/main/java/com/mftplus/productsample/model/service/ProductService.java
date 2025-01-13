package com.mftplus.productsample.model.service;

import com.mftplus.productsample.model.entity.Product;
import com.mftplus.productsample.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void save(Product product) {
        productRepository.save(product);
    }

    public void edit(Product product) {
        productRepository.save(product);
    }

    public void delete(Product product) {
        productRepository.delete(product);
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(long id) {
        return productRepository.findById(id).orElse(null); //this mean is optional
    }

    public List<Product> findByName(String name) {
        return productRepository.findByNameLike(name);
    }

    public List<Product> findByBrand(String brand) {
        return productRepository.findByBrandLike(brand);
    }

    public List<Product> findBySerialNumber(Long serialNumber) {
        return productRepository.findBySerialNumber(serialNumber);
    }

}

