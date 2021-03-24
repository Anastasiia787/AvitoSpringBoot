package tech.itpark.avito.manager;


import tech.itpark.avito.domain.Flat;
import tech.itpark.avito.domain.FlatCreate;
import tech.itpark.avito.domain.FlatUpdate;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class FlatManager {
    private long nextId = 1;
    private ArrayList<Flat> flats = new ArrayList<>();

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

    public ArrayList<Flat> searchByPrice(int minPrice, int maxPrice) {
        ArrayList<Flat> search = new ArrayList<>();
        for (Flat flat : flats) {
            if (flat.getPrice() >= minPrice &&
                    flat.getPrice() <= maxPrice
            ) {
                search.add(flat);
            }
        }
        return search;
    }

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

    public Flat updateById(long id, FlatUpdate dto) {
        for (Flat flat : flats) {
            if(flat.getId() == id) {
                flat.setImage(dto.getImage());
                flat.setAddress(dto.getAddress());
                flat.setNumberOfRooms(dto.getNumberOfRooms());
                flat.setArea(dto.getArea());
                flat.setFloor(dto.getFloor());
                flat.setPrice(dto.getPrice());
                return flat;

            }
        }
        return null;
    }

    public void removeById(long id) {
        for (Flat flat : flats) {
            if (flat.getId() == id) {
                flat.setRemoved(true);
            }


    }
}

