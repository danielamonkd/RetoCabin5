
package com.ProyectCabin.repository;


import com.ProyectCabin.model.MessagesModel;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessagesRepository {
    @Autowired
    
    private MessagesCrudRepository messagesCrudRepository;
    
     public List<MessagesModel> getAllMessagesModels(){
        return (List<MessagesModel>)messagesCrudRepository.findAll();
    }

    public Optional<MessagesModel> getMessagesById(Integer idMessages){
        return  messagesCrudRepository.findById(idMessages);
   }
   
    public MessagesModel save(MessagesModel messagesModel){
        return messagesCrudRepository.save(messagesModel);
    }
    
    public MessagesModel update(MessagesModel messagesModel){
        return messagesCrudRepository.save(messagesModel);
    }
    
    public boolean delete(Integer idMessages){
        messagesCrudRepository.deleteById(idMessages);
        return true;
    }
}
