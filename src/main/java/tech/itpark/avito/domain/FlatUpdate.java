package tech.itpark.avito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlatUpdate {
    private String image;
    private int numberOfRooms;
    private double area;
    private int floor;
    private int totalFloor;
    private long price;
    private String address;

}
