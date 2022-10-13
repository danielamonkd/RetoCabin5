
package com.ProyectCabin.repository;

import com.ProyectCabin.model.AdminModel;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepository {
    @Autowired
    private AdminCrudRepository adminCrudRepository;
    
     public List<AdminModel> getAllAdminModels(){
        return (List<AdminModel>) adminCrudRepository.findAll();
    }

    public Optional<AdminModel> getCabinById(Integer idAdmin){
        return  adminCrudRepository.findById(idAdmin);
   }
   
    public AdminModel save(AdminModel adminModel){
        return adminCrudRepository.save(adminModel);
    }
    
    public AdminModel update(AdminModel adminModel){
        return adminCrudRepository.save(adminModel);
    }
    
    public boolean delete(Integer idModel){
        adminCrudRepository.deleteById(idModel);
        return true;
    }
    
}
