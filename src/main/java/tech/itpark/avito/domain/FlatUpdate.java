package tech.itpark.avito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlatUpdate {
    private String image;
    private String address;
    private int numberOfRooms;
    private double area;
    private int floor;
    private long price;

}
