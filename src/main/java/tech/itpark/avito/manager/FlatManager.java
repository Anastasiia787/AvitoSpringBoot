package tech.itpark.avito.manager;


import tech.itpark.avito.domain.Flat;
import tech.itpark.avito.domain.FlatCreate;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class FlatManager {
    private long nextId = 1;
    private ArrayList<Flat> flats = new ArrayList<>();

    public Flat register(FlatCreate dto) {
        Flat flat = new Flat(
                nextId++,
                dto.getUrl(),
                dto.getImage(),
                dto.getResidentialComplex(),
                dto.getAddress(),
                dto.getDistrict(),
                dto.getNumberOfRooms(),
                dto.getArea(),
                dto.getFloor(),
                dto.getTotalFloor(),
                dto.getMetroStation(),
                dto.getPrice(),
                dto.getRealEstateAgency(),
                OffsetDateTime.now().toEpochSecond(),
                false
        );
        flats.add(flat);
        return flat;
    }

    public ArrayList<Flat> getAll() {
        return flats;
    }


    public Flat getById(long id) {
        for (Flat flat : flats) {
            if (flat.getId() == id) {
                return flat;
            }
        }
    return null;
    }

}

