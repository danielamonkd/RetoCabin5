
package com.ProyectCabin.repository;


import com.ProyectCabin.model.CabinModel;
import org.springframework.data.repository.CrudRepository;


public interface CabinCrudRepository extends CrudRepository<CabinModel,Integer> {
    
}
