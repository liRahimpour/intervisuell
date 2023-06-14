package com.p0006.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;
import org.locationtech.jts.geom.Point;

import java.io.Serial;
import java.io.Serializable;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@ToString
@Entity
@Table(name = "bike_rental")
public class BikeRental implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "the_geom")
    private Point geom;
    private String amenity;
    @Column(name = "bicycle_re")
    private String bicycleRe;
    private String capacity;
    private String name;
    @Column(name = "opening_ho")
    private String openingHo;
    private String operator;
    @URL
    private String website;
    @Range(min = 1, max = 5)
    @Column(nullable = false)
    private float rating;
}
