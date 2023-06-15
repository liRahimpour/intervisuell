package com.p0006.controller;

import com.p0006.entity.ChargingStation;
import com.p0006.service.impl.ChargingStationServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class ChargingStationController {

    @Autowired
    ChargingStationServiceImpl chargingStationService;
    Logger logger = LoggerFactory.getLogger(ChargingStationController.class);

    @GetMapping("/charging_stations")
    List<ChargingStation> getAllChargingStations() {
        return chargingStationService.findAll();
    }

}
