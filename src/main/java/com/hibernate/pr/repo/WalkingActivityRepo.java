package com.hibernate.pr.repo;


import com.hibernate.pr.entity.WalkingActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalkingActivityRepo extends JpaRepository<WalkingActivity, Integer> {
}
