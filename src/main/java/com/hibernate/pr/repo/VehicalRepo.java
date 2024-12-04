package com.hibernate.pr.repo;

import com.hibernate.pr.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface VehicalRepo extends JpaRepository<Vehicle, Integer> {
}
