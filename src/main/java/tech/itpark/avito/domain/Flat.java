package tech.itpark.avito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Flat {
    private long id;
    private String url;
    private String image;
    private int numberOfRooms;
    private double area;
    private int floor;
    private int totalFloor;
    private long price;
    private String verification;
    private String residentialComplex;
    private String address;
    private String district;
    private String metroStation;
    private double distanceToMetro;
    private String realEstateAgency;
    private boolean liked;
    private long created;
}
