package com.hibernate.pr.repo;

import com.hibernate.pr.entity.FourWheeler;
import com.hibernate.pr.entity.TwoWheeler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FourWheelerRepo extends JpaRepository<FourWheeler, Integer> {

}
