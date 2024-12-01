package com.hibernate.pr.controller;

import com.hibernate.pr.entity.Product;
import com.hibernate.pr.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/core")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/save")
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }
}
