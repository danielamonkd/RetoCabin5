
package com.ProyectCabin.repository;

import com.ProyectCabin.model.AdminModel;
import org.springframework.data.repository.CrudRepository;


public interface AdminCrudRepository extends CrudRepository<AdminModel, Integer> {
    
}
