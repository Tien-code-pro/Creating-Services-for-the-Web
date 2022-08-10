package com.example.luong_minh_tien.controller;

import com.example.luong_minh_tien.entity.Product;
import com.example.luong_minh_tien.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Product>> getList() {
        return ResponseEntity.ok(productService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

}