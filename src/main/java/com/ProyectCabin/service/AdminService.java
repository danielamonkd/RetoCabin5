
package com.ProyectCabin.service;


import com.ProyectCabin.model.AdminModel;
import com.ProyectCabin.repository.AdminRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    
    private AdminRepository adminRepository;
    
    public List<AdminModel> getAllAdminModels(){
        return adminRepository.getAllAdminModels();
    }
    
    public Optional<AdminModel> getAdminById(Integer idAdmin) {
        return adminRepository.getCabinById(idAdmin);
    }
    
    public AdminModel saveAdminModel(AdminModel adminModel){
        return adminRepository.save(adminModel);
    }
    
    public boolean deleteAdminModel(Integer idAdmin) {
       return adminRepository.delete(idAdmin);
}
    public AdminModel update(AdminModel adminModel){
        return adminRepository.update(adminModel);
    }
}
