package com.p0006.controller;

import com.p0006.entity.BikeRental;
import com.p0006.service.impl.BikeRentalServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")           //  /api/v1/bike_rentals
public class BikeRentalController {    // /api/v1/rating

    @Autowired
    BikeRentalServiceImpl bikeRentalService;
    Logger logger = LoggerFactory.getLogger(BikeRentalController.class);

    @GetMapping("/bike_rentals")
    List<BikeRental> getAllBikeRentals() {
        return bikeRentalService.findAll();
    }

    @GetMapping("/rating")
    List<BikeRental> getBikeRentalsWithRating(@RequestParam("rating") float rating) {
        return bikeRentalService.bikeRentalSearchAfterRating(rating);
    }

}
