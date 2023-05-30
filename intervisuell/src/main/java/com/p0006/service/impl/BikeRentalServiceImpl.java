package com.p0006.service.impl;

import com.p0006.entity.BikeRental;
import com.p0006.repository.BikeRentalRepository;
import com.p0006.service.BikeRentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeRentalServiceImpl implements BikeRentalService {

    @Autowired
    private BikeRentalRepository bikeRentalRepository;

    public List<BikeRental> findAll() {
        /*save_csv();*/

        return bikeRentalRepository.findAll();
    }

}
