
package com.ProyectCabin.service;


import com.ProyectCabin.model.ClientModel;
import com.ProyectCabin.repository.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    
    public List<ClientModel> getAllClientModels(){
        return clientRepository.getAllClientModel();
    }
    
    public Optional<ClientModel> getClientById(Integer idClient) {
        return clientRepository.getClientById(idClient);
    }
    
    public ClientModel saveClientModel(ClientModel clientModel){
        return clientRepository.save(clientModel);
    }
    
    public boolean deleteClientModel(Integer idClient) {
       return clientRepository.delete(idClient);
}
    public ClientModel update(ClientModel clientModel){
        return clientRepository.update(clientModel);
    }
}
