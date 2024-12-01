package com.hibernate.pr.controller;

import com.hibernate.pr.entity.Product;
import com.hibernate.pr.entity.Question;
import com.hibernate.pr.service.ProductService;
import com.hibernate.pr.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/core")
public class ProductController {

    private final ProductService productService;
    private final QuestionService questionService;

    @PostMapping("/save")
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }

    @PostMapping("/que/save")
    public Question saveQuestion(@RequestBody Question question){
        return questionService.saveQuestion(question);
    }

    @GetMapping("/que/{id}")
    public Question getQuestion(@PathVariable int id){
        return questionService.getQuestion(id);
    }

    @DeleteMapping("/que/{id}")
    public void deleteQuestion(@PathVariable int id){
        questionService.deleteQuestion(id);
    }


}
