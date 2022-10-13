
package com.ProyectCabin.controller;

import com.ProyectCabin.model.CabinModel;
import com.ProyectCabin.service.CabinService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Cabin")
@CrossOrigin(origins = "*")

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

