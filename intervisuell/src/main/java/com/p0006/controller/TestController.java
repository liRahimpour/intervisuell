package com.p0006.controller;

import com.p0006.entity.BikeRental;
import com.p0006.service.impl.BikeRentalServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @Autowired
    BikeRentalServiceImpl bikeRentalService;
    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/bike_rentals")
    List<BikeRental> getAllBikeRentals() {
        return bikeRentalService.findAll();
    }

}
