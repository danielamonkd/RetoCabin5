
package com.ProyectCabin.repository;

import com.ProyectCabin.model.CabinModel;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CabinRepository {
    @Autowired
    private CabinCrudRepository cabinCrudRepository;
    
     public List<CabinModel> getAllCabinModels(){
        return (List<CabinModel>)cabinCrudRepository.findAll();
    }

    public Optional<CabinModel> getCabinById(Integer idCabin){
        return  cabinCrudRepository.findById(idCabin);
   }
   
    public CabinModel save(CabinModel cabinModel){
        return cabinCrudRepository.save(cabinModel);
    }
    
    public CabinModel update(CabinModel cabinModel){
        return cabinCrudRepository.save(cabinModel);
    }
    
    public boolean delete(Integer idCabin){
        cabinCrudRepository.deleteById(idCabin);
        return true;
    }
}
