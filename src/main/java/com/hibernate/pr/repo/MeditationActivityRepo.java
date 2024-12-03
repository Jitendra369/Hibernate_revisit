package com.hibernate.pr.repo;

import com.hibernate.pr.entity.MeditationActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeditationActivityRepo extends JpaRepository<MeditationActivity, Integer> {
}
