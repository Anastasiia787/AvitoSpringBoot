package tech.itpark.avito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlatCreate {
    private String url;
    private String image;
    private String residentialComplex;
    private String address;
    private String district;
    private int numberOfRooms;
    private double area;
    private int floor;
    private int totalFloor;
    private String metroStation;
    private long price;
    private String realEstateAgency;
}
