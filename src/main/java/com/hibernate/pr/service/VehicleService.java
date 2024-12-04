package com.hibernate.pr.service;

import com.hibernate.pr.entity.Vehicle;
import com.hibernate.pr.repo.VehicalRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Transient;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.format.TextStyle;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final TwoWheelerService twoWheelerService;
    private final FourWheelerService fourWheelerService;
    private final VehicalRepo vehicalRepo;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public <T extends Vehicle> void saveVehicle(T vehicle){
        entityManager.persist(vehicle);
    }

    public Vehicle getVehicle(Integer id){
       return entityManager.find(Vehicle.class, id);
    }

    public Vehicle getBaseClassVehicle(int id ){
         return vehicalRepo.findById(id).orElseThrow(()-> new RuntimeException("No vehicle data found having ID " + id));
    }


}
