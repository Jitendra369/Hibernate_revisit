package com.hibernate.pr.service;

import com.hibernate.pr.entity.Product;
import com.hibernate.pr.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public void saveProduct(Product product){
        productRepo.save(product);
    }
}
