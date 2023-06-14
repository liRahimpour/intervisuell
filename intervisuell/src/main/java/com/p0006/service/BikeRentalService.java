package com.p0006.service;

import com.p0006.entity.BikeRental;

import java.util.List;

public interface BikeRentalService {

    List<BikeRental> findAll();

    List<BikeRental> bikeRentalSearchAfterRating(float rating);

}
