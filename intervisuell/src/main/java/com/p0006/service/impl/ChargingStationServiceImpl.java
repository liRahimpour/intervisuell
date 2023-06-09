package com.p0006.service.impl;

import com.p0006.entity.ChargingStation;
import com.p0006.repository.ChargingStationRepository;
import com.p0006.service.ChargingStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargingStationServiceImpl implements ChargingStationService {

    @Autowired
    private ChargingStationRepository chargingStationRepository;

    public List<ChargingStation> findAll() {
        return chargingStationRepository.findAll();
    }


}
