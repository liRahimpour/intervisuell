package com.p0006.entity;

import jakarta.persistence.*;
import lombok.*;
import org.locationtech.jts.geom.Point;

import java.io.Serial;
import java.io.Serializable;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@ToString
@Entity
@Table(name = "charging_station")
public class ChargingStation implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "id", nullable = true)
    private Long id;
    private String amenity;
    private String capacity;
    @Column(name = "the_geom")
    private Point geom;
    private String membership_card;
    private String name;
    private String operator;
    private String paypal;
}
