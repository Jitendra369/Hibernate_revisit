package com.hibernate.pr.service;

import com.hibernate.pr.entity.TwoWheeler;
import com.hibernate.pr.entity.Vehicle;
import com.hibernate.pr.repo.TwoWheelerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TwoWheelerService {

    private final TwoWheelerRepo vehicleRepo;

    public Vehicle saveVehicle(TwoWheeler twoWheeler){
        return vehicleRepo.save(twoWheeler);
    }
}
