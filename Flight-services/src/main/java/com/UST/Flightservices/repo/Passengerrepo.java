package com.UST.Flightservices.repo;


import com.UST.Flightservices.entity.Passengerinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Passengerrepo  extends JpaRepository<Passengerinfo,Long> {


    }

