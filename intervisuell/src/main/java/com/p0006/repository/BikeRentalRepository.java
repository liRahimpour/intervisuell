package com.p0006.repository;

import com.p0006.entity.BikeRental;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRentalRepository extends JpaRepository<BikeRental, Long> {
    @NonNull List<BikeRental> findBikeRentalByOpeningHo(String oh);

}
