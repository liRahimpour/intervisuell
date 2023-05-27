package com.p0006.dto;

import lombok.Data;
import org.hibernate.validator.constraints.URL;
import org.locationtech.jts.geom.Point;

import java.io.Serializable;

@Data
public class BikeRentalDto implements Serializable {
    private Point geom;
    private String amenity;
    private String bicycleRe;
    private String capacity;
    private String name;
    private String openingHo;
    private String operator;
    @URL
    private String website;
}
