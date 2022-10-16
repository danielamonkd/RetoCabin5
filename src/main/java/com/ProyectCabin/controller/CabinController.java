
package com.ProyectCabin.controller;

import com.ProyectCabin.model.CabinModel;
import com.ProyectCabin.service.CabinService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Cabin")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})


public class CabinController {
    @Autowired private CabinService cabinService;

    @GetMapping("/all")
    public List<CabinModel> getAllCabinModels(){
        return cabinService.getAllCabinModels();
    }

    @GetMapping("/{id}")
    public Optional<CabinModel> getCabinById(@PathVariable("id") Integer id) {
        return cabinService.getCabinById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public CabinModel save (@RequestBody CabinModel cabinModel){
        cabinService.saveCabinModel(cabinModel);
        return cabinService.saveCabinModel(cabinModel);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public CabinModel update(@RequestBody CabinModel cabinModel) {
        return cabinService.update(cabinModel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return cabinService.deleteCabinModel(id);
    }
    
}

