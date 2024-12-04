package com.hibernate.pr.controller;

import com.hibernate.pr.entity.FourWheeler;
import com.hibernate.pr.entity.TwoWheeler;
import com.hibernate.pr.entity.Vehicle;
import com.hibernate.pr.repo.FourWheelerRepo;
import com.hibernate.pr.service.FourWheelerService;
import com.hibernate.pr.service.TwoWheelerService;
import com.hibernate.pr.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/core/vehicle")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;
    private final FourWheelerService fourWheelerService;

    @PostMapping("/two")
    public void saveVehicle(@RequestBody TwoWheeler twoWheeler){
         vehicleService.saveVehicle(twoWheeler);
    }

    @PostMapping("/four")
    public void saveFourWheeler(@RequestBody FourWheeler fourWheeler){
        vehicleService.saveVehicle(fourWheeler);
    }

    @GetMapping("/{id}")
    public Vehicle getVehicleData(@PathVariable int id){
        return vehicleService.getVehicle(id);
    }

    @GetMapping("/four/{id}")
    public Vehicle getFourWheelerVehicle(@PathVariable int id){
        return fourWheelerService.getFourWheeler(id);
    }

    @GetMapping("/gen/{id}")
    public Vehicle getGenericVehicle(@PathVariable int id){
        return vehicleService.getBaseClassVehicle(id);
    }
}
