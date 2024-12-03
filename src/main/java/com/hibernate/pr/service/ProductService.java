package com.hibernate.pr.service;

import com.hibernate.pr.entity.Product;
import com.hibernate.pr.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;
    private final ReviewService reviewService;

    public void saveProduct(Product product){
        reviewService.saveAll(product.getReview());
        productRepo.save(product);
    }

    public Product findProduct(int id){
        Optional<Product> productOptional = productRepo.findById(id);
        return productOptional.get();
    }
}
