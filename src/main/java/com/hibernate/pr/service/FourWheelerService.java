package com.hibernate.pr.service;

import com.hibernate.pr.entity.FourWheeler;
import com.hibernate.pr.entity.TwoWheeler;
import com.hibernate.pr.entity.Vehicle;
import com.hibernate.pr.repo.FourWheelerRepo;
import com.hibernate.pr.repo.TwoWheelerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FourWheelerService {

    private final FourWheelerRepo fourWheelerRepo;

    public FourWheeler saveVehicle(FourWheeler fourWheeler){
        return fourWheelerRepo.save(fourWheeler);
    }

    public FourWheeler getFourWheeler(int id){
         return fourWheelerRepo.findById(id).orElseThrow(()-> new RuntimeException("No Vehicle Data Fond for ID "+ id));
    }
}
