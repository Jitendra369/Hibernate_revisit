package com.hibernate.pr.controller;

import com.hibernate.pr.entity.*;
import com.hibernate.pr.service.ProductService;
import com.hibernate.pr.service.QuestionService;
import com.hibernate.pr.service.WalkingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/core")
public class ProductController {

    private final ProductService productService;
    private final QuestionService questionService;
    private final WalkingService walkingService;


    @PostMapping("/prod/save")
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }

    @GetMapping("/prod/{id}")
    public Product getProduct(@PathVariable int id){
        return productService.findProduct(id);
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
        System.out.println();
        questionService.deleteQuestion(id);
    }

    @PostMapping("/wal")
    public void saveWalkingActivity(@RequestBody WalkingActivity walkingActivity){
        walkingService.saveWalkingActivity(walkingActivity);
    }

    @PostMapping("/medi")
    public void saveMeditationActivity(@RequestBody MeditationActivity meditationActivity){
        walkingService.saveMeditationActivity(meditationActivity);
    }

    @GetMapping("/act")
    public Activity getActivity(){
        return walkingService.getActivity();
    }




}
