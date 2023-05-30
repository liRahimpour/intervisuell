create table if not exists bike_rental
(
    id bigint not null
    constraint bike_rental_pkey
    primary key,
    amenity varchar(255),
    bicycle_re varchar(255),
    capacity varchar(255),
    the_geom geometry,
    name varchar(255),
    opening_ho varchar(255),
    operator varchar(255),
    website varchar(255)
    );

alter table bike_rental owner to admin;