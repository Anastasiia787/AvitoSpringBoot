package tech.itpark.avito.controller;

import org.springframework.web.bind.annotation.*;
import tech.itpark.avito.domain.Flat;
import tech.itpark.avito.domain.FlatCreate;
import tech.itpark.avito.manager.FlatManager;

import java.util.ArrayList;

@RestController
public class FlatController {
   private FlatManager manager = new FlatManager();

   @GetMapping("/flats")
    public ArrayList<Flat> getAll() {
       return manager.getAll();
   }
   @GetMapping("/flats/{id}")
   public Flat getById(@PathVariable long id){
      return manager.getById(id);
   }

   @PostMapping("/flats")
   public Flat create(@RequestBody FlatCreate dto) {
       return manager.register(dto);
   }


}
