package com.hibernate.pr.service;

import com.hibernate.pr.entity.Review;
import com.hibernate.pr.repo.ReviewRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class ReviewService {


    private final ReviewRepo reviewRepo;

    public void saveReview(Review review){
        reviewRepo.save(review);
    }

    public void saveAll(Set<Review> reviewSet){
        reviewRepo.saveAll(reviewSet);
    }
}
