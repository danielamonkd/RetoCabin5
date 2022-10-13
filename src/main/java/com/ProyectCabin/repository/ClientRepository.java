
package com.ProyectCabin.repository;


import com.ProyectCabin.model.ClientModel;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;
    
     public List<ClientModel> getAllClientModel(){
        return (List<ClientModel>) clientCrudRepository.findAll();
    }

    public Optional<ClientModel> getClientById(Integer idClient){
        return  clientCrudRepository.findById(idClient);
   }
   
    public ClientModel save(ClientModel clientModel){
        return clientCrudRepository.save(clientModel);
    }
    
    public ClientModel update(ClientModel clientModel){
        return clientCrudRepository.save(clientModel);
    }
    
    public boolean delete(Integer idClient){
        clientCrudRepository.deleteById(idClient);
        return true;
    }
}
