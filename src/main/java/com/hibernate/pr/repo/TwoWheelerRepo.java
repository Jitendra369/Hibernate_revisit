package com.hibernate.pr.repo;

import com.hibernate.pr.entity.TwoWheeler;
import com.hibernate.pr.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TwoWheelerRepo extends JpaRepository<TwoWheeler, Integer> {

}
