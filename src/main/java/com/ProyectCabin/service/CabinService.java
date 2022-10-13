
package com.ProyectCabin.service;


import com.ProyectCabin.model.CabinModel;
import com.ProyectCabin.repository.CabinRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabinService {
    @Autowired
    private CabinRepository cabinRepository;
    
    public List<CabinModel> getAllCabinModels(){
        return cabinRepository.getAllCabinModels();
    }
    
    public Optional<CabinModel> getCabinById(Integer id) {
        return cabinRepository.getCabinById(id);
    }
    
    public CabinModel saveCabinModel(CabinModel cabinModel){
        return cabinRepository.save(cabinModel);
    }
    
    public boolean deleteCabinModel(Integer id) {
       return cabinRepository.delete(id);
}
    public CabinModel update(CabinModel cabinModel){
        Optional <CabinModel> objeto = getCabinById(cabinModel.getId());
        if(objeto.isPresent()){
            if(cabinModel.getBrand()!=null){
                objeto.get().setBrand(cabinModel.getBrand());
            }
            if(cabinModel.getCategory()!=null){
                objeto.get().setCategory(cabinModel.getCategory());
            }
            if(cabinModel.getDescription()!=null){
                objeto.get().setDescription(cabinModel.getDescription());
            }
            if(cabinModel.getName()!=null){
                objeto.get().setName(cabinModel.getName());
            }
            if(cabinModel.getRooms()!=null){
                objeto.get().setRooms(cabinModel.getRooms());
            }
            return cabinRepository.update(objeto.get());
        }
        return cabinModel;
    }
}