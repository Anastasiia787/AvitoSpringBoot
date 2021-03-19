package tech.itpark.avito.manager;

import tech.itpark.avito.domain.Flat;
import tech.itpark.avito.domain.FlatCreate;
import tech.itpark.avito.domain.FlatUpdate;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class FlatManager {

    private long nextId = 1;
    private ArrayList<Flat> flats = new ArrayList<Flat>();

    public Flat register(FlatCreate dto) {
        Flat flat = new Flat(
                nextId++,
                "image",
                3,
                45.5,
                3,
                5,
                5500000,
                "Проверено ЕГРН",
                "ЖК Южный",
                "Пушкина",
                "Вахитовский р-н",
                "Тукая",
                2.2,
                "Агенство недвижимости Ключ",
                false,
                OffsetDateTime.now().toEpochSecond(),
                false
        );
        flats.add(flat);
        return flat;
    }
    public Flat updateById(long id, FlatUpdate dto){
        for (Flat flat : flats) {
            if (flat.getId() == id) {
                flat.setImage(dto.getImage());
                flat.setNumberOfRooms(dto.getNumberOfRooms());
                flat.setArea(dto.getArea());
                flat.setFloor(dto.getFloor());
                flat.setTotalFloor(dto.getTotalFloor());
                flat.setPrice(dto.getPrice());
                flat.setAddress(dto.getAddress());
                return flat;
            }
        }
        return null;
    }

    public ArrayList<Flat> getAll() {
        return flats;
    }

    public Flat getById(long id) {
        for (Flat flat : flats) {
            if (flat.getId() == id){
                return flat;
            }
        }

        return null;
    }
}

