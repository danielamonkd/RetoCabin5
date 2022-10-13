
package com.ProyectCabin.service;


import com.ProyectCabin.model.MessagesModel;
import com.ProyectCabin.repository.MessagesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagesService {
    @Autowired
    private MessagesRepository messagesRepository;
    
    public List<MessagesModel> getAllMessagesModels(){
        return messagesRepository.getAllMessagesModels();
    }
    
    public Optional<MessagesModel> getMessagesById(Integer idMessages) {
        return messagesRepository.getMessagesById(idMessages);
    }
    
    public MessagesModel saveMessagesModel(MessagesModel messagesModel){
        return messagesRepository.save(messagesModel);
    }
    
    public boolean deleteMessagesModel(Integer idMessages) {
       return messagesRepository.delete(idMessages);
}
    public MessagesModel update(MessagesModel messagesModel){
        return messagesRepository.update(messagesModel);
    }
}
