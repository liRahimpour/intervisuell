package com.p0006.repository;

import com.p0006.entity.BikeRental;
import com.p0006.entity.ChargingStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
//todo:entity
@Repository
public interface ChargingStationRepository extends JpaRepository<ChargingStation, Long> {
    List<ChargingStation> findAll();
/*
    List<BikeRental> findBikeRentalsByRatingGreaterThanEqual(float rating);
*/


}
