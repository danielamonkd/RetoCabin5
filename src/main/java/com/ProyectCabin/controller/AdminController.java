
package com.ProyectCabin.controller;



import com.ProyectCabin.model.AdminModel;
import com.ProyectCabin.service.AdminService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Admin")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AdminController {
    @Autowired private AdminService adminService;

    @GetMapping("/all")
    public List<AdminModel> getAllAdminModels(){
        return adminService.getAllAdminModels();
    }

    @GetMapping("/{id}")
    public Optional<AdminModel> getAdminById(@PathVariable("id") Integer idAdmin) {
        return adminService.getAdminById(idAdmin);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public AdminModel save (@RequestBody AdminModel adminModel){
        adminService.saveAdminModel(adminModel);
        return adminService.saveAdminModel(adminModel);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public AdminModel update(@RequestBody AdminModel adminModel) {
        return adminService.update(adminModel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return adminService.deleteAdminModel(id);
    }
}
