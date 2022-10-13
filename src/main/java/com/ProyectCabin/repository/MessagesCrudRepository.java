
package com.ProyectCabin.repository;

import com.ProyectCabin.model.MessagesModel;
import org.springframework.data.repository.CrudRepository;


public interface MessagesCrudRepository extends CrudRepository<MessagesModel, Integer>{
    
}
