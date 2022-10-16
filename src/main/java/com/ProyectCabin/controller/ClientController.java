
package com.ProyectCabin.controller;


import com.ProyectCabin.model.ClientModel;
import com.ProyectCabin.service.ClientService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ClientController {
    @Autowired private ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> getAllClientModels(){
        return clientService.getAllClientModels();
    }

    @GetMapping("/{id}")
    public Optional<ClientModel> getClientById(@PathVariable("id") Integer id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ClientModel save (@RequestBody ClientModel clientModel){
        clientService.saveClientModel(clientModel);
        return clientService.saveClientModel(clientModel);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public ClientModel update(@RequestBody ClientModel clientModel) {
        return clientService.update(clientModel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return clientService.deleteClientModel(id);
    }
}
