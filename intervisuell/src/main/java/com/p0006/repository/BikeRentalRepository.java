package com.p0006.repository;

import com.p0006.entity.BikeRental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRentalRepository extends JpaRepository<BikeRental, Long> {
    List<BikeRental> findAll();

    List<BikeRental> findBikeRentalsByRatingGreaterThanEqual(float rating);

}
