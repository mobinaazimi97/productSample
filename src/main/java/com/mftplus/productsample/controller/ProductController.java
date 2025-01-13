package com.mftplus.productsample.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mftplus.productsample.model.entity.Product;
import com.mftplus.productsample.model.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public String productHome(Model model) {
        model.addAttribute("products",productService.findAll());
        return "product";
    }
    @PostMapping
    public String productAdd(Product product) {
        productService.save(product);
        return "redirect:/product";
//        return "product";
    }
    @PutMapping
    public String productUpdate(Product product) {
        productService.edit(product);
        return "redirect:/product";
//        return "product";
    }
    @DeleteMapping
    public String productDelete(Product product) {
        productService.delete(product);
//        return "product";
        return "redirect:/product";
    }
    @GetMapping("/brand")
    public String productBrand(Model model){
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValueAsString(productService.findAll());
            model.addAttribute("products", productService.findAll()); //faqat rooye safhe ezafash mikone,roo session nist!!
            model.addAttribute("productBrand", mapper.writeValueAsString(productService.findAll()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "product";
    }

}
