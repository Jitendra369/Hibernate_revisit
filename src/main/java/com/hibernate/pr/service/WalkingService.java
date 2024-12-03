package com.hibernate.pr.service;

import com.hibernate.pr.entity.Activity;
import com.hibernate.pr.entity.MeditationActivity;
import com.hibernate.pr.entity.WalkingActivity;
import com.hibernate.pr.repo.ActivityRepo;
import com.hibernate.pr.repo.MeditationActivityRepo;
import com.hibernate.pr.repo.WalkingActivityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WalkingService {

    private final WalkingActivityRepo walkingActivityRepo;
    private final MeditationActivityRepo meditationActivityRepo;
    private final ActivityRepo activityRepo;

    public WalkingActivity saveWalkingActivity(WalkingActivity walkingActivity){
        return walkingActivityRepo.save(walkingActivity);
    }

    public MeditationActivity saveMeditationActivity(MeditationActivity meditationActivity){
        return meditationActivityRepo.save(meditationActivity);
    }

    public Activity getActivity(){
        Optional<Activity> activityOptional = activityRepo.findById(4);
        return activityOptional.get();
    }
}
