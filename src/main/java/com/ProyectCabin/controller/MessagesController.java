
package com.ProyectCabin.controller;


import com.ProyectCabin.model.MessagesModel;
import com.ProyectCabin.service.MessagesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class MessagesController {
    @Autowired private MessagesService messagesService;

    @GetMapping("/all")
    public List<MessagesModel> getAllMessagesModels(){
        return messagesService.getAllMessagesModels();
    }

    @GetMapping("/{id}")
    public Optional<MessagesModel> getMessagesById(@PathVariable("id") Integer id) {
        return messagesService.getMessagesById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public MessagesModel save (@RequestBody MessagesModel messagesModel){
        messagesService.saveMessagesModel(messagesModel);
        return messagesService.saveMessagesModel(messagesModel);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public MessagesModel update(@RequestBody MessagesModel messagesModel) {
        return messagesService.update(messagesModel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return messagesService.deleteMessagesModel(id);
    }
}
